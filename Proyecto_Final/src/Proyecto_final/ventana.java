
package Proyecto_final;

import javax.swing.JOptionPane;

public class ventana extends javax.swing.JFrame {

    
    public ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iniciar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        fondov1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciar.setBackground(new java.awt.Color(255, 204, 255));
        iniciar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        iniciar.setText("INICIAR");
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        getContentPane().add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 610, 190, 70));

        salir.setBackground(new java.awt.Color(204, 153, 255));
        salir.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        getContentPane().add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 610, 180, 70));

        fondov1.setBackground(new java.awt.Color(204, 204, 204));
        fondov1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/v1.png"))); // NOI18N
        getContentPane().add(fondov1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed
       
     ventana2 v=new ventana2();  
     v.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_iniciarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?","", JOptionPane.YES_NO_OPTION);      
        if (resp==0){
        this.dispose();
       }
    }//GEN-LAST:event_salirActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondov1;
    private javax.swing.JButton iniciar;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
