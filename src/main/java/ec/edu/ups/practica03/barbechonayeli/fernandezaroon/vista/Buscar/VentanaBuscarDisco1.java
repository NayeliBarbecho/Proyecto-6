/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica03.barbechonayeli.fernandezaroon.vista.Buscar;

import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador.ControladorCantante;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Disco;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class VentanaBuscarDisco1 extends javax.swing.JInternalFrame {
ControladorCantante cantanteControlador;
private ResourceBundle mensajes;
    /**
     * Creates new form VentanaBuscarDisco1
     */
    public VentanaBuscarDisco1() {
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

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblAnios = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtAnios = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Buscar Cancion"));

        lblCodigo.setText("Codigo:");

        lblNombre.setText("Nombre:");

        lblAnios.setText("Años de Lanzamiento:");

        txtCodigo.setEditable(false);

        txtAnios.setEditable(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAnios)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNombre)
                                .addComponent(lblCodigo))))
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(257, 257, 257))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnios)
                    .addComponent(txtAnios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnBuscar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre= txtNombre.getText();

        String codigo=txtCodigo.getText();
int codigoUno=Integer.parseInt(codigo);
        String años=txtAnios.getText();

        Disco disco = cantanteControlador.buscarDisco(codigoUno);

        if (disco != null) {
            txtNombre.setText(disco.getNombreDisco());
            
            txtAnios.setText(disco.getAnioDeLanzamiento()+"");

            disco.setCodigo(codigoUno);

        }else{
            JOptionPane.showMessageDialog(this, "La persona con la cedula"+codigoUno+"No fue econtrada");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed
public void cambiarIdioma(Locale localizacion){
        mensajes = ResourceBundle.getBundle("mensajes.mensaje", localizacion);
        lblCodigo.setText(mensajes.getString("lblcodigo"));
        lblNombre.setText(mensajes.getString("lblnombre"));
        
        lblAnios.setText(mensajes.getString("lblanio"));
        btnBuscar.setText(mensajes.getString("btnbuscar"));
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAnios;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtAnios;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}