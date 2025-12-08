/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.clases;



/**
 *
 * @author compr
 */
public class SimulacionPartido extends javax.swing.JFrame {

    public SimulacionPartido() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Simulación de Partido");

        // ---- Por ahora la ventana está vacía ----
        // Aquí luego agregaremos:
        // - ComboBox Equipo A
        // - ComboBox Equipo B
        // - Botón Simular
        // - Barra de progreso
        // - Label minuto
        // - Label marcador
        // - Bitácora
        // - Todo lo necesario para los HILOS

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }
    
    
}
