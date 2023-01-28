package com.besysoft.bootcampspringboot.dominio;

import java.util.ArrayList;

public class Personaje {

    private String nombre;
    private Integer edad;
    private Float peso;
    private String historia;
    private ArrayList<String> peliculasOSeriesAsociadas;

    public Personaje() {
    }

    public Personaje(String nombre, Integer edad, Float peso, String historia) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peliculasOSeriesAsociadas = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", historia='" + historia + '\'' +
                ", peliculasOSeriesAsociadas=" + peliculasOSeriesAsociadas +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public ArrayList<String> getPeliculasOSeriesAsociadas() {
        return peliculasOSeriesAsociadas;
    }

    public void setPeliculasOSeriesAsociadas(String peliculaOSerie) {
        this.peliculasOSeriesAsociadas.add(peliculaOSerie);
    }
}
