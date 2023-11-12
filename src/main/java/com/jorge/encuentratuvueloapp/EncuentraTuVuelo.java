package com.jorge.encuentratuvueloapp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EncuentraTuVuelo {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        List<Vuelo> vuelos = new ArrayList<>();

        vuelos.add(new Vuelo("AAL 933", "New York", "Santiago",
                dateFormat.parse("26/08/2021 05:39:00"), 62));
        vuelos.add(new Vuelo("LAT755", "Sao Paulo", "Santiago",
                dateFormat.parse("31/08/2021 04:45:00"), 47));
        vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago",
                dateFormat.parse("30/08/2021 16:00:00"), 52));
        vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago",
                dateFormat.parse("29/08/2021 13:22:00"), 59));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago",
                dateFormat.parse("31/08/2021 14:05:00"), 25));
        vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago",
                dateFormat.parse("31/08/2021 05:20:00"), 29));
        vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago",
                dateFormat.parse("30/08/2021 08:45:00"), 55));
        vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago",
                dateFormat.parse("29/08/2021 07:41:00"), 51));
        vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago",
                dateFormat.parse("30/08/2021 10:35:00"), 48));
        vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago",
                dateFormat.parse("29/08/2021 09:14:00"), 59));
        vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago",
                dateFormat.parse("31/08/2021 08:33:00"), 31));
        vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago",
                dateFormat.parse("31/08/2021 15:15:00"), 29));
        vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago",
                dateFormat.parse("30/08/2021 08:14:00"), 47));
        vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago",
                dateFormat.parse("29/08/2021 22:53:00"), 60));
        vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago",
                dateFormat.parse("31/08/2021 09:57:00"), 32));
        vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago",
                dateFormat.parse("31/08/2021 04:00:00"), 35));
        vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago",
                dateFormat.parse("29/08/2021 07:45:00"), 61));
        vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago",
                dateFormat.parse("30/08/2021 07:12:00"), 58));
        vuelos.add(new Vuelo("LAT 501", "París", "Santiago",
                dateFormat.parse("29/08/2021 18:29:00"), 49));
        vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago",
                dateFormat.parse("30/08/2021 15:45:00"), 39));

        vuelos.sort(Comparator.comparing(Vuelo::getFechaDeLlegada));
        Vuelo ultimoVuelo = vuelos.get(vuelos.size() - 1);
        System.out.println("El último vuelo en llegar fue " + ultimoVuelo.getNombre()
                + ": " + ultimoVuelo.getOrigen() + ", "
                + "el cual aterrizó el " + dateFormat.format(ultimoVuelo.getFechaDeLlegada()) + ".");

        vuelos.sort(Comparator.comparing(Vuelo::getNumeroDePasajeros));
        System.out.println("El vuelo con menor número de pasajeros es "
                + vuelos.get(0).getNombre() + ": " + vuelos.get(0).getOrigen()
                + ", con " + vuelos.get(0).getNumeroDePasajeros() + " pasajeros.");
    }
}