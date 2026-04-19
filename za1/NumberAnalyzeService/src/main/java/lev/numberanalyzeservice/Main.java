package lev.numberanalyzeservice;

import lev.numberanalyzeservice.ui.CLI;

public class Main {
    public static void main(String[] args){
        Starter starter = new CLI();
        starter.run();
    }
}