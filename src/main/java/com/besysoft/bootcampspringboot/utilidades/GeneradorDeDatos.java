package com.besysoft.bootcampspringboot.utilidades;

import com.besysoft.bootcampspringboot.dominio.Genero;
import com.besysoft.bootcampspringboot.dominio.PeliculaOSerie;
import com.besysoft.bootcampspringboot.dominio.Personaje;

import java.util.ArrayList;
import java.util.Date;


public class GeneradorDeDatos {

    public static ArrayList<PeliculaOSerie> crearPeliculasOSeries(){

        ArrayList<PeliculaOSerie> peliculasOSeries = new ArrayList<PeliculaOSerie>();

        PeliculaOSerie peliculaOSerie1 = new PeliculaOSerie("Jumanji", new Date("02/11/95"), 5);
        peliculaOSerie1.setPersonajesAsociados("Robin Williams");
        peliculaOSerie1.setPersonajesAsociados("Kirsten Dunst");
        peliculaOSerie1.setPersonajesAsociados("Bradley Pierce");

        PeliculaOSerie peliculaOSerie2 = new PeliculaOSerie("La Era de Hielo", new Date("10/22/02"), 5);
        peliculaOSerie2.setPersonajesAsociados("John Leguizamo");
        peliculaOSerie2.setPersonajesAsociados("Ray Romano");
        peliculaOSerie2.setPersonajesAsociados("Denis Leary");

        PeliculaOSerie peliculaOSerie3 = new PeliculaOSerie("Zatura", new Date("08/13/05"), 3);
        peliculaOSerie3.setPersonajesAsociados("Jonah Bobo");
        peliculaOSerie3.setPersonajesAsociados("Josh Hutcherson");
        peliculaOSerie3.setPersonajesAsociados("Kristen Stewart");


        peliculasOSeries.add(peliculaOSerie1);
        peliculasOSeries.add(peliculaOSerie2);
        peliculasOSeries.add(peliculaOSerie3);

        return peliculasOSeries;
    }

    public static ArrayList<Personaje> crearPersonajes(){

        ArrayList<Personaje> personajes = new ArrayList<Personaje>();

        Personaje personaje1 = new Personaje("Robin Williams", 38, 75f, "Fue conocido sobre todo por sus actuaciones en películas cómicas tales como Mrs. Doubtfire, Jumanji, Hook, Aladdín, Las aventuras del barón Munchausen, The Birdcage, Night at the Museum, o Happy Feet.");
        personaje1.setPeliculasOSeriesAsociadas("Jumanji");
        personaje1.setPeliculasOSeriesAsociadas("Aladdin");
        personaje1.setPeliculasOSeriesAsociadas("Happy Feet");
        personaje1.setPeliculasOSeriesAsociadas("El Hombre Bicentenario");

        Personaje personaje2 = new Personaje("Kirsten Dunst", 40, 64.3f, "Es una actriz estadounidense-alemana. También ha realizado incursiones como cantante, modelo y productora de cine. Alcanzó la fama internacional con su participación en la trilogía de Spider-Man, en la cual interpretó a Mary Jane Watson, y por su actuación en la primera entrega recibió el Premio Empire a la mejor actriz.");
        personaje2.setPeliculasOSeriesAsociadas("Jumanji");
        personaje2.setPeliculasOSeriesAsociadas("Spider-Man");
        personaje2.setPeliculasOSeriesAsociadas("Mujercitas");

        Personaje personaje3 = new Personaje("Bradley Pierce", 40, 86f, "Entre sus papeles más conocidos están los de Peter Sheperd en Jumanji (1995), junto a Robin Williams y Kirsten Dunst, y el de Los Borrowers (1997), junto a John Goodman.");
        personaje3.setPeliculasOSeriesAsociadas("Jumanji");
        personaje3.setPeliculasOSeriesAsociadas("La Sirenita");
        personaje3.setPeliculasOSeriesAsociadas("Sonic");


        Personaje personaje4 = new Personaje("John Leguizamo", 62, 70.3f, "Es un actor, comediante y productor de cine colombiano nacionalizado estadounidense, conocido por interpretar a Luigi en la película Super Mario Bros. y al gánster Benny Blanco en Carlito's Way, además de ser la voz de Sid en Ice Age.");
        personaje4.setPeliculasOSeriesAsociadas("La Era de Hielo");
        personaje4.setPeliculasOSeriesAsociadas("John Wick");

        Personaje personaje5 = new Personaje("Ray Romano", 65, 72f, "Es un actor y comediante estadounidense, ganador de un Premio Emmy, conocido principalmente por ser el protagonista de la serie cómica Everybody Loves Raymond. También es popular por prestar su voz al mamut Manfred (\"Manny\") en la película Ice Age y su secuelas: Ice Age: The Meltdown, Ice Age: Dawn of the Dinosaurs y Ice Age: Continental Drift.");
        personaje5.setPeliculasOSeriesAsociadas("La Era de Hielo");
        personaje5.setPeliculasOSeriesAsociadas("La Era de Hielo 2");

        Personaje personaje6 = new Personaje("Denis Leary", 65, 77.6f, "Es un comediante, escritor, productor y actor estadounidense nominado al Emmy y Globo de oro. Estudió en el Emerson College de Boston. Ha trabajado en comedia en vivo, varias series de televisión y películas desde 1987, año en que hizo su debut en la película Long Walk to Forever, incluyendo a WILLEM y Small Soldiers y Ice Age (donde hace la voz de Diego).");
        personaje6.setPeliculasOSeriesAsociadas("La Era de Hielo");
        personaje6.setPeliculasOSeriesAsociadas("The Amazing Spider-Man");
        personaje6.setPeliculasOSeriesAsociadas("The Amazing Spider-Man 2");


        Personaje personaje7 = new Personaje("Jonah Bobo", 26, 68f, "Es un actor estadounidense retirado, conocido por su participación en la película Zathura y por haber sido la voz de Austin en la serie infantil The Backyardigans.");
        personaje7.setPeliculasOSeriesAsociadas("Zatura");
        personaje7.setPeliculasOSeriesAsociadas("Crazy, Stupid, Love");

        Personaje personaje8 = new Personaje("Josh Hutcherson", 30, 69.3f, "Es un actor y productor estadounidense, conocido por sus papeles protagónicos como actor infantil en Little Manhattan, Zathura, Bridge to Terabithia, Viaje al centro de la Tierra. Más recientemente coprotagonizó la saga cinematográfica de Los Juegos del Hambre, donde interpretó a Peeta Mellark.");
        personaje8.setPeliculasOSeriesAsociadas("Zatura");
        personaje8.setPeliculasOSeriesAsociadas("El Expreso Polar");
        personaje8.setPeliculasOSeriesAsociadas("Los Juegos del Hambre");
        personaje8.setPeliculasOSeriesAsociadas("Viaje al Centro de la Tierra");

        Personaje personaje9 = new Personaje("Kristen Stewart", 32, 65f, "Es una actriz estadounidense. Ganó notoriedad por primera vez a los doce años por su papel en el thriller La habitación del pánico (2002) de David Fincher. Posteriormente protagonizó Speak (2004), Catch That Kid (2004), Zathura: A Space Adventure (2005) e Into the Wild (2007). Luego alcanzó el estrellato mundial por su papel de Bella Swan en la saga de películas de The Twilight Saga (2008-2012).");
        personaje9.setPeliculasOSeriesAsociadas("Zatura");
        personaje9.setPeliculasOSeriesAsociadas("La habitación del pánico");
        personaje9.setPeliculasOSeriesAsociadas("Crepúsculo");
        personaje9.setPeliculasOSeriesAsociadas("Los mensajeros");

        personajes.add(personaje1);
        personajes.add(personaje2);
        personajes.add(personaje3);
        personajes.add(personaje4);
        personajes.add(personaje5);
        personajes.add(personaje6);
        personajes.add(personaje7);
        personajes.add(personaje8);
        personajes.add(personaje9);

        return personajes;

    }

    public static ArrayList<Genero> crearGeneros() {

        ArrayList<Genero> generos = new ArrayList<Genero>();

        Genero genero1 = new Genero("Terror");
        genero1.setPeliculasOSeriesAsociadas("It");
        genero1.setPeliculasOSeriesAsociadas("Los Mensajeros");
        genero1.setPeliculasOSeriesAsociadas("El Resplandor");

        Genero genero2 = new Genero("Romance");
        genero2.setPeliculasOSeriesAsociadas("Mujercitas");
        genero2.setPeliculasOSeriesAsociadas("Crepúsculo");
        genero2.setPeliculasOSeriesAsociadas("27 Bodas");

        Genero genero3 = new Genero("Aventura");
        genero3.setPeliculasOSeriesAsociadas("Jumanji");
        genero3.setPeliculasOSeriesAsociadas("Viaje al Centro de la Tierra");
        genero3.setPeliculasOSeriesAsociadas("La Era de Hielo");

        generos.add(genero1);
        generos.add(genero2);
        generos.add(genero3);

        return generos;

    }

}
