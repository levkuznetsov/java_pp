package service;

import dto.TextAnalyzeResult;

public class TextAnalyzeService {
    private static final String ONE_LETTER_WORDS = "явкосуиабэ";

    public TextAnalyzeResult analyzeText(String text) {
        int words_num = 0;
        int letters_num = 0;
        int punct_num = 0;
        int space_num = 0;

        boolean inWord = false;
        StringBuilder currentWord = new StringBuilder();

        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                letters_num++;
                currentWord.append(c);
                inWord = true;
            } else if (c == ' ') {
                space_num++;
                if (inWord) {
                    if (currentWord.length() != 1 || ONE_LETTER_WORDS.contains(currentWord.toString())) {
                        words_num++;
                    }
                    inWord = false;
                    currentWord = new StringBuilder();
                }
            } else {
                punct_num++;
                if (inWord) {
                    if (currentWord.length() != 1 || ONE_LETTER_WORDS.contains(currentWord.toString())) {
                        words_num++;
                    }
                    inWord = false;
                    currentWord = new StringBuilder();
                }
            }
        }

        if (inWord) {
            if (currentWord.length() != 1 || ONE_LETTER_WORDS.contains(currentWord.toString())) {
                words_num++;
            }
        }

        return new TextAnalyzeResult(words_num, letters_num, punct_num, space_num);
    }
}