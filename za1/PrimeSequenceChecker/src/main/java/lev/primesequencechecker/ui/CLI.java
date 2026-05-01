package ui;

import service.Service;
import java.util.Scanner;

public class CLI implements Starter {
    String EXIT_COMMAND = "exit";
    Scanner sc = new Scanner(System.in);
    Service service = new Service();

    @Override
    public void run() {
        while (true) {
            IO.println("Введите число или %s для выхода:".formatted(EXIT_COMMAND));
            IO.print("> ");
            String input = sc.nextLine();
            if (input.equals(EXIT_COMMAND)) {
                break;
            }

            int inputNum = Integer.parseInt(input);

            IO.println(service.randomQueue(inputNum));
            IO.println("Простые числа в последовательности: " + service.getResult(inputNum));
        }
    }
}