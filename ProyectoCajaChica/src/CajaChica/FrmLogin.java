/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajaChica;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author CLIENTE
 */
public class FrmLogin extends javax.swing.JFrame {

    ArrayList<Object> usuarios = new ArrayList<>();
    int idUser = 0;
    String DirecUser = "direccion";
    String AdminUser = "administrador";
    String PassDirecUser = "esfot";
    String PassAdminUser = "esfot";
    
    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        lblfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 57)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("ESFOT");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 180, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 35)); // NOI18N
        jLabel3.setText("Ingrese sus datos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 440, 120, -1));

        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 370, -1));

        cmbCargo.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Un Cargo", "Direccion ESFOT", "Administrador" }));
        getContentPane().add(cmbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, -1, -1));

        btnLogin.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        btnLogin.setText("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 110, -1));

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 370, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 57)); // NOI18N
        jLabel5.setText("Sistema De Control De Caja Chica");
        jLabel5.setToolTipText("");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 790, -1));

        lblfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CajaChica/Imagenes/FondoLogin.jpg"))); // NOI18N
        getContentPane().add(lblfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if (cmbCargo.getSelectedIndex() == 1) {
            String user = txtUser.getText();
            String pass = txtPassword.getText();
            if ("director".equals(txtUser.getText())) {
                Conexion.setcuenta(user, pass);
                Conexion.getConexion();
                if (Conexion.getstatus()) {
                    FrmTransaccion newTra = new FrmTransaccion();
                    newTra.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecta");
                }
            }else{
                    JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecta");
            }


        }
        if (cmbCargo.getSelectedIndex() == 2) {
            String user = txtUser.getText();
            String pass = txtPassword.getText();

            if ("administrador".equals(txtUser.getText())) {
                Conexion.setcuenta(user, pass);
                Conexion.getConexion();
                if (Conexion.getstatus()) {
                    FrmTransaccion newTra = new FrmTransaccion();
                    newTra.setVisible(true);
                    this.setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecta");
                }
            }else{
                    JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecta");
            }


        }
        if(cmbCargo.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un cargo");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (cmbCargo.getSelectedIndex() == 1) {
                String user = txtUser.getText();
                String pass = txtPassword.getText();
                if ("director".equals(txtUser.getText())) {
                    Conexion.setcuenta(user, pass);
                    Conexion.getConexion();
                    if (Conexion.getstatus()) {
                        FrmTransaccion newTra = new FrmTransaccion();
                        newTra.setVisible(true);
                        this.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecta");
                    }
                }else{
                        JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecta");
                }
                

            }
            if (cmbCargo.getSelectedIndex() == 2) {
                String user = txtUser.getText();
                String pass = txtPassword.getText();
                
                if ("administrador".equals(txtUser.getText())) {
                    Conexion.setcuenta(user, pass);
                    Conexion.getConexion();
                    if (Conexion.getstatus()) {
                        FrmTransaccion newTra = new FrmTransaccion();
                        newTra.setVisible(true);
                        this.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecta");
                    }
                }else{
                        JOptionPane.showMessageDialog(rootPane, "Usuario o contraseña incorrecta");
                }

                
            }
            if(cmbCargo.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(rootPane, "Por favor seleccione un cargo");
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUserActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblfondo;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
