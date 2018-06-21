package accesoadatos;

//El formulario requiere diseño absoluto
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class frmcarros extends javax.swing.JFrame {

    ResultSet rs = null;
    carros cl = new carros(); //instancia de la clase Clientes
    boolean registro = false;
    boolean prueba = false;
    boolean newRecord = false;
    int cantidad = 0;
    int mayor = 0;


    public frmcarros() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void Bloquear(){
        txtCodigoCliente.setEnabled(false);
        txtPrimerApellido.setEnabled(false);
        txtSegundoApellido.setEnabled(false);
        txtNombre.setEnabled(false);
        ftxtFechaNacimiento.setEnabled(false);
        rdbMasculino.setEnabled(false);
        rdbFemenino.setEnabled(false);
        ftxtCelular.setEnabled(false);}

    private void Desbloquear() {
       txtPrimerApellido.setEnabled(true);
       txtSegundoApellido.setEnabled(true);
       txtNombre.setEnabled(true);
       ftxtFechaNacimiento.setEnabled(true);
       rdbMasculino.setEnabled(true);
       rdbFemenino.setEnabled(true);
       ftxtCelular.setEnabled(true);}

    private void Limpiar() {
       txtPrimerApellido.setText("");
       txtSegundoApellido.setText("");
       txtNombre.setText("");
       ftxtFechaNacimiento.setText("");
       btngSexo.clearSelection();
       ftxtCelular.setText("");
    }


 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngSexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ftxtFechaNacimiento = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdbMasculino = new javax.swing.JRadioButton();
        rdbFemenino = new javax.swing.JRadioButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnver = new javax.swing.JButton();
        ftxtCelular = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de clientes");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/informacion.png")).getImage());
        setMinimumSize(new java.awt.Dimension(500, 550));
        setPreferredSize(new java.awt.Dimension(500, 600));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 30));

        txtCodigoCliente.setEnabled(false);
        getContentPane().add(txtCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 50, 20));

        jLabel2.setText("Marca:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtPrimerApellido.setEnabled(false);
        getContentPane().add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 240, 20));

        jLabel3.setText("Color:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        txtSegundoApellido.setEnabled(false);
        getContentPane().add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 240, 20));

        jLabel4.setText("Modelo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        txtNombre.setEnabled(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 320, 20));

        jLabel5.setText("Fecha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, -1));

        try {
            ftxtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxtFechaNacimiento.setText("");
        ftxtFechaNacimiento.setEnabled(false);
        ftxtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtFechaNacimientoActionPerformed(evt);
            }
        });
        getContentPane().add(ftxtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 110, -1));

        jLabel7.setText("Kilometraje:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 60, -1));

        jLabel8.setText("Tipo:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        btngSexo.add(rdbMasculino);
        rdbMasculino.setText("Automatico");
        rdbMasculino.setEnabled(false);
        getContentPane().add(rdbMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        btngSexo.add(rdbFemenino);
        rdbFemenino.setText("Estandar");
        rdbFemenino.setEnabled(false);
        getContentPane().add(rdbFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, 70));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 150, 60));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 297, 140, 70));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 130, 60));

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 140, 60));

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 150, 70));

        btnver.setIcon(new javax.swing.ImageIcon("C:\\Users\\crist\\Downloads\\Nueva carpeta (3)\\accesoADatos\\build\\classes\\iconos\\_active__save.png")); // NOI18N
        btnver.setText("Ver Datos");
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });
        getContentPane().add(btnver, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, -1, -1));
        getContentPane().add(ftxtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        rs = null;
        
        rs = cl.contarRegistros();
        try {
            while (rs.next()) {
                cantidad = rs.getInt(1);
                if (cantidad != 0) {
                    rs = null;
                    //método en clase Clientes
                    rs = cl.mayorRegistro();
                    while (rs.next()) {
                        mayor = rs.getInt(1) + 1;
                        //recuerde que debe completar 5 digitos
                        if (mayor < 10) {
                            txtCodigoCliente.setText("0000" + mayor);
                        } else if (mayor < 100) {
                            this.txtCodigoCliente.setText("000" + mayor);
                        } else if (mayor < 1000) {
                            txtCodigoCliente.setText("00" + mayor);
                        } else if (mayor < 10000) {
                            txtCodigoCliente.setText("0" + mayor);
                        } else {
                            txtCodigoCliente.setText("" + mayor);
                        }
                    }
                } else {
                    txtCodigoCliente.setText("0000"+1);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        Desbloquear();
        Limpiar();
        this.txtPrimerApellido.requestFocus();
        newRecord = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Limpiar();
        Bloquear();
        this.txtCodigoCliente.setText("");
        newRecord = false;
        prueba = false;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        if (newRecord == true) {
            if (this.txtCodigoCliente.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe existir un código de carro", "AVISO DEL SISTEMA", 2);
            } else if (this.txtPrimerApellido.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo marca", "AVISO DEL SISTEMA", 2);
                this.txtPrimerApellido.requestFocus();
            } else if (this.txtNombre.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo modelo", "AVISO DEL SISTEMA", 2);
                this.txtNombre.requestFocus();
            } else if (this.ftxtFechaNacimiento.getText().equals("      ")) {
                JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo FECHA !!", "AVISO DEL SISTEMA", 2);
                this.ftxtFechaNacimiento.requestFocus();
            } else if (rdbMasculino.isSelected()== false && rdbFemenino.isSelected()==false){
                JOptionPane.showMessageDialog(rootPane, "Debe elegir el tipo", "AVISO DEL SISTEMA", 2);
                rdbMasculino.requestFocus();
            } else if (!this.ftxtFechaNacimiento.getText().equals("    ")) {
                //validar fecha 
                Date fechaActual = new Date();
                SimpleDateFormat formato = new SimpleDateFormat("yyyy");
                String cadenaFecha = formato.format(fechaActual);
                
                String year = "" + cadenaFecha.charAt(0) + "" + cadenaFecha.charAt(1) + "" + cadenaFecha.charAt(2) + "" + cadenaFecha.charAt(3);
               
                int y = Integer.parseInt(year);
                String texto = this.ftxtFechaNacimiento.getText();
                
                String anios = texto.charAt(6) + "" + texto.charAt(7) + "" + texto.charAt(8) + "" + texto.charAt(9);
                
                int anio = Integer.parseInt(anios);
                
                
                 if ((anio > y)) {
                    JOptionPane.showMessageDialog(rootPane, "El Año de la fecha ingresada no puede ser mayor al año actual (" + y + ")!!!", "AVISO DEL SISTEMA", 0);
                    this.ftxtFechaNacimiento.setText("");
                    this.ftxtFechaNacimiento.requestFocus();
                } else if ((anio < 1920)) {
                    JOptionPane.showMessageDialog(rootPane, "El Año de la fecha ingresada es incoherente!!!", "AVISO DEL SISTEMA", 0);
                    this.ftxtFechaNacimiento.setText("");
                    this.ftxtFechaNacimiento.requestFocus();
                
                } else {
                    if (this.ftxtCelular.getText().equals("   ")) {
                        JOptionPane.showMessageDialog(rootPane, "Debe llenar el campo kilometraje!!", "AVISO DEL SISTEMA", 2);
                        this.ftxtCelular.requestFocus();
                    } else {
                        
                        if (rdbMasculino.isSelected()==true){
                          cl.insertar(this.txtCodigoCliente.getText(), this.txtPrimerApellido.getText().toUpperCase(), this.txtSegundoApellido.getText().toUpperCase(), this.txtNombre.getText().toUpperCase(), this.ftxtFechaNacimiento.getText(), "M", this.ftxtCelular.getText()); }
                        else{
                          cl.insertar(this.txtCodigoCliente.getText(), this.txtPrimerApellido.getText().toUpperCase(), this.txtSegundoApellido.getText().toUpperCase(), this.txtNombre.getText().toUpperCase(), this.ftxtFechaNacimiento.getText(), "F", this.ftxtCelular.getText());}
                        JOptionPane.showMessageDialog(rootPane, "Registro guardado exitosamente!!", "AVISO DEL SISTEMA", 1);
                        Bloquear();
                        Limpiar();
                        this.txtCodigoCliente.setText("");
                        newRecord = false;
                    }
                }
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String codigo = JOptionPane.showInputDialog("Ingrese el código de csrro a búscar:");
        rs = cl.buscar(codigo);
        try {
            while (rs.next()) {
                this.txtCodigoCliente.setText(rs.getString(1));
                this.txtPrimerApellido.setText(rs.getString(2));
                this.txtSegundoApellido.setText(rs.getString(3));
                this.txtNombre.setText(rs.getString(4));
                this.ftxtFechaNacimiento.setText(rs.getString(5));
                if (rs.getString(6).equals("M")){
                    rdbMasculino.setSelected(true);}
                else{
                    rdbFemenino.setSelected(true);
                }
                this.ftxtCelular.setText(rs.getString(7));
                prueba = true;
                registro = true;
                newRecord = false;
            }
            if (registro == false) {
                JOptionPane.showMessageDialog(rootPane, "Registro no encontrado!!!", "AVISO DEL SISTEMA", 0);
                //this.txtCodigo.setText("");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(rootPane, ex.getMessage(), "AVISO DEL SISTEMA", 0);
        }
        registro = false;
        Bloquear();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //es porque ya encontre el registro buscado (codigo)    
        if (prueba == true) {
            Desbloquear();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (prueba == true) {
            String codigo = this.txtCodigoCliente.getText();
            if (JOptionPane.showConfirmDialog(rootPane, "¿Desea eliminar el registro búscado?") == 0) {
                cl.eliminar(codigo);
                JOptionPane.showMessageDialog(rootPane, "Registro eliminado exitosamente!!", "AVISO DEL SISTEMA", 1);
                Bloquear();
                Limpiar();
                this.txtCodigoCliente.setText("");
                this.btnNuevo.setVisible(true);
                this.btnCancelar.setVisible(false);
                this.btnGuardar.setVisible(true);
                this.btnver.setVisible(false);
                prueba = false;
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        Bloquear();
    }//GEN-LAST:event_formFocusGained

    private void ftxtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtFechaNacimientoActionPerformed

    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
        vercarros jframe = new vercarros();
            jframe.setVisible(true);
    }//GEN-LAST:event_btnverActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmcarros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.ButtonGroup btngSexo;
    private javax.swing.JButton btnver;
    private javax.swing.JTextField ftxtCelular;
    private javax.swing.JFormattedTextField ftxtFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdbFemenino;
    private javax.swing.JRadioButton rdbMasculino;
    private javax.swing.JTextField txtCodigoCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtSegundoApellido;
    // End of variables declaration//GEN-END:variables

}
