package lev.numberanalyzeservice.ui;

import java.util.Scanner;

import lev.numberanalyzeservice.service.NumberAnalyzeService;
import lev.numberanalyzeservice.utils.*;

public class CLI implements Starter {
    Scanner sc = new Scanner(System.in);
    NumberAnalyzeService nas = new NumberAnalyzeService();
    NumberUtils numberUtils = new NumberUtils();

    @Override
    public void run() {

        while (true) {
            System.out.println("Введите число или exit для выхода.");
            System.out.print("> ");
            String strNum = sc.nextLine();

            if (strNum.equals("exit")) {
                break;
            }

            if (!numberUtils.isCreatable(strNum)) {
                System.out.println("Неправильный формат числа.");
                System.out.println();
                continue;
            }

            System.out.println("---ИНФОРМАЦИЯ О ДАННОМ ЧИСЛЕ---");

            double num = Double.parseDouble(strNum);
            boolean isDouble = nas.isDouble(strNum);

            if (num == 0) {
                System.out.println("Число является нулём, проверка на положительность бесполезна.");
            }

            if (nas.isPositive(num)) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }

            if (isDouble) {
                System.out.println("Число нечётное");
            }
            else{
                if (num % 2 == 0) {
                    System.out.println("Число чётное");
                }
                System.out.println("Число нечётное");
            }
            System.out.println("Число не простое");
            System.out.println("Число дробное");
            System.out.println("Квадрат данного числа составляет " + nas.square(num));

            if (num >= 0) {
                System.out.println("Корень данного числа составляет " + nas.sqrt(num));
            } else {
                System.out.println("Число является отрицательным, поиск корня бесполезен");
            }

            System.out.println("---НАЖМИТЕ ENTER ЧТОБЫ ПРОДОЛЖИТЬ---");
            sc.nextLine();
        }
        sc.close();
    }
}