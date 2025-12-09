package com.mycompany.mavenproject1.clases;

public abstract class JugadorFutbol {

    protected int id;
    protected String nombre;
    protected String equipo;
    protected int goles;
    protected int acciones;

    public JugadorFutbol(String nombre, String equipo) {
        this.id = 0;
        this.nombre = nombre;
        this.equipo = equipo;
        this.goles = 0;
        this.acciones = 0;
    }

    public JugadorFutbol(String nombre) {
        this(nombre, "NINGUNO");
    }

    public abstract String generarMensaje();

    // Getters y Setters

    public void setGoles(int goles) {
        this.goles = goles;
    }

    public void setAcciones(int acciones) {
        this.acciones = acciones;
    }
    
    public int getId() {
        return id;
    }

     public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public int getGoles() {
        return goles;
    }

    public int getAcciones() {
        return acciones;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void sumarGol() {
        this.goles++;
    }

    public void sumarAccion() {
        this.acciones++;
    }


}
