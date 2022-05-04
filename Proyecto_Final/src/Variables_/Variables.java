
package Variables_;

import Proyecto_final.ventana2;
import Variables.Content.Contenido1;
import Variables.Content.Contenido2;
import Variables.Content.Contenido3;
import Variables.Content.Contenido4;
import Variables.Content.Contenido5;
import Variables.Content.Contenido6;


public class Variables extends javax.swing.JFrame {

 
    public Variables() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        V3 = new javax.swing.JButton();
        V4 = new javax.swing.JButton();
        V5 = new javax.swing.JButton();
        V6 = new javax.swing.JButton();
        RETROCESO = new javax.swing.JButton();
        V2 = new javax.swing.JButton();
        v1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        V3.setText("DOUBLE");
        V3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V3ActionPerformed(evt);
            }
        });
        getContentPane().add(V3, new org.netbeans.lib.awtextra.AbsoluteConstraints(713, 229, 180, 87));

        V4.setText("FLOAT");
        V4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V4ActionPerformed(evt);
            }
        });
        getContentPane().add(V4, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 416, 178, 88));

        V5.setBackground(new java.awt.Color(204, 204, 204));
        V5.setText("CHAR");
        V5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V5ActionPerformed(evt);
            }
        });
        getContentPane().add(V5, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 415, 175, 89));

        V6.setText("BOOLEAN");
        V6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V6ActionPerformed(evt);
            }
        });
        getContentPane().add(V6, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 603, 177, 90));

        RETROCESO.setBackground(new java.awt.Color(0, 0, 0));
        RETROCESO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/flecha_verde.png"))); // NOI18N
        RETROCESO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RETROCESOActionPerformed(evt);
            }
        });
        getContentPane().add(RETROCESO, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 16, 65, 57));

        V2.setText("STRING");
        V2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V2ActionPerformed(evt);
            }
        });
        getContentPane().add(V2, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 603, 178, 88));

        v1.setText("INT");
        v1.setToolTipText("");
        v1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                v1ActionPerformed(evt);
            }
        });
        getContentPane().add(v1, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 229, 179, 89));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/v3.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void V6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V6ActionPerformed
        Contenido6 v=new Contenido6();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_V6ActionPerformed

    private void V5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V5ActionPerformed
        Contenido5 v=new Contenido5();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_V5ActionPerformed

    private void V4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V4ActionPerformed
        Contenido4 v=new Contenido4();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_V4ActionPerformed

    private void V3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V3ActionPerformed
        Contenido3 v=new Contenido3();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_V3ActionPerformed

    private void V2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V2ActionPerformed
        Contenido2 v=new Contenido2();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_V2ActionPerformed

    private void v1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_v1ActionPerformed
        Contenido1 v=new Contenido1();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_v1ActionPerformed

    private void RETROCESOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RETROCESOActionPerformed
        this.hide();
        ventana2 atras = new ventana2 ();
        atras.setVisible(true);
    }//GEN-LAST:event_RETROCESOActionPerformed

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
            java.util.logging.Logger.getLogger(Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Variables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Variables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RETROCESO;
    private javax.swing.JButton V2;
    private javax.swing.JButton V3;
    private javax.swing.JButton V4;
    private javax.swing.JButton V5;
    private javax.swing.JButton V6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton v1;
    // End of variables declaration//GEN-END:variables
}
