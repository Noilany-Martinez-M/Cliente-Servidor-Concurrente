
package com.mycompany.mavenproject1.clases;

import com.mycompany.mavenproject1.clases.JugadorFutbol;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Equipo {
    
    private int id;
    private String nombre;
    int cantidadJugadores;
    private ArrayList<JugadorFutbol> jugadores;
    private int partidosJugados, victorias, empates, derrotas;
    private int golesFavor, golesContra, puntos;
    
    //agregar
    public Equipo(String nombre) {
        this.nombre = nombre;
    }
    
    //agregar

    public Equipo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    //eliminar
    public Equipo(int id) {
        this.id = id;
    }
    
    public Equipo() {
    }

    // Getters y Setters --------------------------------------------------------------------------------

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

    //CRUD para agregar equuipos a la bd
    public String agregar() {
        Conexion conexion = new Conexion();

       String sql = """
            INSERT INTO equipos 
            (nombre, cantidad_jugadores, partidos_jugados, victorias, empates, derrotas, goles_favor, goles_contra, puntos)
            VALUES (?, 0, 0, 0, 0, 0, 0, 0, 0)
        """;

        try {
            CallableStatement cs = conexion.conectar().prepareCall(sql);
            cs.setString(1, this.nombre);

            cs.execute();

            return "Equipo agregado con éxito.";

        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
            return "No se pudo agregar el equipo.";
        } catch (Exception ex) {
            return "Error de conexión con Base de Datos.";
        } finally {
            conexion.desconectar();
        }
    }
    //editar equipos de la base de datos(nombres unicamente
    public String editar() {
        Conexion conexion = new Conexion();

        String sql = """
                 UPDATE equipos SET
                 nombre = ?
                 WHERE id = ?
                 """;

        try {

            String nombreViejo = obtenerNombreAnterior(this.id);

            CallableStatement cs = conexion.conectar().prepareCall(sql);
            cs.setString(1, this.nombre);
            cs.setInt(2, this.id);

            cs.execute();

            String sqlJug = "UPDATE jugadores SET nombre_equipo = ? WHERE nombre_equipo = ?";
            CallableStatement csJug = conexion.conectar().prepareCall(sqlJug);
            csJug.setString(1, this.nombre);      // nuevo nombre
            csJug.setString(2, nombreViejo);      // nombre viejo
            csJug.execute();

            return "Equipo modificado con éxito.";

        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
            return "No se pudo modificar el equipo.";
        } catch (Exception ex) {
            return "Error de conexión con Base de Datos.";
        } finally {
            conexion.desconectar();
        }
    }
    
    //metodo especial para obtener el nombre antes de cambiar
    //asi se cambian los jugadores de equipo si es que se modifica el nombre
    private String obtenerNombreAnterior(int id) {
    Conexion conexion = new Conexion();
    String nombre = "";

    try {
        String sql = "SELECT nombre FROM equipos WHERE id = ?";
        CallableStatement cs = conexion.conectar().prepareCall(sql);
        cs.setInt(1, id);

        ResultSet rs = cs.executeQuery();
        if (rs.next()) {
            nombre = rs.getString("nombre");
        }

    } catch (Exception e) {
        System.out.println("Error obteniendo nombre anterior: " + e.getMessage());
    } finally {
        conexion.desconectar();
    }

    return nombre;
}
    
    //mmetodo para eliminar equipos de la base de datos por medio de su codigo
    public String eliminar() {
        Conexion conexion = new Conexion();

        String sql = "DELETE FROM equipos WHERE id = ?";

        try {
            CallableStatement cs = conexion.conectar().prepareCall(sql);
            cs.setInt(1, this.id);
            cs.execute();

            return "Equipo eliminado con éxito.";

        } catch (SQLException ex) {
            System.out.println("Exception: " + ex.getMessage());
            return "No se pudo eliminar el equipo.";
        } catch (Exception ex) {
            return "Error de conexión con BD.";
        } finally {
            conexion.desconectar();
        }
    }

    //consultar los datos principales de los equipo
    
    public static DefaultTableModel consultar() {
        Conexion conexion = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cantidad");

        String datos[] = new String[3];

        try {
            Statement stmt = conexion.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM equipos");

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);

                modelo.addRow(datos);
            }

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        } finally {
            conexion.desconectar();
        }

        return modelo;
    }

    //consultar jugadores cuyo equipo es "Ninguno"
    public static DefaultTableModel consultarSinEquipo() {
        Conexion conexion = new Conexion();

        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Posición");

        String[] datos = new String[3];

        try {
            Statement stmt = conexion.conectar().createStatement();
            ResultSet rs = stmt.executeQuery("""
            SELECT id, nombre, tipo_rol
            FROM jugadores
            WHERE nombre_equipo = 'Ninguno'
        """);

            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                modelo.addRow(datos);
            }

        } catch (Exception ex) {
            System.out.println("Error cargando jugadores sin equipo: " + ex.getMessage());
        } finally {
            conexion.desconectar();
        }

        return modelo;
    }
    
    //Cargar los nombres de los equipos para poder anyadirlos al combo box de jugadores
    
    public static void cargarEquipos(JComboBox combo) {
        
    Conexion conexion = new Conexion();
    combo.removeAllItems();

    combo.addItem("Ninguno"); // siempre aparece en primer lugar

    try {
        Statement stmt = conexion.conectar().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT nombre FROM equipos");

        while (rs.next()) {
            combo.addItem(rs.getString("nombre"));
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "No se pudieron cargar los equipos.");
        System.out.println("Error SQL: " + ex.getMessage());
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null,
                "No se pudo establecer conexión con la base de datos.");
    } finally {
        conexion.desconectar();
    }
}
    
    //Sumar al contador de cantidad_jugadores si es que se agrega un jugador al equipo
    //se pide el nombre del equipo para poder hacerlo
    public static String sumarJugador(String nombreEquipo) {
        Conexion conexion = new Conexion();

        String sql = """
        UPDATE equipos SET
        cantidad_jugadores = cantidad_jugadores + 1
        WHERE nombre = ?
        """;

        try {
            CallableStatement cs = conexion.conectar().prepareCall(sql);
            cs.setString(1, nombreEquipo);
            cs.execute();
            return "Jugador sumado correctamente.";

        } catch (Exception ex) {
            return "Error al sumar jugador: " + ex.getMessage();
        } finally {
            conexion.desconectar();
        }
    }

    //Restar al contador de cantidad_jugadores si es que se saca un jugador del equipo
    //se pide el nombre del equipo para poder hacerlo
    public static String restarJugador(String nombreEquipo) {
        Conexion conexion = new Conexion();

        String sql = """
                 UPDATE equipos SET
                 cantidad_jugadores = cantidad_jugadores - 1
                 WHERE nombre = ?
                 """;

        try {
            CallableStatement cs = conexion.conectar().prepareCall(sql);
            cs.setString(1, nombreEquipo);
            cs.execute();
            return "Jugador sumado correctamente.";
            
        } catch (Exception ex) {
            return "Error al restar: " + ex.getMessage();
        } finally {
            conexion.desconectar();
        }
    }
    
    //metodo creado para validar los equipos que cuentan con 5 jugadores o mas
    public static void cargarEquiposValidos(JComboBox combo) {
    Conexion conexion = new Conexion();
    combo.removeAllItems();

    try {
        Statement stmt = conexion.conectar().createStatement();
        ResultSet rs = stmt.executeQuery(
            "SELECT nombre FROM equipos WHERE cantidad_jugadores >= 5"
        );

        while (rs.next()) {
            combo.addItem(rs.getString("nombre"));
        }

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null,
            "Error cargando equipos válidos: " + ex.getMessage());
    } finally {
        conexion.desconectar();
    }
}

}
