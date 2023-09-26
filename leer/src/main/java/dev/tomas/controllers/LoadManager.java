package dev.tomas.controllers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.tomas.models.Clima;
import dev.tomas.models.Temperatura;

public class LoadManager {

    private static LoadManager instance;
    public FindRoute fr;
    public ArrayList<Clima>climas = new ArrayList<>();

    public LoadManager() {
        fr = FindRoute.getInstance();
    }

    public static LoadManager getInstance() {
        if (instance == null) {
            instance = new LoadManager();
        }
        return instance;
    }

    public void nombreFicheros() {
        ArrayList<String> rutas = fr.getRutasArchivos();

        for (String i : rutas) {
            LeerFichero(i);
        }
    }


    public void LeerFichero(String rutaDelArchivo) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(rutaDelArchivo), "UTF-8"))) {
            System.out.println("Leyendo el fichero " + rutaDelArchivo);
            Clima clima = new Clima();
            reader.lines().forEach(line -> {
                clima.temperaturas.add(parse(line));
            });
            climas.add(clima);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Temperatura parse(String value){
        String[] values = value.split(";");
        if (values.length != 7) {
            throw new IllegalArgumentException("Invalid CSV data format");
        }

        Temperatura locationData = new Temperatura();
        locationData.setLocalidad(values[0].trim());
        locationData.setProvincia(values[1].trim());
        locationData.setTempMax(Double.parseDouble(values[2].trim()));
        locationData.setHsTempMax(parseTimeWithPatterns(values[3].trim()));
        locationData.setTempMin(Double.parseDouble(values[4].trim()));
        locationData.setHsTempMin(parseTimeWithPatterns(values[5].trim()));
        locationData.setPrecipitacion(Double.parseDouble(values[6].trim()));

        return locationData;
    }

    private LocalTime parseTimeWithPatterns(String timeStr) {
        List<String> patterns = new ArrayList<>(Arrays.asList("H:mm", "h:mm a"));
        for (String pattern : patterns) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
                return LocalTime.parse(timeStr, formatter);
            } catch (DateTimeParseException e) {
                // Continue to the next pattern if parsing fails
            }
        }
        return null; // Return null if parsing with all patterns fails
    }

}
