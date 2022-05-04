
package Proyecto_final;

import Sentecias_condicionales.sentenciasCondicionales;
import Ciclos.Ciclos;
import Operadores.Operadores;
import Metodo_print.metodoPrint;
import Variables_.Variables;
import evaluacion.Conocimiento;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ventana2 extends javax.swing.JFrame {

    String dato;
    public ventana2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    ventana2(ventana aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fotos = new javax.swing.JLabel();
        Fotos = new javax.swing.JLabel();
        EMPEZAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JList<>();
        Regresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        fondov2 = new javax.swing.JLabel();

        fotos.setBackground(new java.awt.Color(255, 255, 255));
        fotos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fotos.setForeground(new java.awt.Color(255, 255, 255));
        Fotos.setText("jLabel1");
        getContentPane().add(Fotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 140, 540, 410));

        EMPEZAR.setBackground(new java.awt.Color(153, 51, 255));
        EMPEZAR.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        EMPEZAR.setForeground(new java.awt.Color(255, 255, 255));
        EMPEZAR.setText("EMPEZAR");
        EMPEZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EMPEZARActionPerformed(evt);
            }
        });
        getContentPane().add(EMPEZAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 112, 84));

        datos.setBackground(new java.awt.Color(0, 0, 0));
        datos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        datos.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        datos.setForeground(new java.awt.Color(255, 255, 255));
        datos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "variables", "metodo print", "operadores", "sentencias condicionales", "ciclos" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        datos.setToolTipText("");
        datos.setAutoscrolls(false);
        datos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(datos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 220, 220));

        Regresar.setBackground(new java.awt.Color(0, 0, 0));
        Regresar.setForeground(new java.awt.Color(255, 255, 255));
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/flecha-hacia-abajo (1).png"))); // NOI18N
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 67, 59));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Prueba de conocimientos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 578, 230, 109));

        fondov2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/v2.png"))); // NOI18N
        getContentPane().add(fondov2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    
    private void EMPEZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EMPEZARActionPerformed

        if("variables".equals(dato)) {
           Variables v =new Variables();  
             v.setVisible(true);
     this.setVisible(false);
     
        }if("metodo print".equals(dato)) {
           metodoPrint v=new metodoPrint();  
             v.setVisible(true);
     this.setVisible(false);
        }if("operadores".equals(dato)) {
           Operadores v=new Operadores();  
             v.setVisible(true);
     this.setVisible(false);
        }if("sentencias condicionales".equals(dato)) {
           sentenciasCondicionales v=new sentenciasCondicionales();  
             v.setVisible(true);
     this.setVisible(false);
        }if("ciclos".equals(dato)) {
           Ciclos v=new Ciclos();  
             v.setVisible(true);
     this.setVisible(false);
      }
    }//GEN-LAST:event_EMPEZARActionPerformed

    private void datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosMouseClicked
        dato = datos.getSelectedValue();
        if("variables".equals(dato)){
            ImageIcon icono = new ImageIcon(getClass().getResource(""));
            Fotos.setIcon(icono);
        }
        if("metodo print".equals(dato)){
            ImageIcon icono = new ImageIcon(getClass().getResource(""));
            Fotos.setIcon(icono);      
        }
        if("operadores".equals(datos)){
            ImageIcon icono = new ImageIcon(getClass().getResource(""));
            Fotos.setIcon(icono);
        }
        if("sentencias condicionales".equals(datos)){
            ImageIcon icono = new ImageIcon(getClass().getResource(""));
            Fotos.setIcon(icono);
        }
        if("ciclos".equals("ciclos")){
            ImageIcon icono = new ImageIcon(getClass().getResource(""));
            Fotos.setIcon(icono);
        }   
    }//GEN-LAST:event_datosMouseClicked

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.hide();
        ventana atras = new ventana ();
        atras.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.hide();
       Conocimiento a= new Conocimiento();
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EMPEZAR;
    private javax.swing.JLabel Fotos;
    private javax.swing.JButton Regresar;
    private javax.swing.JList<String> datos;
    private javax.swing.JLabel fondov2;
    private javax.swing.JLabel fotos;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
