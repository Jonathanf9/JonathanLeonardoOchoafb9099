/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbasedatos;

import javax.swing.JOptionPane;

/**
 *
 * @author johnp
 */
public class GestionClientesV1 extends javax.swing.JFrame {

    private nuevocliente Nuevocliente;
    private ValidarelEmail validaremail;
    private Utilidades_en_cedula utilidades;

    /**
     * Creates new form GestionPersonaV1
     */
    public GestionClientesV1() {
        initComponents();

        Nuevocliente = new nuevocliente();
        validaremail = new ValidarelEmail();
        utilidades = new Utilidades_en_cedula();

    }

    private void LimpiarCajas() {

        txtNombre.setText(null);
        txtApellido.setText(null);
        txtReferencia.setText(null);
        txtDomicilio.setText(null);
        txtPais.setText(null);
        txtCorreo.setText(null);
        txtCedula.setText(null);
        txtTelefono.setText(null);
        txtEstadoCivil.setText(null);
        txtEdad.setText(null);
        txtSexo.setText(null);

    }

    private void bloquear() {
        txtNombre.setEnabled(false);
        txtApellido.setEnabled(false);
        txtReferencia.setEnabled(false);
        txtDomicilio.setEnabled(false);
        txtPais.setEnabled(false);
        txtCorreo.setEnabled(false);
        txtCedula.setEnabled(false);
        txtTelefono.setEnabled(false);
        txtEstadoCivil.setEnabled(false);
        txtEdad.setEnabled(false);
        txtSexo.setEnabled(false);

        btnNuevo.setEnabled(true);
        btnSalir.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    private void desbloquear() {

        txtNombre.setEnabled(true);
        txtApellido.setEnabled(true);
        txtReferencia.setEnabled(true);
        txtDomicilio.setEnabled(true);
        txtPais.setEnabled(true);
        txtCorreo.setEnabled(true);
        txtCedula.setEnabled(true);
        txtTelefono.setEnabled(true);
        txtEstadoCivil.setEnabled(true);
        txtEdad.setEnabled(true);
        txtSexo.setEnabled(true);
        btnNuevo.setEnabled(false);
        btnSalir.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    /*/
    public void clientes() {
        String datoCedula = txtCedula.getText();
        System.out.println(datoCedula);

        String datoNombre = txtNombre.getText();
        System.out.println(datoNombre);

        String datoApellido = txtApellido.getText();
        System.out.println(datoApellido);

        String datoReferencia = txtReferencia.getText();
        System.out.println(datoReferencia);

        String datoTelefono = txtTelefono.getText();
        System.out.println(datoTelefono);

        String datoCorreo = txtCorreo.getText();
        System.out.println(datoCorreo);
    }
/*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTitulo = new javax.swing.JLabel();
        panelCuerpoRegistro = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtReferencia = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        lblCorreo1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnTraer = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtPais = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        lblCorreo2 = new javax.swing.JLabel();
        lblCorreo3 = new javax.swing.JLabel();
        lblCorreo4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtSexo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestion Personas");
        setResizable(false);

        txtTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTitulo.setText("Resgistro personas");

        panelCuerpoRegistro.setBorder(javax.swing.BorderFactory.createTitledBorder("Cuerpo Registro"));

        lblCedula.setText("Cedula:");

        lblNombre.setText("Nombre:");

        lblApellido.setText("Apellido:");

        lblDireccion.setText("Referencia:");

        lblTelefono.setText("Telefono:");

        lblCorreo.setText("Correo:");

        lblCorreo1.setText("Domicilio:");

        javax.swing.GroupLayout panelCuerpoRegistroLayout = new javax.swing.GroupLayout(panelCuerpoRegistro);
        panelCuerpoRegistro.setLayout(panelCuerpoRegistroLayout);
        panelCuerpoRegistroLayout.setHorizontalGroup(
            panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                        .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCedula)
                            .addComponent(lblNombre)
                            .addComponent(lblApellido))
                        .addGap(23, 23, 23)
                        .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(txtApellido)))
                    .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                        .addComponent(lblDireccion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtReferencia)
                        .addGap(8, 8, 8))
                    .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                        .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefono)
                            .addComponent(lblCorreo)
                            .addComponent(lblCorreo1))
                        .addGap(18, 18, 18)
                        .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono)
                            .addComponent(txtCorreo)
                            .addComponent(txtDomicilio))))
                .addContainerGap())
        );
        panelCuerpoRegistroLayout.setVerticalGroup(
            panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuerpoRegistroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelCuerpoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCorreo1))
                .addContainerGap())
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnTraer.setText("Traer");
        btnTraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraerActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });

        txtEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadActionPerformed(evt);
            }
        });

        lblCorreo2.setText("EstadoCivil:");

        lblCorreo3.setText("Pais:");

        lblCorreo4.setText("Edad:");

        jLabel1.setText("Sexo:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(txtTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCuerpoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnTraer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCorreo3)
                            .addComponent(lblCorreo2)
                            .addComponent(lblCorreo4)
                            .addComponent(jLabel1))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEstadoCivil)
                            .addComponent(txtPais)
                            .addComponent(txtEdad)
                            .addComponent(txtSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelCuerpoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorreo4))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalir)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnTraer))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtCedula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo cedula no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCedula.requestFocus();// Sirve para ubicar el cursor en un campo vacio.
            return;
        }
        if (!utilidades.validadorDeCedula(txtCedula.getText())) {
            JOptionPane.showMessageDialog(rootPane, "la cedula ingresada no es valida", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo nombres no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNombre.requestFocus();
            return;

        }

        if (txtApellido.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo apellidos no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtApellido.requestFocus();
            return;
        }
        if (txtReferencia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo direccion no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtReferencia.requestFocus();
            return;

        }

        if (txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo telefono no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return;

        }
        if (!utilidades.validarNumeros(txtTelefono.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Los datos ingresados en el telefono no son validos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTelefono.requestFocus();
            return;

        }

        if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo correo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocus();
            return;
        }
        if (!validaremail.isEmail(txtCorreo.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Los datos ingresados en el email no son validos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCorreo.requestFocus();
            return;
        }

        if (txtDomicilio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo Domicilio no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtDomicilio.requestFocus();
            return;
        }

        if (txtPais.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo Pais no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtPais.requestFocus();
            return;
        }

        if (txtEstadoCivil.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo Estado Civil no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtEstadoCivil.requestFocus();
            return;
        }

        if (txtEdad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo Edad no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtEdad.requestFocus();
            return;
        }

        if (txtSexo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "El campo Sexo no tiene datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtSexo.requestFocus();
            return;
        }
        clientes cliente = new clientes();
        cliente.setCedula(txtCedula.getText());
        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellido.getText());
        cliente.setReferencia(txtReferencia.getText());
        cliente.setCorreo(txtCorreo.getText());
        cliente.setDomicilio(txtDomicilio.getText());
        cliente.setPais(txtPais.getText());
        cliente.setEdad(txtEdad.getText());
        cliente.setEstadoCivil(txtEstadoCivil.getText());
        cliente.setSexo(txtSexo.getText());

        System.out.println(cliente.toString());
        if (Nuevocliente.crearcliente(cliente)) {
            JOptionPane.showMessageDialog(rootPane, "Cliente guardado con exito en la  Base de datos.");

            LimpiarCajas();
            bloquear();

        } else {
            JOptionPane.showMessageDialog(rootPane, "No se puede guardar el cliente ", "ERROR", JOptionPane.ERROR_MESSAGE);
            LimpiarCajas();
        }

// TODO add your handling code here:
/*/
        clientes();

        
       
       
        clientes Clientes = new clientes(txtNombre.getText(), txtApellido.getText(), txtReferencia.getText(), txtCorreo.getText(), txtCedula.getText(), txtTelefono.getText());


nuevocliente nuevosclientes = new nuevocliente(); 

nuevosclientes.crearcliente(Clientes);

       /*/

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnTraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraerActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarCajas();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        desbloquear();
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        bloquear();
        LimpiarCajas();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void txtEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadActionPerformed

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
            java.util.logging.Logger.getLogger(GestionClientesV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionClientesV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionClientesV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionClientesV1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionClientesV1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTraer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblCorreo1;
    private javax.swing.JLabel lblCorreo2;
    private javax.swing.JLabel lblCorreo3;
    private javax.swing.JLabel lblCorreo4;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel panelCuerpoRegistro;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtReferencia;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}