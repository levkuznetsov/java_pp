package ui;

import figure.impl.Circle;
import figure.impl.Rectangle;
import figure.impl.Square;
import service.ShapeAreaService;

import java.util.Scanner;

public class CLI implements Starter {
    private final ConsoleView view;
    private final ShapeAreaService service;

    public CLI(Scanner sc, ShapeAreaService service) {
        this.view = new ConsoleView(sc, service);
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
                switch (input) {
                    case "1" -> handleCircle();
                    case "2" -> handleSquare();
                    case "3" -> handleRectangle();
                    default -> IO.println("Введен неправильный выбор.");
                }
            } catch (NumberFormatException e) {
                IO.println("Пожалуйста, введите корректное число.");
            }
        }
    }

    private void handleCircle() {
        double radius = view.getUserChoice("Введите радиус круга:");
        IO.println("Площадь круга = " + service.formatArea(
                service.countArea(Circle.of(radius))
        ));
    }

    private void handleSquare() {
        double length = view.getUserChoice("Введите длину стороны квадрата:");
        IO.println("Площадь квадрата = " + service.formatArea(
                service.countArea(Square.of(length))
        ));
    }

    private void handleRectangle() {
        double width = view.getUserChoice("Введите ширину прямоугольника:");
        double rectLength = view.getUserChoice("Введите длину прямоугольника:");
        IO.println("Площадь прямоугольника = " + service.formatArea(
                service.countArea(Rectangle.of(width, rectLength))
        ));
    }
}