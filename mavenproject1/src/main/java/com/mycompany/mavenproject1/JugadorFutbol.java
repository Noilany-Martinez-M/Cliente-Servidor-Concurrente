
package com.mycompany.mavenproject1;

public abstract class JugadorFutbol {
    
    protected int id;
    protected String nombre;
    protected String equipo;
    protected int goles;
    protected int acciones;

    public JugadorFutbol(int id, String nombre, String equipo) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.goles = 0;
        this.acciones = 0;
    }

    public JugadorFutbol(int id, String nombre) {
        this(id, nombre, "NINGUNO");
    }

    public abstract String generarMensaje();

    // Getters y Setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEquipo() { return equipo; }
    public int getGoles() { return goles; }
    public int getAcciones() { return acciones; }

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
