/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.clases;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Reportes_Cliente {

public static String solicitarReporte(String tipo) {

        try (Socket socket = new Socket("localhost", 5900)) {

            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());

            out.writeUTF(tipo);

            String respuesta = in.readUTF();

            return respuesta;

        } catch (Exception e) {
            return "Error al conectar con el servidor: " + e.getMessage();
        }
    }


    
}
