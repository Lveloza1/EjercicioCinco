/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class principal extends javax.swing.JFrame {

    /**
     * Creates new form principal
     */
    public principal() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDescuento5 = new javax.swing.JTextField();
        txtDescuento4 = new javax.swing.JTextField();
        txtDescuento1 = new javax.swing.JTextField();
        txtSueldoFinal = new javax.swing.JTextField();
        txtSueldoBase = new javax.swing.JTextField();
        cmdBorrar = new javax.swing.JButton();
        cmdCalcular = new javax.swing.JButton();
        txtDescuento05 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Vrinda", 1, 18)); // NOI18N
        jLabel1.setText("5. Descuentos sobre el sueldo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel2.setText("Sueldo base");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel3.setText("Ley politica pública 1%");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel4.setText("Seguro social 4%");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel5.setText("Seguro forzoso 0.5%");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel6.setText("Caja de ahorro 5%");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel7.setText("Sueldo final");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        txtDescuento5.setEditable(false);
        getContentPane().add(txtDescuento5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 100, 30));

        txtDescuento4.setEditable(false);
        getContentPane().add(txtDescuento4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 100, 30));

        txtDescuento1.setEditable(false);
        getContentPane().add(txtDescuento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 100, 30));

        txtSueldoFinal.setEditable(false);
        getContentPane().add(txtSueldoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 100, 30));

        txtSueldoBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoBaseKeyTyped(evt);
            }
        });
        getContentPane().add(txtSueldoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 100, 30));

        cmdBorrar.setText("Limpiar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 70, 30));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 80, 30));

        txtDescuento05.setEditable(false);
        getContentPane().add(txtDescuento05, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
double d1, d2, d3, d4, total,totalf, base;
String des1, des2, des3, des4, sfinal;

    if(txtSueldoBase.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Digite sueldo base","error", JOptionPane.ERROR_MESSAGE);
         txtSueldoBase.requestFocusInWindow();
         txtSueldoBase.selectAll();

       }

    else{
        
        base=Double.parseDouble(txtSueldoBase.getText());
    
        d1=(base*0.01);
        d2=(base*0.04);
        d3=(base*0.005);
        d4=(base*0.05);
        
       total=(d1+d2+d3+d4);
       totalf=(base-total);
        
        
      des1=String.valueOf(d1);
    txtDescuento1.setText (des1);    
    
    des2=String.valueOf(d2);
    txtDescuento4.setText (des2);  
    
    des3=String.valueOf(d3);
    txtDescuento05.setText(des3); 

    des4=String.valueOf(d4);
    txtDescuento5.setText(des4);  
        
    sfinal=String.valueOf(totalf);
    txtSueldoFinal.setText(sfinal);
        
        
    }


    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void txtSueldoBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoBaseKeyTyped
char c=evt.getKeyChar(); 
       
          if(!Character.isDigit(c)) {
              
              getToolkit().beep();    
              evt.consume(); 
          }
              
    }//GEN-LAST:event_txtSueldoBaseKeyTyped

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
     txtSueldoBase.setText("");
     txtDescuento1.setText("");
     txtDescuento4.setText("");
     txtDescuento05.setText("");
     txtDescuento5.setText("");
     txtSueldoFinal.setText("");
     txtSueldoBase.requestFocusInWindow();

        
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtDescuento05;
    private javax.swing.JTextField txtDescuento1;
    private javax.swing.JTextField txtDescuento4;
    private javax.swing.JTextField txtDescuento5;
    private javax.swing.JTextField txtSueldoBase;
    private javax.swing.JTextField txtSueldoFinal;
    // End of variables declaration//GEN-END:variables
}
