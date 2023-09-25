package dev.tomas.controllers;

import lombok.Data;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class FindRoute {

    private static FindRoute instance;
    // Nombres de los archivos que quieres leer
    private ArrayList<String> rutasArchivos = new ArrayList<>();

    public ArrayList<String> getRutasArchivos() {
        return rutasArchivos;
    }

    public void setRutasArchivos(ArrayList<String> rutasArchivos) {
        this.rutasArchivos = rutasArchivos;
    }

    private FindRoute() {
        route();
    }

    public static FindRoute getInstance() {
        if (instance == null) {
            instance = new FindRoute();
        }
        return instance;
    }


    private ArrayList<String> route(){
        // Obtener la ruta actual
        Path currentRelativePath = Paths.get("");
        String ruta = currentRelativePath.toAbsolutePath().toString();
        String dir = ruta + File.separator + NameFiles.nameFolder;

        // Leer cada archivo
        for (String nombreArchivo : NameFiles.nombresArchivos) {
            String rutaArchivo = dir + File.separator + nombreArchivo;

            File archivo = new File(rutaArchivo);
            if (archivo.exists()){
                rutasArchivos.add(rutaArchivo);
                System.out.println("El archivo : "+ nombreArchivo + " existe " + rutaArchivo);
            }
        }
        return rutasArchivos;
    }
}
