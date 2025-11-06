
package com.mycompany.mavenproject1.clases;

public abstract class JugadorFutbol {
    private static int contador = 1;
    protected int id;
    protected String nombre;
    protected String equipo;
    protected int goles;
    protected int acciones;

    public JugadorFutbol(String nombre, String equipo) {
        this.id = contador++;
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
