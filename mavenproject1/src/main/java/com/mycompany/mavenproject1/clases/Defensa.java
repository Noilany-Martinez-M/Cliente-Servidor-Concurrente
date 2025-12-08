
package com.mycompany.mavenproject1.clases;

import com.mycompany.mavenproject1.clases.JugadorFutbol;
import java.util.Random;

/**
 *
 * @author Maytan
 */
public class Defensa extends JugadorFutbol{

    private static final String[] FRASES = {
            "anticipa y roba el balon con limpieza",
            "cierra espacios y despeja con seguridad",
            "gana un choque y mantiene la lineas",
            "corta una contra con una barrida precisa"
    };

    public Defensa(String nombre, String equipo) {
        super(nombre, equipo);
    }

    @Override
    public String generarMensaje() {
        Random r = new Random();
        return "[Equipo: " + equipo + "] " + nombre + " " + FRASES[r.nextInt(FRASES.length)];
    }
    
}
