
package com.mycompany.mavenproject1;
import com.mycompany.mavenproject1.clases.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.CallableStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class FrEquipos extends javax.swing.JFrame {

    
    public FrEquipos(Menu principal) {
        initComponents();

        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                volverPrincipal();
            }
        });

        txtId.setEditable(false);
        txtCantJug.setEditable(false);


        this.principal = principal;
        
        cargarTablaEquipos();
        cagarTablaNinguno();
        limpiar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreEq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtCantJug = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSinEquipo = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblConstruccion = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 242, 242));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 255), new java.awt.Color(0, 51, 153)), "Formulario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 3, 18), new java.awt.Color(0, 0, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre");

        txtNombreEq.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreEq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEqActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad de jugadores");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("ID");

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtCantJug.setBackground(new java.awt.Color(255, 255, 255));
        txtCantJug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantJugActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantJug, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                            .addComponent(txtNombreEq))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreEq, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantJug, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        btnAgregar.setBackground(new java.awt.Color(102, 102, 255));
        btnAgregar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar jugador");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnCrear.setBackground(new java.awt.Color(102, 102, 255));
        btnCrear.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear equipo");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnEditar.setBackground(new java.awt.Color(102, 102, 255));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar nombre");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 102, 255));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar equipo");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tblEquipos.setBackground(new java.awt.Color(242, 242, 242));
        tblEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Jugadores"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblEquipos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblEquiposMousePressed(evt);
            }
        });
        tblEquipos.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                tblEquiposComponentHidden(evt);
            }
        });
        jScrollPane1.setViewportView(tblEquipos);
        if (tblEquipos.getColumnModel().getColumnCount() > 0) {
            tblEquipos.getColumnModel().getColumn(0).setPreferredWidth(40);
            tblEquipos.getColumnModel().getColumn(0).setMaxWidth(70);
            tblEquipos.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblEquipos.getColumnModel().getColumn(1).setMaxWidth(150);
            tblEquipos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblEquipos.getColumnModel().getColumn(2).setMaxWidth(125);
        }

        tblSinEquipo.setBackground(new java.awt.Color(255, 255, 255));
        tblSinEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblSinEquipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblSinEquipoMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblSinEquipo);

        tblConstruccion.setBackground(new java.awt.Color(255, 255, 255));
        tblConstruccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblConstruccion);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Jugadores Sin equipo");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setText("Equipos");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setText("Construccion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(165, 165, 165)
                .addComponent(jLabel4)
                .addGap(105, 105, 105)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEqActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int fila = tblSinEquipo.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un jugador");
            return;
        }

        DefaultTableModel origen = (DefaultTableModel) tblSinEquipo.getModel();
        DefaultTableModel destino = (DefaultTableModel) tblConstruccion.getModel();

        Object[] datos = {
            origen.getValueAt(fila, 0),
            origen.getValueAt(fila, 1),
            origen.getValueAt(fila, 2)
        };

        destino.addRow(datos);
        origen.removeRow(fila);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

        try {
            String nombreEquipo = txtNombreEq.getText().trim();

            if (nombreEquipo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No es posible que deje ningun espacio vacio",
                        "Campos vacíos", JOptionPane.WARNING_MESSAGE);
                return;
            }

            Equipo nuevo = new Equipo(nombreEquipo);

            String mensaje = nuevo.agregar();
            JOptionPane.showMessageDialog(this, mensaje);

            cargarTablaEquipos();
            limpiar();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Cantidad de obras e ingresos deben de ser numericos", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    public void limpiar(){
        txtId.setText("");
        txtNombreEq.setText("");
        txtCantJug.setText("");
        
        btnEditar.setEnabled(false);
        btnCrear.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnAgregar.setEnabled(false);
    }
    
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        try {

            String nuevoNombre = txtNombreEq.getText().trim();
            int codigo = Integer.parseInt(txtId.getText());
            
        if (nuevoNombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.");
            return;
        }

        Equipo equipoEditado = new Equipo(codigo, nuevoNombre);

        String mensaje = equipoEditado.editar();
        JOptionPane.showMessageDialog(this, mensaje);

        cargarTablaEquipos();
        txtNombreEq.setText("");
        limpiar();

        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int codigo = Integer.parseInt(txtId.getText());
        String nombre = txtNombreEq.getText().trim();
        
        try{
            int opcion = JOptionPane.showConfirmDialog(
                this,
                "¿Eliminar el equipo: " + nombre + "?",
                "Eliminar",
                JOptionPane.YES_NO_OPTION
        );

        if (opcion != JOptionPane.YES_OPTION) return;
        
        // Cambiar jugadores de ese equipo a "Ninguno"
        actualizarJugadoresNombre(nombre, "Ninguno");
        

        Equipo equipo = new Equipo(codigo);

        String mensaje = equipo.eliminar();
        JOptionPane.showMessageDialog(this, mensaje);

        cargarTablaEquipos();
        limpiar();
        txtNombreEq.setText("");
            
                   
                    
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    //metodo poor si se eliminar un equipo que posee jugadores
    public static void actualizarJugadoresNombre(String viejo, String nuevo) {
    Conexion conexion = new Conexion();

    String sql = """
                 UPDATE jugadores SET
                 nombre_equipo = ?
                 WHERE nombre_equipo = ?
                 """;

    try {
        CallableStatement cs = conexion.conectar().prepareCall(sql);
        cs.setString(1, nuevo);
        cs.setString(2, viejo);

        cs.execute();

    } catch (Exception ex) {
        System.out.println("Exception: " + ex.getMessage());
    } finally {
        conexion.desconectar();
    }
}

    private void tblEquiposComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tblEquiposComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_tblEquiposComponentHidden

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtCantJugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantJugActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantJugActionPerformed

    private void tblEquiposMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquiposMousePressed
        //selecionar datos desde la tabla 
        int fila = tblEquipos.getSelectedRow();
        if (fila == -1){
            return;
        }
        
        txtId.setText(tblEquipos.getValueAt(fila, 0).toString());
        txtNombreEq.setText(tblEquipos.getValueAt(fila, 1).toString());
        txtCantJug.setText(tblEquipos.getValueAt(fila, 2).toString());
        
        btnEditar.setEnabled(true);
        btnCrear.setEnabled(false);
        btnEliminar.setEnabled(true);
        btnAgregar.setEnabled(false);
    }//GEN-LAST:event_tblEquiposMousePressed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblSinEquipoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinEquipoMousePressed
        // TODO add your handling code here:
        int fila = tblEquipos.getSelectedRow();
        if (fila == -1){
            return;
        }
        
        btnEditar.setEnabled(false);
        btnCrear.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnAgregar.setEnabled(true);
    }//GEN-LAST:event_tblSinEquipoMousePressed
    
    private void cargarTablaEquipos(){
        //cargar la ytabla de los equipos
        DefaultTableModel modelo = (DefaultTableModel)tblEquipos.getModel();
        modelo.setRowCount(0);
        tblEquipos.setDefaultEditor(Object.class, null);
        tblEquipos.setRowHeight(25);
        tblEquipos.getTableHeader().setReorderingAllowed(false);
        tblEquipos.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 18));
        tblEquipos.getTableHeader().setForeground(new Color(102, 102, 255));
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblEquipos.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        tblEquipos.setModel(Equipo.consultar());
    }

    public void cagarTablaNinguno(){
        DefaultTableModel modelo = (DefaultTableModel)tblSinEquipo.getModel();
        modelo.setRowCount(0);
        tblSinEquipo.setDefaultEditor(Object.class, null);
        tblSinEquipo.setRowHeight(25);
        tblSinEquipo.getTableHeader().setReorderingAllowed(false);
        tblSinEquipo.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 18));
        tblSinEquipo.getTableHeader().setForeground(new Color(102, 102, 255));
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) tblSinEquipo.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        tblSinEquipo.setModel(Equipo.consultarSinEquipo());
    }
    
    public void volverPrincipal() {
        principal.setVisible(true);
        dispose();
    }
    
    private ArrayList<Equipo> listaEquipos = new ArrayList<>();
    private Menu principal;
    private DefaultTableModel modeloTabla;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblConstruccion;
    private javax.swing.JTable tblEquipos;
    private javax.swing.JTable tblSinEquipo;
    private javax.swing.JTextField txtCantJug;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreEq;
    // End of variables declaration//GEN-END:variables
}
