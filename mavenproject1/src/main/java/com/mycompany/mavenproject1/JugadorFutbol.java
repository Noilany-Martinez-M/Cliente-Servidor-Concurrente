/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author compr
 */
public abstract class JugadorFutbol {
    protected int id;
    protected String nombre;
    protected String equipo;
    protected int goles;
    protected int acciones;
    public JugadorFutbol(int id, String nombre, String equipo){
        this.id=id;
        this.nombre=nombre;
        this.equipo=equipo;
        this.goles =0;
        this.acciones =0;
    
        
    }
  //  public JugadorFutbol(int id,String nombre,String equipo){
    //   this(id, nombre, "NINGUNO");
        
    }
    
    public abstract String GenerarMensaje();

    
    
  

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

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public int getAcciones() {
        return acciones;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }
    public void sumarAccion(){
        this.goles++;
    }

    
}
