package com.besysoft.bootcampspringboot.dominio;

import java.util.ArrayList;

public class Genero {

    private String nombre;
    private ArrayList<String> peliculasOSeriesAsociadas;

    public Genero() {
    }

    public Genero(String nombre) {
        this.nombre = nombre;
        this.peliculasOSeriesAsociadas = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "Genero{" +
                "nombre='" + nombre + '\'' +
                ", peliculasOSeriesAsociadas=" + peliculasOSeriesAsociadas +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getPeliculasOSeriesAsociadas() {
        return peliculasOSeriesAsociadas;
    }

    public void setPeliculasOSeriesAsociadas(String peliculaOSerie) {
        this.peliculasOSeriesAsociadas.add(peliculaOSerie);
    }

}
