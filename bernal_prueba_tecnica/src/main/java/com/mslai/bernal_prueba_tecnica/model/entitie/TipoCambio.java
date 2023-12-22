package com.mslai.bernal_prueba_tecnica.model.entitie;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "moneda")
public class TipoCambio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String monedaOrigen;

    @NotBlank
    private String monedaDestino;

    private double montoOriginal;
    private double montoConvertido;
    private double tipoCambio;

    public TipoCambio() {
    }

    public TipoCambio(int id, String monedaOrigen, String monedaDestino, double montoOriginal, double montoConvertido, double tipoCambio) {
        this.id = id;
        this.monedaOrigen = monedaOrigen;
        this.monedaDestino = monedaDestino;
        this.montoOriginal = montoOriginal;
        this.montoConvertido = montoConvertido;
        this.tipoCambio = tipoCambio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getMontoOriginal() {
        return montoOriginal;
    }

    public void setMontoOriginal(double montoOriginal) {
        this.montoOriginal = montoOriginal;
    }

    public double getMontoConvertido() {
        return montoConvertido;
    }

    public void setMontoConvertido(double montoConvertido) {
        this.montoConvertido = montoConvertido;
    }

    public double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }
}
