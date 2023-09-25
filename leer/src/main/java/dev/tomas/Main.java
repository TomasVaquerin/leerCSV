package dev.tomas;

import dev.tomas.controllers.FindRoute;
import dev.tomas.controllers.LoadFile;
import dev.tomas.models.Clima;

public class Main {

    public static void main(String[] args) {

        FindRoute fr = FindRoute.getInstance();
        LoadFile lf = new LoadFile(fr);
        lf.nombreFicheros();
        lf.climas.forEach(System.out::println);
    }
}