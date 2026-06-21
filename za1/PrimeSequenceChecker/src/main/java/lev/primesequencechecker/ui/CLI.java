package ui;

import service.PrimeSequenceService;
import java.util.Scanner;

public class CLI implements Starter {
    Scanner sc = new Scanner(System.in);
    PrimeSequenceService primeSequenceService = new PrimeSequenceService();

    @Override
    public void run() {
        while (true) {
            IO.println("Введите число или exit для выхода:");
            IO.print("> ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }

            int inputNum = Integer.parseInt(input);

            IO.println(primeSequenceService.randomQueue(inputNum));
            IO.println("Простые числа в последовательности: " + primeSequenceService.getResult(inputNum));
        }
    }
}