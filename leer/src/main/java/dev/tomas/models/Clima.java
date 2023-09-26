package dev.tomas.models;

import java.util.ArrayList;
import java.util.Calendar;

public class Clima {
    public ArrayList<Temperatura> temperaturas = new ArrayList<>();

    @Override
    public String toString() {
        return "Clima{" +
                "temperaturas=" + temperaturas +
                '}';
    }
}
