/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CajaChica;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Daniel
 */
public class JFrmCajaChica extends javax.swing.JFrame {
    private FileInputStream fis;
    private int longitudBytes;
    /**
     * Creates new form JFrmCajaChica
     */
    public JFrmCajaChica() {
        initComponents();
        panelsolicitud.setVisible(false);
        lblfecha.setText(fecha());
        limpiar();
  
    }
    
    public void limpiar(){
        txtnombsol.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
             txtnombsol.setText("");
            }
        });
        
        txtapellsol.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
             txtapellsol.setText("");
            }
        });
        
        txtcedusol.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
             txtcedusol.setText("");
            }
        });
        
        txtnomprod.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
             txtnomprod.setText("");
            }
        });
        
        txtcantprod.addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
             txtcantprod.setText("");
            }
        });
    }

    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Estado = new javax.swing.ButtonGroup();
        panelsolicitud = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnabrir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombsol = new javax.swing.JTextField();
        txtapellsol = new javax.swing.JTextField();
        txtcedusol = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rbtnaprobado = new javax.swing.JRadioButton();
        rbtnrechazado = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtcantprod = new javax.swing.JTextField();
        txtnomprod = new javax.swing.JTextField();
        cmbdependencias = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        btnfinalizar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblnombre = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbtipoarchivo = new javax.swing.JComboBox();
        btnagregarsoli = new javax.swing.JButton();
        btnvisualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelsolicitud.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Buscar Archivo");

        btnabrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CajaChica/Imagenes/folder_yellow_open.png"))); // NOI18N
        btnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre del archivo");

        jLabel4.setText("\"...\"");

        jLabel5.setText("Solicitante");

        txtnombsol.setText("Nombre...");
        txtnombsol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombsolActionPerformed(evt);
            }
        });

        txtapellsol.setText("Apellido...");

        txtcedusol.setText("Cedula....");

        jLabel6.setText("Estado");

        Estado.add(rbtnaprobado);
        rbtnaprobado.setText("Aprobado");

        Estado.add(rbtnrechazado);
        rbtnrechazado.setText("Rechazado");

        jLabel7.setText("Insumo");

        txtcantprod.setText("Cantidad...");

        txtnomprod.setText("Producto...");

        cmbdependencias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DGIP", "Direccion Administrativa" }));

        jLabel8.setText("Dependencias");

        btnagregar.setText("Agregar");

        btnfinalizar.setText("Finalizar");

        javax.swing.GroupLayout panelsolicitudLayout = new javax.swing.GroupLayout(panelsolicitud);
        panelsolicitud.setLayout(panelsolicitudLayout);
        panelsolicitudLayout.setHorizontalGroup(
            panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsolicitudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelsolicitudLayout.createSequentialGroup()
                        .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(panelsolicitudLayout.createSequentialGroup()
                                .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rbtnrechazado, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelsolicitudLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelsolicitudLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnabrir))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelsolicitudLayout.createSequentialGroup()
                                        .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelsolicitudLayout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtnomprod, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelsolicitudLayout.createSequentialGroup()
                                                    .addComponent(jLabel5)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(txtnombsol, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(rbtnaprobado))
                                        .addGap(18, 18, 18)
                                        .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(txtapellsol, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcantprod, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(14, 14, 14)
                                .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtcedusol, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbdependencias, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelsolicitudLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnagregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnfinalizar)))
                .addContainerGap())
        );
        panelsolicitudLayout.setVerticalGroup(
            panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsolicitudLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnabrir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelsolicitudLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2)))
                .addGap(13, 13, 13)
                .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnombsol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellsol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcedusol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnaprobado)
                    .addComponent(cmbdependencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtnrechazado)
                .addGap(18, 18, 18)
                .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtnomprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panelsolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregar)
                    .addComponent(btnfinalizar))
                .addGap(35, 35, 35))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblnombre.setText("Nombre");

        lblfecha.setText("Fecha");

        jLabel1.setText("Tipo de Archivo");

        cmbtipoarchivo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solicitudes", "Aprobaciones" }));

        btnagregarsoli.setText("Agregar Solicitud");
        btnagregarsoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarsoliActionPerformed(evt);
            }
        });

        btnvisualizar.setText("Visualizar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblnombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblfecha))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbtipoarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnagregarsoli)
                        .addGap(18, 18, 18)
                        .addComponent(btnvisualizar)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(lblfecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbtipoarchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnagregarsoli)
                    .addComponent(btnvisualizar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelsolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelsolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombsolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombsolActionPerformed
        // TODO add your handling code here:
        txtnombsol.setFont(new Font("TAHOMA",0,13));
    }//GEN-LAST:event_txtnombsolActionPerformed

    private void btnagregarsoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarsoliActionPerformed
        // TODO add your handling code here:
        panelsolicitud.setVisible(true);
    }//GEN-LAST:event_btnagregarsoliActionPerformed

    private void btnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirActionPerformed
        // TODO add your handling code here:
        JFileChooser se = new JFileChooser();
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);       
        int estado = se.showOpenDialog(null);
       
                    
    }//GEN-LAST:event_btnabrirActionPerformed

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
            java.util.logging.Logger.getLogger(JFrmCajaChica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrmCajaChica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrmCajaChica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrmCajaChica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrmCajaChica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Estado;
    private javax.swing.JButton btnabrir;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnagregarsoli;
    private javax.swing.JButton btnfinalizar;
    private javax.swing.JButton btnvisualizar;
    private javax.swing.JComboBox cmbdependencias;
    private javax.swing.JComboBox cmbtipoarchivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JPanel panelsolicitud;
    private javax.swing.JRadioButton rbtnaprobado;
    private javax.swing.JRadioButton rbtnrechazado;
    private javax.swing.JTextField txtapellsol;
    private javax.swing.JTextField txtcantprod;
    private javax.swing.JTextField txtcedusol;
    private javax.swing.JTextField txtnombsol;
    private javax.swing.JTextField txtnomprod;
    // End of variables declaration//GEN-END:variables
}
