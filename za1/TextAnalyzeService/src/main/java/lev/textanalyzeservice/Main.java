import service.TextAnalyzeService;
import ui.CLI;
import ui.Starter;

import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Starter starter = new CLI(sc, new TextAnalyzeService());
        starter.run();
        sc.close();
    }
}