package com.mslai.bernal_prueba_tecnica.model.entitie;

import jakarta.validation.constraints.NotBlank;

public class SolicitudTipoCambio {

    @NotBlank
    private String monedaOrigen;

    @NotBlank
    private String monedaDestino;

    private double monedaOriginal;

    public SolicitudTipoCambio() {
    }

    public SolicitudTipoCambio(String monedaOrigen, String monedaDestino, double monedaOriginal) {
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.monedaOriginal = monedaOriginal;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public String getMonedaDestino() {
        return monedaDestino;
    }

    public void setMonedaDestino(String monedaDestino) {
        this.monedaDestino = monedaDestino;
    }

    public double getMonedaOriginal() {
        return monedaOriginal;
    }

    public void setMonedaOriginal(double monedaOriginal) {
        this.monedaOriginal = monedaOriginal;
    }
}
