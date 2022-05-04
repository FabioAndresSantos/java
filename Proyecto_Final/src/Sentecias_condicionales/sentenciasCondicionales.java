
package Sentecias_condicionales;

import Proyecto_final.ventana2;
import Sentecias_condicionales.Content.Contenido11;
import Sentecias_condicionales.Content.Contenido12;
import Sentecias_condicionales.Content.Contenido13;
import Variables.Content.Contenido1;

public class sentenciasCondicionales extends javax.swing.JFrame {

    public sentenciasCondicionales() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        S1 = new javax.swing.JButton();
        S2 = new javax.swing.JButton();
        S3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/flecha_roja.png"))); // NOI18N
        jButton1.setActionCommand("RE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(961, 17, 65, 57));

        S1.setText("If ");
        S1.setToolTipText("");
        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });
        getContentPane().add(S1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 270, 178, 88));

        S2.setText("If else");
        S2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S2ActionPerformed(evt);
            }
        });
        getContentPane().add(S2, new org.netbeans.lib.awtextra.AbsoluteConstraints(718, 270, 178, 89));

        S3.setText("Switch-Case");
        S3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S3ActionPerformed(evt);
            }
        });
        getContentPane().add(S3, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 498, 178, 90));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/Sentencias_condicionales.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 1030, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1ActionPerformed
       Contenido11 v=new Contenido11();  
     v.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_S1ActionPerformed

    private void S2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S2ActionPerformed
       Contenido12 v=new Contenido12();  
     v.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_S2ActionPerformed

    private void S3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S3ActionPerformed
      Contenido13 v=new Contenido13();  
     v.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_S3ActionPerformed

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
            java.util.logging.Logger.getLogger(sentenciasCondicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sentenciasCondicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sentenciasCondicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sentenciasCondicionales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sentenciasCondicionales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton S1;
    private javax.swing.JButton S2;
    private javax.swing.JButton S3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
