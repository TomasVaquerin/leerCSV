package dev.tomas.service;

import dev.tomas.controllers.LoadManager;
import dev.tomas.models.Temperatura;

public class Manager {

    void create(Temperatura temperatura){
        LoadManager lf = new LoadManager();
        lf.climas.clima.add(temperatura);
    }

    void read(){
        LoadManager lf = new LoadManager();
    }

    void update(Temperatura temperatura, int index){
        LoadManager lf = new LoadManager();
        lf.climas.get(index).temperaturas.add(temperatura);
    }



    void delete() {
        LoadManager lf = new LoadManager();
        lf.climas.f

    }

}