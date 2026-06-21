package service;

import ui.ConsoleView;

public class TextAnalyzeService {
    private static final String one_letter_words = "явкосуиабэ";

    public record TextAnalyzeResult(int words_num, int letters_num, int punct_num, int space_num) { }

    public TextAnalyzeResult analyzeText(String text) {
        int words_num = 0;
        int letters_num = 0;
        int punct_num = 0;
        int space_num = 0;

        boolean inWord = false;
        String currentWord = "";

        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetter(c)) {
                letters_num++;
                currentWord += c;
                inWord = true;
            } else if (c == ' ') {
                space_num++;
                if (inWord) {
                    if (currentWord.length() != 1 || one_letter_words.contains(currentWord)) {
                        words_num++;
                    }
                    inWord = false;
                    currentWord = "";
                }
            } else {
                punct_num++;
                if (inWord) {
                    if (currentWord.length() != 1 || one_letter_words.contains(currentWord)) {
                        words_num++;
                    }
                    inWord = false;
                    currentWord = "";
                }
            }
        }

        if (inWord) {
            if (currentWord.length() != 1 || one_letter_words.contains(currentWord)) {
                words_num++;
            }
        }

        return new TextAnalyzeResult(words_num, letters_num, punct_num, space_num);
    }
}