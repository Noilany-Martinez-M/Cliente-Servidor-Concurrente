/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.clases;

import java.time.LocalDate;

/**
 *
 * @author Maytan
 */
public class Partido {
    int idPartido;
    Equipo equipoA;
    Equipo equipoB;
    int golesA;
    int golesB;
    double posesionA;
    double posesionB;
    private LocalDate fecha;

    public Partido(int idPartido, Equipo equipoA, Equipo equipoB, int golesA, int golesB, double posesionA, double posesionB, LocalDate fecha) {
        this.idPartido = idPartido;
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.golesA = golesA;
        this.golesB = golesB;
        this.posesionA = posesionA;
        this.posesionB = posesionB;
        this.fecha = fecha;
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public Equipo getEquipoA() {
        return equipoA;
    }

    public void setEquipoA(Equipo equipoA) {
        this.equipoA = equipoA;
    }

    public Equipo getEquipoB() {
        return equipoB;
    }

    public void setEquipoB(Equipo equipoB) {
        this.equipoB = equipoB;
    }

    public int getGolesA() {
        return golesA;
    }

    public void setGolesA(int golesA) {
        this.golesA = golesA;
    }

    public int getGolesB() {
        return golesB;
    }

    public void setGolesB(int golesB) {
        this.golesB = golesB;
    }

    public double getPosesionA() {
        return posesionA;
    }

    public void setPosesionA(double posesionA) {
        this.posesionA = posesionA;
    }

    public double getPosesionB() {
        return posesionB;
    }

    public void setPosesionB(double posesionB) {
        this.posesionB = posesionB;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
