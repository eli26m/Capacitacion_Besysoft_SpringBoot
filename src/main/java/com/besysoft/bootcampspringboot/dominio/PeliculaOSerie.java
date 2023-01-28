package com.besysoft.bootcampspringboot.dominio;

import java.util.ArrayList;
import java.util.Date;

public class PeliculaOSerie {
    private String titulo;
    private Date fechaCreacion;
    private Integer calificacion;
    private ArrayList<String> personajesAsociados;

    public PeliculaOSerie() {
    }

    public PeliculaOSerie(String titulo, Date fechaCreacion, Integer calificacion) {
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
        this.personajesAsociados = new ArrayList<String>();
    }

    @Override
    public String toString() {
        return "PeliculaOSerie{" +
                "titulo='" + titulo + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                ", calificacion=" + calificacion +
                ", personajesAsociados=" + personajesAsociados +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public ArrayList<String> getPersonajesAsociados() {
        return personajesAsociados;
    }

    public void setPersonajesAsociados(String personaje) {
       this.personajesAsociados.add(personaje);
    }
}
