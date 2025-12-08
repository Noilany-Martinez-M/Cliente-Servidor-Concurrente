/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.mavenproject1;

import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mycompany.mavenproject1.clases.Conexion;
import java.sql.ResultSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author compr
 */
public class SimulacionPartido extends javax.swing.JFrame {

    /**
     * Creates new form SimulacionPartido
     */
    
    
     // Listas para guardar los nombres de los jugadores
    private List<String> jugadoresEquipoA = new ArrayList<>();
    private List<String> jugadoresEquipoB = new ArrayList<>();
    
    private List<String> titularesA = new ArrayList<>();
    private List<String> suplentesA = new ArrayList<>();

    private List<String> titularesB = new ArrayList<>();
    private List<String> suplentesB = new ArrayList<>();
    
    //VARIABLES SIMULACION
    private int golesA = 0;
    private int golesB = 0;

    private int posesionA = 0;
    private int posesionB = 0;

    private String jugadorEvento = "";
    private String eventoActual = "";


    
    
   public SimulacionPartido() {
    initComponents();
    cargarEquipos();   // ← LLAMAMOS AL MÉTODO
}
   //EQUPO A
   private void cargarJugadoresEquipoA() {
    jugadoresEquipoA.clear();  // limpia la lista antes de llenarla

    String equipo = (String) cboEquipoA.getSelectedItem();
    if (equipo == null) return;

    try {
        Conexion cn = new Conexion();
        Connection con = cn.conectar();

        String sql = "SELECT nombre FROM jugadores WHERE nombre_equipo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, equipo);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            jugadoresEquipoA.add(rs.getString("nombre"));
        }

        System.out.println("Jugadores de A cargados: " + jugadoresEquipoA);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error cargando jugadores A: " + e.getMessage());
    }
}
   
   //EQUIPO B
   
   private void cargarJugadoresEquipoB() {
    jugadoresEquipoB.clear();

    String equipo = (String) cboEquipoB.getSelectedItem();
    if (equipo == null) return;

    try {
        Conexion cn = new Conexion();
        Connection con = cn.conectar();

        String sql = "SELECT nombre FROM jugadores WHERE nombre_equipo = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, equipo);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            jugadoresEquipoB.add(rs.getString("nombre"));
        }

        System.out.println("Jugadores de B cargados: " + jugadoresEquipoB);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error cargando jugadores B: " + e.getMessage());
    }
}
   
   //SUPLENTES A
   
   private void generarAlineacionEquipoA() {

    titularesA.clear();
    suplentesA.clear();

    // Mezclar jugadores aleatoriamente
    Collections.shuffle(jugadoresEquipoA);

    int total = jugadoresEquipoA.size();

    if (total < 5) {
        JOptionPane.showMessageDialog(this, 
            "El equipo A no tiene suficientes jugadores (mínimo 5)");
        return;
    }

    // Los primeros 5 jugadores son los titulares
    for (int i = 0; i < 5; i++) {
        titularesA.add(jugadoresEquipoA.get(i));
    }

    // Suplentes 
    if (total == 5) {
        // No hay suplentes
    } else if (total == 6 || total == 7) {
        // 1 o 2 suplentes máximo
        for (int i = 5; i < total; i++) {
            suplentesA.add(jugadoresEquipoA.get(i));
        }
    } else {
        // 8 o más → máximo 3 suplentes
        for (int i = 5; i < Math.min(total, 8); i++) {
            suplentesA.add(jugadoresEquipoA.get(i));
        }
    }

    System.out.println("Titulares A: " + titularesA);
    System.out.println("Suplentes A: " + suplentesA);
}
//SUPLENTES B
   
   private void generarAlineacionEquipoB() {

    titularesB.clear();
    suplentesB.clear();

    // Mezclar jugadores aleatoriamente
    Collections.shuffle(jugadoresEquipoB);

    int total = jugadoresEquipoB.size();

    if (total < 5) {
        JOptionPane.showMessageDialog(this, 
            "El equipo B no tiene suficientes jugadores (mínimo 5)");
        return;
    }

    // Los primeros 5 son titulares
    for (int i = 0; i < 5; i++) {
        titularesB.add(jugadoresEquipoB.get(i));
    }

    // Suplentes 
    if (total == 5) {
        // No hay suplentes
    } else if (total == 6 || total == 7) {
        // 1-2 suplentes
        for (int i = 5; i < total; i++) {
            suplentesB.add(jugadoresEquipoB.get(i));
        }
    } else {
        // 3 suplentes máximo
        for (int i = 5; i < Math.min(total, 8); i++) {
            suplentesB.add(jugadoresEquipoB.get(i));
        }
    }

    System.out.println("Titulares B: " + titularesB);
    System.out.println("Suplentes B: " + suplentesB);
}
   
   //PARTIDO SIMULACION
   
   private String jugadorAleatorio(List<String> titulares) {
    if (titulares.isEmpty()) return "Desconocido";
    int index = (int)(Math.random() * titulares.size());
    return titulares.get(index);
}

   
   //MINUTOS
   private String tipoEvento() {
    double r = Math.random();

    if (r < 0.70) return "transito";        // 70%
    else if (r < 0.85) return "cambio";     // 15%
    else return "eventoClave";              // 15%
}

//EVENTOS
   private String eventoClave(String equipo) {

    double r = Math.random();

    if (r < 0.50) {
        return "Gol de " + equipo;
    } else if (r < 0.70) {
        return "Tiro libre para " + equipo;
    } else if (r < 0.90) {
        return "Tiro de esquina para " + equipo;
    } else {
        return "Penal para " + equipo;
    }
}
   
   //elegir jugador que juega
   
   private String jugadorDelEquipo(boolean esA) {
    List<String> lista = esA ? titularesA : titularesB;

    if (lista.isEmpty())
        return "Jugador desconocido";

    int index = (int)(Math.random() * lista.size());
    return lista.get(index);
}
   
   //CAMBIOS
   private String realizarCambio(boolean esA) {

    List<String> titulares = esA ? titularesA : titularesB;
    List<String> suplentes = esA ? suplentesA : suplentesB;

    if (suplentes.isEmpty()) {
        return "Cambio no realizado (no hay suplentes disponibles).";
    }

    // Elegir suplente aleatorio
    int idxSup = (int)(Math.random() * suplentes.size());
    String entra = suplentes.get(idxSup);

    // Elegir titular aleatorio para salir
    int idxTit = (int)(Math.random() * titulares.size());
    String sale = titulares.get(idxTit);

    // Actualizar listas
    titulares.set(idxTit, entra);
    suplentes.remove(idxSup);
    suplentes.add(sale);

    return "Cambio realizado: Entra " + entra + ", sale " + sale;
}

   //tabla sql partido
   private void guardarPartidoEnBD(String equipoA, String equipoB) {
    try {
        Conexion cn = new Conexion();
        Connection con = cn.conectar();

        String sql = "INSERT INTO partidos (equipoA, equipoB, golesA, golesB, posesionA, posesionB, fecha) "
                   + "VALUES (?, ?, ?, ?, ?, ?, NOW())";

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, equipoA);
        ps.setString(2, equipoB);
        ps.setInt(3, golesA);
        ps.setInt(4, golesB);
        ps.setInt(5, posesionA);
        ps.setInt(6, posesionB);

        ps.executeUpdate();

        System.out.println("Partido guardado correctamente.");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al guardar el partido: " + e.getMessage());
    }
}
   
   //ACTUALIZAR EQUIPO
   
   private void actualizarEstadisticasEquipo(String equipoA, String equipoB) {
    try {
        Conexion cn = new Conexion();
        Connection con = cn.conectar();

        // ACTUALIZAR EQUIPO A
        String sqlA = "UPDATE equipos SET "
                + "partidos_jugados = partidos_jugados + 1, "
                + "goles_favor = goles_favor + ?, "
                + "goles_contra = goles_contra + ?, ";

        if (golesA > golesB) {
            sqlA += "victorias = victorias + 1, puntos = puntos + 3 ";
        } else if (golesA == golesB) {
            sqlA += "empates = empates + 1, puntos = puntos + 1 ";
        } else {
            sqlA += "derrotas = derrotas + 1 ";
        }

        sqlA += "WHERE nombre = ?";

        PreparedStatement psA = con.prepareStatement(sqlA);
        psA.setInt(1, golesA);
        psA.setInt(2, golesB);
        psA.setString(3, equipoA);
        psA.executeUpdate();

        // ACTUALIZAR EQUIPO B
        String sqlB = "UPDATE equipos SET "
                + "partidos_jugados = partidos_jugados + 1, "
                + "goles_favor = goles_favor + ?, "
                + "goles_contra = goles_contra + ?, ";

        if (golesB > golesA) {
            sqlB += "victorias = victorias + 1, puntos = puntos + 3 ";
        } else if (golesA == golesB) {
            sqlB += "empates = empates + 1, puntos = puntos + 1 ";
        } else {
            sqlB += "derrotas = derrotas + 1 ";
        }

        sqlB += "WHERE nombre = ?";

        PreparedStatement psB = con.prepareStatement(sqlB);
        psB.setInt(1, golesB);
        psB.setInt(2, golesA);
        psB.setString(3, equipoB);
        psB.executeUpdate();

        System.out.println("Estadísticas actualizadas correctamente.");

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error actualizando estadísticas: " + e.getMessage());
    }
}


   







// MÉTODO PARA CARGAR LOS EQUIPOS DESDE LA BASE DE DATOS

private void cargarEquipos() {
    DefaultComboBoxModel<String> modeloA = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> modeloB = new DefaultComboBoxModel<>();

    try {
        Conexion cn = new Conexion();
        Connection con = cn.conectar();

        String sql = "SELECT nombre FROM equipos WHERE cantidad_jugadores >= 5";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String nombre = rs.getString("nombre");
            modeloA.addElement(nombre);
            modeloB.addElement(nombre);
        }

        cboEquipoA.setModel(modeloA);
        cboEquipoB.setModel(modeloB);

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
            "Error cargando equipos: " + e.getMessage());
    }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboEquipoA = new javax.swing.JComboBox<>();
        cboEquipoB = new javax.swing.JComboBox<>();
        btnSimular = new javax.swing.JButton();
        lblMinuto = new javax.swing.JLabel();
        lblMarcador = new javax.swing.JLabel();
        lblEvento = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBitacora = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cboEquipoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboEquipoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEquipoAActionPerformed(evt);
            }
        });

        cboEquipoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboEquipoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEquipoBActionPerformed(evt);
            }
        });

        btnSimular.setText("Simular Partido");
        btnSimular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimularActionPerformed(evt);
            }
        });

        lblMinuto.setText("minuto");

        lblMarcador.setText("marcador");

        lblEvento.setText("evento");

        progressBar.setMaximum(40);

        txtBitacora.setEditable(false);
        txtBitacora.setColumns(20);
        txtBitacora.setRows(5);
        jScrollPane1.setViewportView(txtBitacora);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(btnSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cboEquipoA, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(lblMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cboEquipoB, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMarcador, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEvento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboEquipoA, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(cboEquipoB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSimular, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimularActionPerformed
        // TODO add your handling code here
        
         txtBitacora.setText("");
    golesA = 0;
    golesB = 0;
    posesionA = 0;
    posesionB = 0;

    btnSimular.setEnabled(false);

    new Thread(() -> {

        for (int minuto = 1; minuto <= 40; minuto++) {

            try { Thread.sleep(350); } catch (Exception e) {}

            String tipo = tipoEvento();

            String log = "";

            if (tipo.equals("transito")) {
                posesionA++;
                posesionB++;
                log = "Min " + minuto + ": Tránsito normal del partido.";
            }

            else if (tipo.equals("cambio")) {

                boolean esA = Math.random() < 0.5; // elegir equipo al azar

                // ESTA LÍNEA ES OBLIGATORIA
                String resultadoCambio = realizarCambio(esA);

                log = "Min " + minuto + ": " + resultadoCambio
                        + (esA ? " (Equipo A)" : " (Equipo B)");
            }

            

            else { // evento clave

                boolean esA = Math.random() < 0.5;
                String equipo = esA ? "Equipo A" : "Equipo B";

                String ev = eventoClave(equipo);

                if (ev.contains("Gol")) {
                    String jugador = jugadorDelEquipo(esA);
                    if (esA) golesA++;
                    else golesB++;
                    ev += " anotado por " + jugador;
                } else {
                    String jugador = jugadorDelEquipo(esA);
                    ev += " ejecutado por " + jugador;
                }

                log = "Min " + minuto + ": " + ev;
            }

            String marcador = golesA + " - " + golesB;

            String finalLog = log;
            int m = minuto;

            SwingUtilities.invokeLater(() -> {
                lblMarcador.setText("Marcador: " + marcador);
                lblMinuto.setText("Minuto: " + m);
                txtBitacora.append(finalLog + "\n");
                progressBar.setValue(m);
            });

        }

        SwingUtilities.invokeLater(() -> {
            txtBitacora.append("\nFinal del partido.\n");
            btnSimular.setEnabled(true);
        });
        //guardar en base de datos
        guardarPartidoEnBD(
                cboEquipoA.getSelectedItem().toString(),
                cboEquipoB.getSelectedItem().toString()
        );
        
        // actualizar estadísticas de los equipos
        actualizarEstadisticasEquipo(
                cboEquipoA.getSelectedItem().toString(),
                cboEquipoB.getSelectedItem().toString()
        );
        
// RESUMEN FINAL DEL PARTIDO

            String resumen
                    = "📋 RESUMEN DEL PARTIDO\n\n"
                    + "🏆 Resultado Final:\n"
                    + "   " + cboEquipoA.getSelectedItem().toString() + " " + golesA
                    + " - " + golesB + " " + cboEquipoB.getSelectedItem().toString() + "\n\n"
                    + "📊 Posesión del balón:\n"
                    + "   " + cboEquipoA.getSelectedItem().toString() + ": " + posesionA + "%\n"
                    + "   " + cboEquipoB.getSelectedItem().toString() + ": " + posesionB + "%\n\n"
                    + "⚽ Goles Totales:\n"
                    + "   Equipo A: " + golesA + "\n"
                    + "   Equipo B: " + golesB + "\n\n"
                    + "📘 Ganador:\n"
                    + (golesA > golesB
                            ? "   🟩 Ganó " + cboEquipoA.getSelectedItem().toString()
                            : golesB > golesA
                                    ? "   🟩 Ganó " + cboEquipoB.getSelectedItem().toString()
                                    : "   🤝 Empate")
                    + "\n";

            JOptionPane.showMessageDialog(null, resumen,
                    "Resumen del Partido", JOptionPane.INFORMATION_MESSAGE);

        }).start();


    }//GEN-LAST:event_btnSimularActionPerformed

    private void cboEquipoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEquipoAActionPerformed
        // TODO add your handling code here:

        cargarJugadoresEquipoA();
        generarAlineacionEquipoA();


    }//GEN-LAST:event_cboEquipoAActionPerformed

    private void cboEquipoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEquipoBActionPerformed
        // TODO add your handling code here:
        generarAlineacionEquipoB();
        cargarJugadoresEquipoB();
    }//GEN-LAST:event_cboEquipoBActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SimulacionPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulacionPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulacionPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulacionPartido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulacionPartido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimular;
    private javax.swing.JComboBox<String> cboEquipoA;
    private javax.swing.JComboBox<String> cboEquipoB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEvento;
    private javax.swing.JLabel lblMarcador;
    private javax.swing.JLabel lblMinuto;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JTextArea txtBitacora;
    // End of variables declaration//GEN-END:variables
}
