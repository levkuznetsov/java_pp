package ui;

import java.util.Scanner;

public class ConsoleView {
    private final Scanner sc;

    public ConsoleView(Scanner sc) {
        this.sc = sc;
    }

    public String getTextInput() {
        IO.println("Введите строку для анализа:");
        return getInput();
    }

    public void showMenu() {
        IO.println("--- Анализатор текста ---");
        IO.println("1. Ввести текст для анализа");
        IO.println("exit для выхода");
    }

    public void showResults(int words_num, int letters_num, int punct_num, int space_num) {
        IO.println("\n--- Результат анализа ---");
        IO.println("Кол-во слов: " + words_num);
        IO.println("Кол-во букв: " + letters_num);
        IO.println("Кол-во знаков препинания: " + punct_num);
        IO.println("Кол-во пробелов: " + space_num);
    }

    public String getInput() {
        IO.print("> ");
        return sc.nextLine().trim();
    }
}