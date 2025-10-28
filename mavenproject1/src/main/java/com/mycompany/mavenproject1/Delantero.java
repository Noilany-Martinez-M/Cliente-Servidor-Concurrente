/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

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

    public Delantero(int id, String nombre, String equipo) {
        super(id, nombre, equipo);
    }

    @Override
    public String generarMensaje() {
        Random r = new Random();
        return "[Equipo: " + equipo + "] " + nombre + " " + FRASES[r.nextInt(FRASES.length)];
    }
    
}
