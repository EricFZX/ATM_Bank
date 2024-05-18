/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm_proyect;


import static atm_proyect.ATM_PROYECT.CAJERO;
import static atm_proyect.ATM_PROYECT.LOGIN;
import javax.swing.JOptionPane;

/**
 *
 * @author FZ
 */
public class GUI_LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form GUI_LOGIN
     */
    public GUI_LOGIN() {
        initComponents();
        setLocationRelativeTo(null);   
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
        CONTENT_PANEL = new javax.swing.JPanel();
        City_night = new javax.swing.JLabel();
        Logo_FAV = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        USER_LABEL = new javax.swing.JLabel();
        USER_INPUT = new javax.swing.JTextField();
        Separator_1 = new javax.swing.JSeparator();
        PASS_LABEL = new javax.swing.JLabel();
        PASS_INPUT = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        INGRESAR_BTN = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        CONTENT_PANEL.setBackground(new java.awt.Color(255, 255, 255));
        CONTENT_PANEL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        City_night.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/DIFUMINADO.jpeg"))); // NOI18N
        CONTENT_PANEL.add(City_night, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 160, 340));

        Logo_FAV.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        Logo_FAV.setForeground(new java.awt.Color(0, 0, 0));
        Logo_FAV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/favicon.png"))); // NOI18N
        Logo_FAV.setText("BANCO CEUTEC");
        CONTENT_PANEL.add(Logo_FAV, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 250, 40));

        title.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("INICIAR SESION");
        CONTENT_PANEL.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        USER_LABEL.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        USER_LABEL.setForeground(new java.awt.Color(0, 0, 0));
        USER_LABEL.setText("Usuario");
        CONTENT_PANEL.add(USER_LABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        USER_INPUT.setBackground(new java.awt.Color(255, 255, 255));
        USER_INPUT.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        USER_INPUT.setForeground(new java.awt.Color(204, 204, 204));
        USER_INPUT.setText("Ingrese su nombre de usuario");
        USER_INPUT.setBorder(null);
        USER_INPUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                USER_INPUTMouseClicked(evt);
            }
        });
        USER_INPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USER_INPUTActionPerformed(evt);
            }
        });
        CONTENT_PANEL.add(USER_INPUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 220, 20));

        Separator_1.setForeground(new java.awt.Color(0, 0, 0));
        CONTENT_PANEL.add(Separator_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 220, 10));

        PASS_LABEL.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        PASS_LABEL.setForeground(new java.awt.Color(0, 0, 0));
        PASS_LABEL.setText("Contraseña");
        CONTENT_PANEL.add(PASS_LABEL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        PASS_INPUT.setBackground(new java.awt.Color(255, 255, 255));
        PASS_INPUT.setFont(new java.awt.Font("Roboto", 1, 11)); // NOI18N
        PASS_INPUT.setText("********");
        PASS_INPUT.setBorder(null);
        PASS_INPUT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PASS_INPUTMouseClicked(evt);
            }
        });
        PASS_INPUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASS_INPUTActionPerformed(evt);
            }
        });
        CONTENT_PANEL.add(PASS_INPUT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 220, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        CONTENT_PANEL.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 220, 10));

        INGRESAR_BTN.setBackground(new java.awt.Color(102, 204, 255));
        INGRESAR_BTN.setForeground(new java.awt.Color(255, 255, 255));
        INGRESAR_BTN.setText("Ingresar");
        INGRESAR_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESAR_BTNActionPerformed(evt);
            }
        });
        CONTENT_PANEL.add(INGRESAR_BTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CONTENT_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CONTENT_PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void USER_INPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USER_INPUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USER_INPUTActionPerformed

    private void PASS_INPUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASS_INPUTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASS_INPUTActionPerformed

    private void INGRESAR_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESAR_BTNActionPerformed
        //Variables Temporales
        String NmCuenta=this.USER_INPUT.getText();
        String PIN=String.valueOf(this.PASS_INPUT.getPassword());
        boolean acceso=false;
        
        //Verificacion y Abertura de Nuevo Frame.
        try{
            acceso=CAJERO.Verificar_Usuario(NmCuenta, PIN);
            if (acceso==true) {
                this.dispose();
                GUI_BANCO BANCO_MAIN = new GUI_BANCO();
                this.USER_INPUT.setText("Ingrese su nombre de usuario");
                this.PASS_INPUT.setText("********");
                BANCO_MAIN.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(rootPane, "USUARIO O PIN INCORRECTO", "USER", HEIGHT);
            }
        }catch(Exception E){
            JOptionPane.showMessageDialog(rootPane, "ERROR DETECTADO"+E, "ERROR", HEIGHT);
        }
        
        
        
        
    }//GEN-LAST:event_INGRESAR_BTNActionPerformed

    private void USER_INPUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USER_INPUTMouseClicked
        if (this.USER_INPUT.getText().equals("Ingrese su nombre de usuario")) {
            this.USER_INPUT.setText("");
        }
        if (String.valueOf(this.PASS_INPUT.getPassword()).equals("")) {
            this.PASS_INPUT.setText("********");     
        }
    }//GEN-LAST:event_USER_INPUTMouseClicked

    private void PASS_INPUTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PASS_INPUTMouseClicked
        if (String.valueOf(this.PASS_INPUT.getPassword()).equals("********")) {
            this.PASS_INPUT.setText(""); 
        }
        if (this.USER_INPUT.getText().equals("")) {
            this.USER_INPUT.setText("Ingrese su nombre de usuario");
        }
    }//GEN-LAST:event_PASS_INPUTMouseClicked

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
            java.util.logging.Logger.getLogger(GUI_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CONTENT_PANEL;
    private javax.swing.JLabel City_night;
    private javax.swing.JButton INGRESAR_BTN;
    private javax.swing.JLabel Logo_FAV;
    private javax.swing.JPasswordField PASS_INPUT;
    private javax.swing.JLabel PASS_LABEL;
    private javax.swing.JSeparator Separator_1;
    private javax.swing.JTextField USER_INPUT;
    private javax.swing.JLabel USER_LABEL;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}