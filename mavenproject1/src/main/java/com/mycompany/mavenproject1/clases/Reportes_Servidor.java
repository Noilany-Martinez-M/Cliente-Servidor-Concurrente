/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.clases;
import com.mycompany.mavenproject1.clases.Reportes_general;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;



public class Reportes_Servidor implements Runnable{

    @Override
    public void run() {

               try (ServerSocket server = new ServerSocket(5900)) {
            System.out.println("Servidor de reportes activo…");

            while (true) {

                Socket cliente = server.accept();

                DataInputStream in = new DataInputStream(cliente.getInputStream());
                DataOutputStream out = new DataOutputStream(cliente.getOutputStream());

                String tipo = in.readUTF();

                String resultado = switch (tipo) {
                    case "tabla_posiciones" -> Reportes_general.tablaPosiciones();
                    case "historial" -> Reportes_general.historialPartidos();
                    case "goleadores" -> Reportes_general.goleadores();
                    case "rendimiento" -> Reportes_general.rendimientoEquipos();
                    default -> "ERROR: reporte desconocido";
                };

                out.writeUTF(resultado);

                cliente.close();
            }

        } catch (Exception e) {
            System.out.println("Error servidor: " + e.getMessage());
        }


    }
     
}

