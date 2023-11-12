package com.jorge.encuentratuvueloapp;

import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaDeLlegada;
    private Integer numeroDePasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fechaDeLlegada, Integer numeroDePasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaDeLlegada = fechaDeLlegada;
        this.numeroDePasajeros = numeroDePasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public Integer getNumeroDePasajeros() {
        return numeroDePasajeros;
    }
}
