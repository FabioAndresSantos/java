/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operadores;

import Operadores.Content.Contenido8;
import Operadores.Content.Contenido9;
import Operadores.Content.Contenido10;
import Proyecto_final.ventana2;
import Variables.Content.Contenido1;

/**
 *
 * @author Andres Santos
 */
public class Operadores extends javax.swing.JFrame {

    /**
     * Creates new form operadoresLogicos
     */
    public Operadores() {
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

        jButton1 = new javax.swing.JButton();
        O1 = new javax.swing.JButton();
        O2 = new javax.swing.JButton();
        O3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/flecha_azul.png"))); // NOI18N
        jButton1.setActionCommand("RE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 16, 65, 57));

        O1.setText("Relacionales");
        O1.setToolTipText("");
        O1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O1ActionPerformed(evt);
            }
        });
        getContentPane().add(O1, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 497, 179, 89));

        O2.setText("Aritmeticos");
        O2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O2ActionPerformed(evt);
            }
        });
        getContentPane().add(O2, new org.netbeans.lib.awtextra.AbsoluteConstraints(717, 289, 177, 89));

        O3.setText("Logicos");
        O3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O3ActionPerformed(evt);
            }
        });
        getContentPane().add(O3, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 289, 177, 89));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/operadores.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 2, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void O1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O1ActionPerformed
      Contenido8 v=new Contenido8();  
     v.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_O1ActionPerformed

    private void O2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O2ActionPerformed
        Contenido9 v=new Contenido9();  
     v.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_O2ActionPerformed

    private void O3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O3ActionPerformed
       Contenido10 v=new Contenido10();  
     v.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_O3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      this.hide();
        ventana2 atras = new ventana2 ();
        atras.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton O1;
    private javax.swing.JButton O2;
    private javax.swing.JButton O3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}