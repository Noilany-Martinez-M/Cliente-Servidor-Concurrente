/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;


/**
 *
 * @author Maytan
 */
public class Cliente_Servidor_Proyecto {

    public static void main(String[] args) {
        
        //PRUEBA
        JugadorFutbol j1 = new Portero(1, "Carlos", "Heredia");
        JugadorFutbol j2 = new Defensa(2, "Luis", "Alajuela");
        JugadorFutbol j3 = new Mediocampo(3, "Juan", "Heredia");
        JugadorFutbol j4 = new Delantero(4, "Pedro", "Cartago");

        // Crear equipo
        Equipo puntarenas = new Equipo(1, "PUNTARENAS");
        puntarenas.agregarJugador(j1);
        puntarenas.agregarJugador(j2);
        puntarenas.agregarJugador(j3);
        puntarenas.agregarJugador(j4);

        // Probar polimorfismo
        System.out.println(j1.generarMensaje());
        System.out.println(j2.generarMensaje());
        System.out.println(j3.generarMensaje());
        System.out.println(j4.generarMensaje());

        // Ver cantidad de jugadores
        System.out.println("Cantidad de jugadores en Puntarenas " + puntarenas.getCantidadJugadores());
        
    }
}
