package dev.tomas.controllers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class LoadFile {

    public FindRoute fr;
    public LoadFile(FindRoute fr) {
        this.fr = fr;
    }

    public void nombreFicheros() {
        ArrayList<String> rutas = fr.getRutasArchivos();

        for(String i : rutas){
            LeerFichero(i);
        }
    }


    public void LeerFichero(String rutaDelArchivo) {

        try (Stream<String> lines = Files.lines(Paths.get(rutaDelArchivo))) {

        } catch (IOException e) {
           // e.printStackTrace();
        }
    }
}
