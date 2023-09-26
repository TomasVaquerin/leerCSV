package dev.tomas;

import dev.tomas.controllers.FindRoute;
import dev.tomas.controllers.LoadManager;

public class Main {

    public static void main(String[] args) {

        LoadManager lf = new LoadManager();
        lf.nombreFicheros();
        lf.climas.forEach(System.out::println);
    }
}