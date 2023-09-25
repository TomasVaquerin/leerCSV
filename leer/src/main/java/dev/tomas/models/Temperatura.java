package dev.tomas.models;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

public class Temperatura {

    private String localidad;
    private String provincia;
    private double tempMax;
    private LocalTime hsTempMax;
    private double tempMin;
    private LocalTime hsTempMin;
    private double precipitacion;

    public Temperatura() {
        this.localidad = "";
        this.provincia = "";
        this.tempMax = 0.0;
        this.hsTempMax = LocalTime.now();
        this.tempMin = 0.0;
        this.hsTempMin = LocalTime.now();
        this.precipitacion = 0.0;
    }

    public Temperatura(String localidad, String provincia, double tempMax, LocalTime hsTempMax, double tempMin, LocalTime hsTempMin, double precipitacion) {
        this.localidad = localidad;
        this.provincia = provincia;
        this.tempMax = tempMax;
        this.hsTempMax = hsTempMax;
        this.tempMin = tempMin;
        this.hsTempMin = hsTempMin;
        this.precipitacion = precipitacion;
    }

    @Override
    public String toString() {
        return "Temperatura{" +
                "localidad='" + localidad + '\'' +
                ", provincia='" + provincia + '\'' +
                ", tempMax=" + tempMax +
                ", hsTempMax=" + hsTempMax +
                ", tempMin=" + tempMin +
                ", hsTempMin=" + hsTempMin +
                ", precision=" + precipitacion +
                '}';
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public LocalTime getHsTempMax() {
        return hsTempMax;
    }

    public void setHsTempMax(LocalTime hsTempMax) {
        this.hsTempMax = hsTempMax;
    }

    public double getTempMin() {
        return tempMin;
    }

    public void setTempMin(double tempMin) {
        this.tempMin = tempMin;
    }

    public LocalTime getHsTempMin() {
        return hsTempMin;
    }

    public void setHsTempMin(LocalTime hsTempMin) {
        this.hsTempMin = hsTempMin;
    }

    public double getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(double precipitacion) {
        this.precipitacion = precipitacion;
    }
}