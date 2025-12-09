/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.clases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Reportes_general {

    public static String tablaPosiciones() {
        StringBuilder sb = new StringBuilder();

        try {
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();

            String sql = """
                SELECT nombre, puntos, victorias, empates, derrotas, goles_favor, goles_contra
                FROM equipos
                ORDER BY puntos DESC, (goles_favor - goles_contra) DESC;
            """;

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            sb.append("TABLA DE POSICIONES\n");
            sb.append("-------------------------------------------\n");

            while (rs.next()) {
                sb.append(rs.getString("nombre")).append("\n");
                sb.append("Puntos: ").append(rs.getInt("puntos")).append(" | ");
                sb.append("V ").append(rs.getInt("victorias")).append("  ");
                sb.append("E ").append(rs.getInt("empates")).append("  ");
                sb.append("D ").append(rs.getInt("derrotas")).append("\n");
                sb.append("GF: ").append(rs.getInt("goles_favor")).append(" | ");
                sb.append("GC: ").append(rs.getInt("goles_contra")).append("\n");
                sb.append("-------------------------------------------\n");
            }

            conexion.desconectar();

        } catch (Exception e) {
            sb.append("ERROR al cargar tabla de posiciones: ").append(e.getMessage());
        }

        return sb.toString();
    }

    public static String historialPartidos() {
        StringBuilder sb = new StringBuilder();

        try {
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();

            String sql = """
                SELECT equipoA, equipoB, golesA, golesB, fecha
                FROM partidos
                ORDER BY fecha DESC;
            """;

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            sb.append("HISTORIAL DE PARTIDOS\n");
            sb.append("-------------------------------------------\n");

            while (rs.next()) {
                sb.append(rs.getString("fecha")).append(" | ");
                sb.append(rs.getString("equipoA")).append(" ");
                sb.append(rs.getInt("golesA")).append(" - ");
                sb.append(rs.getInt("golesB")).append(" ");
                sb.append(rs.getString("equipoB")).append("\n");
            }

            conexion.desconectar();

        } catch (Exception e) {
            sb.append("ERROR al cargar historial: ").append(e.getMessage());
        }

        return sb.toString();
    }

    public static String goleadores() {
        StringBuilder sb = new StringBuilder();

        try {
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();

            String sql = """
                SELECT nombre, nombre_equipo, goles
                FROM jugadores
                ORDER BY goles DESC;
            """;

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            sb.append("MÁXIMOS GOLEADORES\n");
            sb.append("-------------------------------------------\n");

            while (rs.next()) {
                sb.append(rs.getString("nombre")).append(" | ");
                sb.append(rs.getString("nombre_equipo")).append(" | ");
                sb.append(rs.getInt("goles")).append(" goles\n");
            }

            conexion.desconectar();

        } catch (Exception e) {
            sb.append("ERROR al cargar goleadores: ").append(e.getMessage());
        }

        return sb.toString();
    }

    
     public static String rendimientoEquipos() {
        StringBuilder sb = new StringBuilder();

        try {
            Conexion conexion = new Conexion();
            Connection cn = conexion.conectar();

            String sql = """
                SELECT nombre,
                       partidos_jugados,
                       victorias,
                       (victorias * 100 / partidos_jugados) AS rendimiento
                FROM equipos
                WHERE partidos_jugados > 0
                ORDER BY rendimiento DESC;
            """;

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            sb.append("RENDIMIENTO DE EQUIPOS\n");
            sb.append("-------------------------------------------\n");

            while (rs.next()) {
                sb.append(rs.getString("nombre")).append(" | ");
                sb.append("PJ: ").append(rs.getInt("partidos_jugados")).append(" | ");
                sb.append("Victorias: ").append(rs.getInt("victorias")).append(" | ");
                sb.append("Rendimiento: ").append(rs.getInt("rendimiento")).append("%\n");
            }

            conexion.desconectar();

        } catch (Exception e) {
            sb.append("ERROR al cargar rendimiento: ").append(e.getMessage());
        }

        return sb.toString();
    }
    
    
   
    
}
