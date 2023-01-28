package com.besysoft.bootcampspringboot.controlador;

import com.besysoft.bootcampspringboot.dominio.PeliculaOSerie;
import com.besysoft.bootcampspringboot.dominio.Personaje;
import com.besysoft.bootcampspringboot.utilidades.GeneradorDeDatos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class GeneradorPersonajeController {

    ArrayList<Personaje> personajes = new ArrayList<Personaje>();

    public void generarPersonajes() {
        personajes = GeneradorDeDatos.crearPersonajes();
    }

    @GetMapping("/personajes")
    public ArrayList<Personaje> getPersonajes() {
        generarPersonajes();
        return personajes;
    }

    @GetMapping("/personajes/{nombre}")
    public ArrayList<Personaje> getPersonajeNombre(@PathVariable String nombre) {
        generarPersonajes();
        ArrayList<Personaje> personajeBuscado = new ArrayList<Personaje>();
        for (Personaje personaje : personajes) {
            //para que no importe como escribamos el nombre, y eliminar el espacio entre el nombre y el apellido
            nombre = nombre.toLowerCase();
            String nombreMod = personaje.getNombre().toLowerCase();
            nombreMod = nombreMod.replace(" ", "");

            if(nombreMod.contains(nombre)) {
                personajeBuscado.add(personaje);
            }
        }

        return personajeBuscado;
    }

    @GetMapping("/personajes/edad/{edad}")
    public ArrayList<Personaje> getPersonajeEdad(@PathVariable Integer edad) {
        generarPersonajes();
        ArrayList<Personaje> personajeBuscado = new ArrayList<Personaje>();
        for (Personaje personaje : personajes) {
            if(personaje.getEdad() == edad) {
                personajeBuscado.add(personaje);
            }
        }

        return personajeBuscado;
    }

}
