import service.PrimeSequenceService;
import ui.CLI;
import ui.Starter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Starter starter = new CLI(new Scanner(System.in), new PrimeSequenceService());
        starter.run();
    }
}