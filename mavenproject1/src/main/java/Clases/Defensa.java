/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

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
