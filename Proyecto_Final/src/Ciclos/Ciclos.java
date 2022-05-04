
package Ciclos;

import Ciclos.Content.Contenido14;
import Ciclos.Content.Contenido15;
import Ciclos.Content.Contenido16;
import Proyecto_final.ventana2;

/**
 *
 * @author Andres Santos
 */
public class Ciclos extends javax.swing.JFrame {

    public Ciclos() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Atras = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        C3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Atras.setBackground(new java.awt.Color(0, 0, 0));
        Atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/flecha-hacia-abajo.png"))); // NOI18N
        Atras.setActionCommand("RE");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(957, 16, 67, 55));

        C1.setText("For");
        C1.setToolTipText("");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });
        getContentPane().add(C1, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 281, 177, 87));

        C2.setText("While");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });
        getContentPane().add(C2, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 281, 179, 88));

        C3.setText("Do");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });
        getContentPane().add(C3, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 530, 178, 88));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/ciclos.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
       Contenido14 v=new Contenido14();  
     v.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
     Contenido15 v=new Contenido15();  
     v.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
       Contenido16 v=new Contenido16();  
     v.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_C3ActionPerformed

    private void AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasActionPerformed
       this.hide();
        ventana2 atras = new ventana2 ();
        atras.setVisible(true);
    }//GEN-LAST:event_AtrasActionPerformed

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ciclos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Atras;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
