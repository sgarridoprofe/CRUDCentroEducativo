/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.iesiliberis.crudcentroeducativo.formularios;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author sergio
 */
public class frmUnidades extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmUnidades
     */
    public frmUnidades() {
        initComponents();
        estableceIconos();
    }
    
    private void inicializaBarra(){
        
        jbSave.setEnabled(false);
    }

    private void estableceIconos(){        
        //Icon iconAdd=new ImageIcon("iconos\\add.png");
        //URL url=getClass().getResource("/iconos/add.png");
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jbAdd = new javax.swing.JButton();
        jbEdit = new javax.swing.JButton();
        jbSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jToolBar1.setRollover(true);

        jbAdd.setIcon(new javax.swing.ImageIcon("C:\\ClasesBasicoII\\CRUDCentroEducativo\\iconos\\add.png")); // NOI18N
        jbAdd.setFocusable(false);
        jbAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });
        jToolBar1.add(jbAdd);

        jbEdit.setIcon(new javax.swing.ImageIcon("C:\\ClasesBasicoII\\CRUDCentroEducativo\\iconos\\edit.png")); // NOI18N
        jbEdit.setFocusable(false);
        jbEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditActionPerformed(evt);
            }
        });
        jToolBar1.add(jbEdit);

        jbSave.setIcon(new javax.swing.ImageIcon("C:\\ClasesBasicoII\\CRUDCentroEducativo\\iconos\\guardar.png")); // NOI18N
        jbSave.setFocusable(false);
        jbSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSave.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbSave);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 281, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        // TODO add your handling code here:
        System.out.println("Pulsado ADD....");
        jbEdit.setEnabled(false);
    }//GEN-LAST:event_jbAddActionPerformed

    private void jbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditActionPerformed
        // TODO add your handling code here:
        System.out.println("Editando.....");
    }//GEN-LAST:event_jbEditActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbEdit;
    private javax.swing.JButton jbSave;
    // End of variables declaration//GEN-END:variables
}
