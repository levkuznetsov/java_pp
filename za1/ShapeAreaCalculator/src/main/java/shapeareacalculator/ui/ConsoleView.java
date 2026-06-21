package ui;

import java.util.Scanner;

public class ConsoleView {
    private final Scanner sc;

    public ConsoleView(Scanner sc) {
        this.sc = sc;
    }

    public double getUserChoice(String prompt) {
        IO.println(prompt);
        return Double.parseDouble(getInput().replace(',', '.'));
    }

    public void showMenu() {
        IO.println("Введите номер фигуры или exit для выхода:");
        IO.println("1. Круг");
        IO.println("2. Квадрат");
        IO.println("3. Прямоугольник");
    }

    public String getInput() {
        IO.print("> ");
        return sc.nextLine().trim();
    }
}