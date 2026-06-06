package ui;

import service.TextAnalyzeService;

import java.util.Arrays;
import java.util.Scanner;

public class CLI implements Starter {
    private final ConsoleView view;
    private final TextAnalyzeService service;

    public CLI(Scanner sc, TextAnalyzeService service) {
        this.view = new ConsoleView(sc);
        this.service = service;
    }

    @Override
    public void run() {

        while (true) {
            view.showMenu();
            String input = view.getInput();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                if (input.equals("1")) {
                    String text = view.getTextInput();

                    TextAnalyzeService.TextAnalyzeResult result = service.analyzeText(text);

                    view.showResults(result.words_num(), result.letters_num(),
                                     result.punct_num(), result.space_num());
                } else {
                    IO.println("Введен неправильный выбор. Попробуйте снова.");
                }
            } catch (Exception e) {
                IO.println("Произошла ошибка: " + e.getMessage());
            }
        }
    }
}