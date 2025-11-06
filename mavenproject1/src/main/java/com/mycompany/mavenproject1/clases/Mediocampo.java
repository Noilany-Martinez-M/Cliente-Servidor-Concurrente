/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.clases;

import java.util.Random;

/**
 *
 * @author Maytan
 */
public class Mediocampo extends JugadorFutbol {

    private static final String[] FRASES = {
            "cambia de ritmo y distribuye el juego",
            "recupera y lanza un pase entre lineas",
            "toca y mueve para dar salida",
            "presiona alta y fuerza el error"
    };

    public Mediocampo(String nombre, String equipo) {
        super(nombre, equipo);
    }


    @Override
    public String generarMensaje() {
        Random r = new Random();
        return "[Equipo: " + equipo + "] " + nombre + " " + FRASES[r.nextInt(FRASES.length)];
    }
}
