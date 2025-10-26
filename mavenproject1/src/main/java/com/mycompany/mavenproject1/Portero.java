/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author compr
 */
public class Portero extends JugadorFutbol {

    public Portero(int id, String nombre, String equipo) {
        super(id, nombre, equipo);
    }
    
    private static final String[]FRASES={
        "SALTA Y ATAJA UN TIRO DIRECTO ",
        "ORDENA A LA DEFENSA Y PIDE CALMA PARA RECIBIR EL TIRO ",
        "BLOQUEA EL BALON Y DA PATADA DE DESPEJE"
        "TIRA DISPARO DE PENAL ALA PORTERO Y LE METEN GOL"
        "ENTRA EL PRIMER GOL DEL PARTIDO"
    };
    public Portero(int id, String nombre , String equipo){
        super(id, nombre, equipo);
    }
    
    
}
