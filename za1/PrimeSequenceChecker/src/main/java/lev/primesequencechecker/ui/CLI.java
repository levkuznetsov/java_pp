package ui;

import service.PrimeSequenceService;
import java.util.Scanner;

public class CLI implements Starter {
    private final Scanner sc;
    private final PrimeSequenceService primeSequenceService;

    public CLI(Scanner sc, PrimeSequenceService primeSequenceService) {
        this.sc = sc;
        this.primeSequenceService = primeSequenceService;
    }

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
            IO.println("Простые числа в последовательности: " + primeSequenceService.getResult(inputNum));
        }
    }
}