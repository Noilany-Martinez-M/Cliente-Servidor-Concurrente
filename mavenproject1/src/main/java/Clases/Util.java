/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Maytan
 */
public class Util {
    public static ArrayList<JugadorFutbol> listaJugadores = new ArrayList<>();
    public static ArrayList<Equipo> listaEquipo = new ArrayList<>();
    
    public static int generarIdJugador(){
        return listaJugadores.size()+1;
    }
    
    public static int generarIdEquipo(){
        return listaEquipo.size() +1;
    }
    
}
