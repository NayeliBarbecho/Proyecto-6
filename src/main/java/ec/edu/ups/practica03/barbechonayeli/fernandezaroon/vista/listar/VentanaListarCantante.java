/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.practica03.barbechonayeli.fernandezaroon.vista.listar;

import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.controlador.ControladorCantante;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Cantante;
import ec.edu.ups.practica03.barbechonayeli.fernandezaroon.modelo.Disco;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class VentanaListarCantante extends javax.swing.JInternalFrame {
ControladorCantante cantanteControlador;
    /**
     * Creates new form ListarCantante
     */
    public VentanaListarCantante(ControladorCantante cantanteControlador) {
        initComponents();
        this.cantanteControlador=cantanteControlador;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCantante = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDiscos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Listar Compositor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 14))); // NOI18N

        tblCantante.setBackground(new java.awt.Color(204, 255, 153));
        tblCantante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Edad", "Nacionalidad", "Salario", "Salario Total", "Nombre Artistico", "Genero Musical", "Numero Sencillos", "Numero Conciertos", "Numero Giras"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCantante);

        tblDiscos.setBackground(new java.awt.Color(204, 255, 102));
        tblDiscos.setFont(new java.awt.Font("Segoe UI Black", 2, 12)); // NOI18N
        tblDiscos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Año de Lanzamiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDiscos);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 566, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(441, 441, 441))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setEnabled(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       this.cargarDatosCantante();
       this.cargarDatosTablaDisco();
    }//GEN-LAST:event_formInternalFrameActivated
private void cargarDatosCantante(){
     DefaultTableModel modelo = (DefaultTableModel) this.tblCantante.getModel();
        modelo.setNumRows(0);
        List<Cantante> listaCantante = cantanteControlador.listar();
        for (Cantante cantante: listaCantante) {
            String nombre = cantante.getNombre();
            String nombreArtistico = cantante.getNombreArtistico();

            String apellido = cantante.getApellido();
            String nacionalidad = cantante.getNacionalidad();
            String genero = cantante.getGeneroMusica();

            int codigoU=cantante.getCodigo();
            int edadU=cantante.getEdad();
            int conciertosU=cantante.getNumeroDeConciertos();
            int girasU=cantante.getNumeroDeGiras();
            int sencillosU=cantante.getNumeroDeSencillos();
            double salarioU=cantante.getSalario();
            String codigo=String.valueOf(codigoU);
            String edad=String.valueOf(edadU);
            String salario=String.valueOf(salarioU);
            
            Object[] rowData = {codigo,nombre,apellido,edad,nacionalidad,salario,nombreArtistico,genero,sencillosU,conciertosU,girasU};
            modelo.addRow(rowData);
        }
        this.tblCantante.setModel(modelo);
}
private void cargarDatosTablaDisco() {
        DefaultTableModel modelo = (DefaultTableModel) this.tblDiscos.getModel();
        modelo.setNumRows(0);
        List<Disco> listaDisco = cantanteControlador. listarDisco();
        for (   Disco disco : listaDisco) {
            String nombre = disco.getNombreDisco();
            
            int codigoU=disco.getCodigo();
            double aniosL=disco.getAnioDeLanzamiento();
            String codigo=String.valueOf(codigoU);
            String anios=String.valueOf(aniosL);
            
            Object[] rowData = {codigo,nombre,anios};
            modelo.addRow(rowData);
        }
        this.tblDiscos.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCantante;
    private javax.swing.JTable tblDiscos;
    // End of variables declaration//GEN-END:variables
}