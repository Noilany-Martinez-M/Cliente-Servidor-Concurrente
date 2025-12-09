package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.clases.Reportes_Cliente;
import com.mycompany.mavenproject1.clases.Reportes_Servidor;
import javax.swing.JOptionPane;

public class FrCliente extends javax.swing.JFrame {
    private static boolean servidorIniciado = false;

    public FrCliente() {
        initComponents();
        if(!servidorIniciado){
          iniciarServidor();
          servidorIniciado=true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHistorialPartidos = new javax.swing.JButton();
        btnMaximosGoleadores = new javax.swing.JButton();
        btnTablaPosiciones = new javax.swing.JButton();
        btnRendimientoEquipos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresultados = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(239, 239, 239));

        btnHistorialPartidos.setBackground(new java.awt.Color(102, 102, 255));
        btnHistorialPartidos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnHistorialPartidos.setForeground(new java.awt.Color(255, 255, 255));
        btnHistorialPartidos.setText("Historial de partidos");
        btnHistorialPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialPartidosActionPerformed(evt);
            }
        });

        btnMaximosGoleadores.setBackground(new java.awt.Color(102, 102, 255));
        btnMaximosGoleadores.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnMaximosGoleadores.setForeground(new java.awt.Color(255, 255, 255));
        btnMaximosGoleadores.setText("Maximos goleadores");
        btnMaximosGoleadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaximosGoleadoresActionPerformed(evt);
            }
        });

        btnTablaPosiciones.setBackground(new java.awt.Color(102, 102, 255));
        btnTablaPosiciones.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnTablaPosiciones.setForeground(new java.awt.Color(255, 255, 255));
        btnTablaPosiciones.setText("Tabla de posiciones");
        btnTablaPosiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTablaPosicionesActionPerformed(evt);
            }
        });

        btnRendimientoEquipos.setBackground(new java.awt.Color(102, 102, 255));
        btnRendimientoEquipos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRendimientoEquipos.setForeground(new java.awt.Color(255, 255, 255));
        btnRendimientoEquipos.setText("Rendimiento de equipos");
        btnRendimientoEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRendimientoEquiposActionPerformed(evt);
            }
        });

        txtresultados.setColumns(20);
        txtresultados.setRows(5);
        jScrollPane1.setViewportView(txtresultados);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnRendimientoEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                        .addComponent(btnMaximosGoleadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHistorialPartidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTablaPosiciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnTablaPosiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistorialPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnMaximosGoleadores, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRendimientoEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarServidor() {
    Thread server = new Thread(new Reportes_Servidor());
    server.start();
    System.out.println("Servidor de reportes iniciado...");
}
    
    
    
    private void btnHistorialPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialPartidosActionPerformed
        String reporte = Reportes_Cliente.solicitarReporte("historial");
        JOptionPane.showMessageDialog(this, reporte);
    }//GEN-LAST:event_btnHistorialPartidosActionPerformed

    private void btnMaximosGoleadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximosGoleadoresActionPerformed
        String reporte = Reportes_Cliente.solicitarReporte("goleadores");
        JOptionPane.showMessageDialog(this, reporte);

    }//GEN-LAST:event_btnMaximosGoleadoresActionPerformed

    private void btnTablaPosicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaPosicionesActionPerformed
        String reporte = Reportes_Cliente.solicitarReporte("tabla_posiciones");
        JOptionPane.showMessageDialog(this, reporte);


    }//GEN-LAST:event_btnTablaPosicionesActionPerformed

    private void btnRendimientoEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendimientoEquiposActionPerformed
        String reporte = Reportes_Cliente.solicitarReporte("rendimiento");
        JOptionPane.showMessageDialog(this, reporte);


    }//GEN-LAST:event_btnRendimientoEquiposActionPerformed

    private void mostrarResultado(String texto) {
        txtresultados.setText(texto); //MOSTRAR RESULTADOS EN EL AREA EN BLANCO

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistorialPartidos;
    private javax.swing.JButton btnMaximosGoleadores;
    private javax.swing.JButton btnRendimientoEquipos;
    private javax.swing.JButton btnTablaPosiciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtresultados;
    // End of variables declaration//GEN-END:variables
}
