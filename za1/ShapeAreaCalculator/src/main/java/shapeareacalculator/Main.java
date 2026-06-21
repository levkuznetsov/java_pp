import service.ShapeAreaService;
import ui.CLI;
import ui.Starter;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);

    void main() {
        Starter starter = new CLI(sc, new ShapeAreaService());
        starter.run();
        sc.close();
    }
}