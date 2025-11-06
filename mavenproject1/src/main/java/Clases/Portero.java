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
public class Portero extends JugadorFutbol {

    private static final String[] FRASES = {
            "vuela y ataja un disparo a ras de piso",
            "ordena la defensa y pide calma desde el arco",
            "sale rapido y corta un mano a mano",
            "bloquea con reflejos felinos y evita el gol"
    };

    public Portero(String nombre, String equipo) {
        super(nombre, equipo);
    }

    @Override
    public String generarMensaje() {
        Random r = new Random();
        return "[Equipo: " + equipo + "] " + nombre + " " + FRASES[r.nextInt(FRASES.length)];
    }
    
}
