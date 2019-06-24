/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.biblioteca.ui;

import java.awt.event.WindowEvent;

/**
 *
 * @author Susana
 */
public class AltaUsuario extends javax.swing.JPanel {

    /**
     * Creates new form AltaUsuario
     */
    public AltaUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbl_altausuario = new javax.swing.JLabel();
        jlbl_nombreyapellido = new javax.swing.JLabel();
        jtxt_nombreyapellido = new javax.swing.JTextField();
        jlbl_legajo = new javax.swing.JLabel();
        jtxt_legajo = new javax.swing.JTextField();
        jlbl_dni = new javax.swing.JLabel();
        jtxt_dni = new javax.swing.JTextField();
        jlbl_telefono = new javax.swing.JLabel();
        jtxt_telefono = new javax.swing.JTextField();
        jlbl_email = new javax.swing.JLabel();
        jtxt_email = new javax.swing.JTextField();
        jlbl_direccion = new javax.swing.JLabel();
        jtxt_direccion = new javax.swing.JTextField();
        jlbl_nombredeusuario = new javax.swing.JLabel();
        jtxt_nombredeusuario = new javax.swing.JTextField();
        jlbl_contrasenia = new javax.swing.JLabel();
        jtxt_contrasenia = new javax.swing.JTextField();
        jbtn_aceptar = new javax.swing.JButton();
        jbtn_cancelar = new javax.swing.JButton();

        jlbl_altausuario.setText("ALTA USUARIO");

        jlbl_nombreyapellido.setText("Nombre y Apellido:");

        jlbl_legajo.setText("Legajo:");

        jlbl_dni.setText("DNI:");

        jlbl_telefono.setText("Teléfono:");

        jlbl_email.setText("Email:");

        jlbl_direccion.setText("Direccion:");

        jlbl_nombredeusuario.setText("Nombre de Usuario:");

        jlbl_contrasenia.setText("Contrasenia:");

        jbtn_aceptar.setText("Aceptar");
        jbtn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_aceptarActionPerformed(evt);
            }
        });

        jbtn_cancelar.setText("Cancelar");
        jbtn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_altausuario)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbl_nombreyapellido)
                            .addComponent(jlbl_legajo)
                            .addComponent(jlbl_dni)
                            .addComponent(jlbl_telefono)
                            .addComponent(jlbl_email)
                            .addComponent(jlbl_direccion)
                            .addComponent(jlbl_nombredeusuario)
                            .addComponent(jlbl_contrasenia))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxt_nombreyapellido)
                            .addComponent(jtxt_legajo)
                            .addComponent(jtxt_dni)
                            .addComponent(jtxt_telefono)
                            .addComponent(jtxt_email)
                            .addComponent(jtxt_direccion)
                            .addComponent(jtxt_nombredeusuario)
                            .addComponent(jtxt_contrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jbtn_aceptar)
                .addGap(18, 18, 18)
                .addComponent(jbtn_cancelar)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jlbl_altausuario)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_nombreyapellido)
                    .addComponent(jtxt_nombreyapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_legajo)
                    .addComponent(jtxt_legajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_dni)
                    .addComponent(jtxt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_telefono)
                    .addComponent(jtxt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_email)
                    .addComponent(jtxt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl_direccion)
                    .addComponent(jtxt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_nombredeusuario)
                    .addComponent(jtxt_nombredeusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbl_contrasenia)
                    .addComponent(jtxt_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_aceptar)
                    .addComponent(jbtn_cancelar)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_cancelarActionPerformed
        this.dispatchEvent(new WindowEvent (this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_jbtn_cancelarActionPerformed

    private void jbtn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_aceptarActionPerformed
        if(jtxt_contrasenia!=null && jtxt_direccion!=null && jtxt_dni!=null && jtxt_email!=null && jtxt_legajo!=null && jtxt_nombredeusuario!=null && jtxt_nombreyapellido!=null && jtxt_telefono!=null &&);
        
        System.out.println("no se puede guardar");
    
    }//GEN-LAST:event_jbtn_aceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtn_aceptar;
    private javax.swing.JButton jbtn_cancelar;
    private javax.swing.JLabel jlbl_altausuario;
    private javax.swing.JLabel jlbl_contrasenia;
    private javax.swing.JLabel jlbl_direccion;
    private javax.swing.JLabel jlbl_dni;
    private javax.swing.JLabel jlbl_email;
    private javax.swing.JLabel jlbl_legajo;
    private javax.swing.JLabel jlbl_nombredeusuario;
    private javax.swing.JLabel jlbl_nombreyapellido;
    private javax.swing.JLabel jlbl_telefono;
    private javax.swing.JTextField jtxt_contrasenia;
    private javax.swing.JTextField jtxt_direccion;
    private javax.swing.JTextField jtxt_dni;
    private javax.swing.JTextField jtxt_email;
    private javax.swing.JTextField jtxt_legajo;
    private javax.swing.JTextField jtxt_nombredeusuario;
    private javax.swing.JTextField jtxt_nombreyapellido;
    private javax.swing.JTextField jtxt_telefono;
    // End of variables declaration//GEN-END:variables
}
