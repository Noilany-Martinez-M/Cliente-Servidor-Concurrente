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
public class Defensa extends JugadorFutbol{

    private static final String[] FRASES = {
            "ANTICIPA Y SE ROBA EL BALON",
            "CIERRA ESPACIO Y DESPEJA EL BALON",
            "GANA UN BALON",
            "ORGANIZA LA BARRICADA PARA UN TIRO"
    };

    public Defensa(int id, String nombre, String equipo) {
        super(id, nombre, equipo);
    }

    @Override
    public String generarMensaje() {
        Random r = new Random();
        return "[Equipo: " + equipo + "] " + nombre + " " + FRASES[r.nextInt(FRASES.length)];
    }
    
}
