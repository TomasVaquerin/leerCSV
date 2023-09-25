package dev.tomas.controllers;

import lombok.Data;


public class NameFiles {



    static String nameFolder = "data";
    static String[] nombresArchivos = {"1.csv", "2.csv", "3.csv"};

    public String getNameFolder() {
        return nameFolder;
    }

    public void setNameFolder(String nameFolder) {
        this.nameFolder = nameFolder;
    }

    public String[] getNombresArchivos() {
        return nombresArchivos;
    }

    public void setNombresArchivos(String[] nombresArchivos) {
        this.nombresArchivos = nombresArchivos;
    }
}
