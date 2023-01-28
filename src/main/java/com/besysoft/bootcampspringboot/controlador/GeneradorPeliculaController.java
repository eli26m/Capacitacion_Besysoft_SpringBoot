package com.besysoft.bootcampspringboot.controlador;

import com.besysoft.bootcampspringboot.dominio.PeliculaOSerie;
import com.besysoft.bootcampspringboot.utilidades.GeneradorDeDatos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Locale;

@RestController
public class GeneradorPeliculaController {

    ArrayList<PeliculaOSerie> peliculasOSeries = new ArrayList<PeliculaOSerie>();

    public void generarPeliculas() {
        peliculasOSeries = GeneradorDeDatos.crearPeliculasOSeries();
    }

    @GetMapping("/peliculas")
    public ArrayList<PeliculaOSerie> getPeliculas() {
        generarPeliculas();
        return peliculasOSeries;
    }

    @GetMapping("/peliculas/{titulo}")
    public ArrayList<PeliculaOSerie> getPeliculaTitulo(@PathVariable String titulo) {
        generarPeliculas();
        ArrayList<PeliculaOSerie> peliculaBuscada = new ArrayList<PeliculaOSerie>();
        for (PeliculaOSerie pelicula : peliculasOSeries) {
            //para que no importe como escribamos el titulo, y eliminar los espacios
            titulo = titulo.toLowerCase();
            String tituloMod = pelicula.getTitulo().toLowerCase();
            tituloMod = tituloMod.replace(" ", "");

            if(tituloMod.contains(titulo)) {
                peliculaBuscada.add(pelicula);
            }
        }

        return peliculaBuscada;
    }

}
