package lev.framework;

import java.util.Scanner;
import lev.framework.utils.*;

public class CLI implements Starter {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        NumberAnalyzeService nas = new NumberAnalyzeService();

        while (true) {
            System.out.println("Введите число или exit для выхода.");
            System.out.print("> ");
            String strNum = sc.nextLine();

            if (strNum.equals("exit")) {
                break;
            }

            if (!NumberUtils.isCreatable(strNum)) {
                System.out.println("Введено неверное число!");
                System.out.println();
                continue;
            }

            System.out.println("---ИНФОРМАЦИЯ О ДАННОМ ЧИСЛЕ---");

            boolean isDouble = nas.isDouble(strNum);

            if (isDouble) {
                double num = Double.parseDouble(strNum);

                if (num == 0) {
                    System.out.println("Число является нулём, проверка на положительность бесполезна.");
                }

                if (nas.isPositive(num)) {
                    System.out.println("Число положительное");
                } else {
                    System.out.println("Число отрицательное");
                }

                System.out.println("Число является дробью, проверка на чётное/нечётное бесполезна");
                System.out.println("Число не простое");
                System.out.println("Число дробное");
                System.out.println("Квадрат данного числа составляет " + nas.square(num));

                if (num >= 0) {
                    System.out.println("Корень данного числа составляет " + nas.sqrt(num));
                } else {
                    System.out.println("Число является отрицательным, поиск корня бесполезен");
                }

            } else {
                int num = Integer.parseInt(strNum);

                if (num == 0) {
                    System.out.println("Число является нулём, проверка на положительность бесполезна.");
                }

                if (nas.isPositive(num)) {
                    System.out.println("Число положительное");
                } else {
                    System.out.println("Число отрицательное");
                }

                if (nas.isEven(num)) {
                    System.out.println("Число чётное");
                } else {
                    System.out.println("Число нечётное");
                }

                if (nas.isPrime(num)) {
                    System.out.println("Число простое");
                } else {
                    System.out.println("Число не простое");
                }

                System.out.println("Число не дробное");

                System.out.println("Квадрат данного числа составляет " + nas.square(num));

                if (num >= 0) {
                    System.out.println("Корень данного числа составляет " + nas.sqrt(num));
                } else {
                    System.out.println("Число является отрицательным, поиск корня бесполезен");
                }
            }

            System.out.println("---НАЖМИТЕ ENTER ЧТОБЫ ПРОДОЛЖИТЬ---");
            sc.nextLine();
        }
    }
}