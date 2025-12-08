
package com.mycompany.mavenproject1.clases;

import com.mycompany.mavenproject1.clases.JugadorFutbol;
import java.util.ArrayList;


public class Equipo {
    
    private int contador=1;
    private int id=100;
    private String nombre;
    int cantidadJugadores;
    private ArrayList<JugadorFutbol> jugadores;
    private int partidosJugados, victorias, empates, derrotas;
    private int golesFavor, golesContra, puntos;

    public Equipo(String nombre) {
        this.id = contador++;
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(JugadorFutbol j) {
        jugadores.add(j);
        j.setEquipo(nombre);
    }

    public void eliminarJugador(JugadorFutbol j) {
        jugadores.remove(j);
        j.setEquipo("Ninguno");
    }

    public int getCantidadJugadores() {
        return jugadores.size();
    }

    // Getters y Setters 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<JugadorFutbol> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<JugadorFutbol> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    
    
}
