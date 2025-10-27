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
public class Mediocampo extends Jugador {

    private static final String[] FRASES = {
            "CAMBIA DE RITMO Y HACE MAS PASES",
            "RECUPERA EL BALON Y LA PASA",
            "HACE PASE PERO NO LA RECIBE NADIE",
            "HACE PASE PARA TIRO Y FALLAN."
    };

    public Mediocampo(int id, String nombre, String equipo) {
        super(id, nombre, equipo);
    }

    @Override
    public String generarMensaje() {
        Random r = new Random();
        return "[Equipo: " + equipo + "] " + nombre + " " + FRASES[r.nextInt(FRASES.length)];
    }
}
