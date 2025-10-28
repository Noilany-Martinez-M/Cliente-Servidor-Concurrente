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
public class Portero extends JugadorFutbol {

    private static final String[] FRASES = {
            "   SALTA Y ATAJA UN TIRO DE ESQUINA",
            "ORDENA A LA DEFENSA Y SE PREPARA PARA EL TIRO",
            "ATAJA UN PENAL",
            "BLOQUEA OTRO TIRO Y EVITA EL GOL."
    };

    public Portero(int id, String nombre, String equipo) {
        super(id, nombre, equipo);
    }

    @Override
    public String generarMensaje() {
        Random r = new Random();
        return "[Equipo: " + equipo + "] " + nombre + " " + FRASES[r.nextInt(FRASES.length)];
    }
    
}
