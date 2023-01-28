package com.besysoft.bootcampspringboot.controlador;

import com.besysoft.bootcampspringboot.dominio.Genero;
import com.besysoft.bootcampspringboot.dominio.PeliculaOSerie;
import com.besysoft.bootcampspringboot.utilidades.GeneradorDeDatos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GeneradorGeneroController {

    ArrayList<Genero> generos = new ArrayList<Genero>();
    public void generarGeneros() {
        generos = GeneradorDeDatos.crearGeneros();
    }

    @GetMapping("peliculas/genero/{genero}")
    public ArrayList<String> getPeliculasGenero(@PathVariable String genero) {
        generarGeneros();
        ArrayList<String> peliculas = new ArrayList<String>();
        for (Genero gen : generos) {
            if(gen.getNombre().equalsIgnoreCase(genero)) {
                peliculas.addAll(gen.getPeliculasOSeriesAsociadas());
            }
        }
        return peliculas;
    }

}
