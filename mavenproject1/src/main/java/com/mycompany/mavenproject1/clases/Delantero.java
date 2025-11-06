
package com.mycompany.mavenproject1.clases;

import com.mycompany.mavenproject1.clases.JugadorFutbol;
import java.util.Random;

/**
 *
 * @author Maytan
 */
public class Delantero extends JugadorFutbol {

    private static final String[] FRASES = {
            "se desmarca y define cruzado.",
            "controla de espaldas y asiste al compañero.",
            "prueba de media distancia y casi anota.",
            "gana la posición y remata de primera."
    };

    public Delantero(String nombre, String equipo) {
        super(nombre, equipo);
    }

    @Override
    public String generarMensaje() {
        Random r = new Random();
        return "[Equipo: " + equipo + "] " + nombre + " " + FRASES[r.nextInt(FRASES.length)];
    }
    
}
