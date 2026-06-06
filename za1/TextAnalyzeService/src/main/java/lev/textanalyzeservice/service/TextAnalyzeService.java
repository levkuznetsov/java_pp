package service;

public class TextAnalyzeService {
    public record TextAnalyzeResult(int words_num, int letters_num, int punct_num, int space_num) { }

    public TextAnalyzeResult analyzeText(String text) {
        int words_num = 0;
        int letters_num = 0;
        int punct_num = 0;
        int space_num = 0;

        boolean lastSpace = true;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if (lastSpace) {
                    words_num++;
                }
                letters_num++;
                lastSpace = false;
            } else if (c == ' ') {
                if (!lastSpace) {
                    space_num++;
                    lastSpace = true;
                }
            } else {
                punct_num++;
                lastSpace = false;
            }
        }

        return new TextAnalyzeResult(words_num, letters_num, punct_num, space_num);
    }
}