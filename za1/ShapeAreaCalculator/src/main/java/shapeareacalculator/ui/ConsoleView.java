package ui;

import service.ShapeAreaService;

import java.util.Scanner;

public class ConsoleView {
    private final Scanner sc;
    private final ShapeAreaService shapeAreaService;

    public ConsoleView(Scanner sc, ShapeAreaService service) {
        this.sc = sc;
        this.shapeAreaService = service;
    }

    public double getUserChoice(String prompt) {
        IO.println(prompt);
        return shapeAreaService.formatArea(getInput());
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