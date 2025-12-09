
public class FrCliente extends javax.swing.JFrame {

    
    public FrCliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHistorialPartidos = new javax.swing.JButton();
        btnMaximosGoleadores = new javax.swing.JButton();
        btnTablaPosiciones = new javax.swing.JButton();
        btnRendimientoEquipos = new javax.swing.JButton();

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMaximosGoleadores, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addComponent(btnHistorialPartidos, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addComponent(btnRendimientoEquipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
                    .addComponent(btnTablaPosiciones, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnTablaPosiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHistorialPartidos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMaximosGoleadores, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRendimientoEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void btnHistorialPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialPartidosActionPerformed
        
    }//GEN-LAST:event_btnHistorialPartidosActionPerformed

    private void btnMaximosGoleadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaximosGoleadoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaximosGoleadoresActionPerformed

    private void btnTablaPosicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTablaPosicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTablaPosicionesActionPerformed

    private void btnRendimientoEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRendimientoEquiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRendimientoEquiposActionPerformed

    
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
    // End of variables declaration//GEN-END:variables
}
