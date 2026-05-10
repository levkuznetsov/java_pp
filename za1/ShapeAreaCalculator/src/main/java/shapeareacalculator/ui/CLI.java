package ui;

import figure.impl.Circle;
import figure.impl.Rectangle;
import figure.impl.Square;
import service.ShapeAreaService;

import java.util.Scanner;

public class CLI implements Starter {
    Scanner sc = new Scanner(System.in);
    ShapeAreaService service = new ShapeAreaService();

    @Override
    public void run() {
        while (true) {
            IO.println("Введите номер фигуры или exit для выхода:");
            IO.println("1. Круг");
            IO.println("2. Квадрат");
            IO.println("3. Прямоугольник");
            IO.print("> ");
            String input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                switch (input) {
                    case "1":
                        IO.println("Введите радиус круга:");
                        IO.print("> ");
                        double radius = format(sc.nextLine());
                        circleSelect(radius);
                        break;
                    case "2":
                        IO.println("Введите длину стороны квадрата:");
                        IO.print("> ");
                        double length = format(sc.nextLine());
                        squareSelect(length);
                        break;
                    case "3":
                        IO.println("Введите ширину прямоугольника:");
                        IO.print("> ");
                        double width = format(sc.nextLine());

                        IO.println("Введите длину прямоугольника:");
                        IO.print("> ");
                        double rectLength = format(sc.nextLine());

                        rectangleSelect(width, rectLength);
                        break;
                    default:
                        IO.println("Введен неправильный выбор.");
                }
                } catch (Exception e) {
                IO.println("Пожалуйста, введите корректное число.");
            }
        }
        sc.close();
    }

    private void circleSelect(double radius) {
        IO.println("Площадь круга = " + service.formatArea(
                service.countArea(
                        new Circle(radius))
        ));
    }

    private void squareSelect(double length) {
        IO.println("Площадь квадрата = " + service.formatArea(
                service.countArea(
                        new Square(length)
                )
        ));
    }

    private void rectangleSelect(double width, double length) {
        IO.println("Площадь прямоугольника = " + service.formatArea(
                service.countArea(
                        new Rectangle(width, length))
        ));
    }

    private double format(String s){
        return Double.parseDouble(s.replace(',', '.').strip());
    }
}