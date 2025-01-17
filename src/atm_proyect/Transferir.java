
package atm_proyect;

import static atm_proyect.ATM_PROYECT.CAJERO;
import javax.swing.JOptionPane;



public class Transferir extends javax.swing.JPanel {

    
    public Transferir() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        INPUT_MONTO = new javax.swing.JFormattedTextField();
        INPUT_CUENTA = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/favicon.png"))); // NOI18N
        jLabel1.setText("TRANSFERIR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("NUMERO DE CUENTA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 250, -1));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 270, 18));

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("MONTO TRANSFERENCIA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 230, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 270, 18));

        jButton1.setBackground(new java.awt.Color(102, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, -1));

        INPUT_MONTO.setBackground(new java.awt.Color(255, 255, 255));
        INPUT_MONTO.setBorder(null);
        INPUT_MONTO.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##0.00"))));
        jPanel1.add(INPUT_MONTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 270, 20));

        INPUT_CUENTA.setBackground(new java.awt.Color(255, 255, 255));
        INPUT_CUENTA.setText("Ingrese numero de Cuenta");
        INPUT_CUENTA.setBorder(null);
        INPUT_CUENTA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                INPUT_CUENTAMouseClicked(evt);
            }
        });
        jPanel1.add(INPUT_CUENTA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 270, 20));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/HOWIE.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 290, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Validaciones Capos Vacios
        if (this.INPUT_CUENTA.getText().equals("")|| this.INPUT_MONTO.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "NO SE PERMITEN CAMPOS VACIOS", "ERROR NULL", HEIGHT);
            return;
        }
        //Variables Intermedias
        String Nm_DEPOSITO;
        double Cantidad_Deposito;
        boolean Verificar=false, VerificarCta=false;
        
        //Obtencion de Datos
        Nm_DEPOSITO=this.INPUT_CUENTA.getText();
        Cantidad_Deposito=Double.parseDouble(INPUT_MONTO.getText());
        VerificarCta = CAJERO.CTA_EXISTE(Nm_DEPOSITO);       
        
        //Validacion de Montos Incorrectos,Verificacion de que no sea la misma Cuenta,Verificacion Cuenta Incorrecta
        
        if (Nm_DEPOSITO.equals(CAJERO.getNM_Cuenta())) {
            JOptionPane.showMessageDialog(INPUT_MONTO, "NO SE PUEDE HACER TRANSFERENCIA EN LA MISMA CUENTA", "TRANFERENCIA INVALIDA", HEIGHT);
            return;
        } else if(VerificarCta ==false){
            JOptionPane.showMessageDialog(INPUT_CUENTA, "CUENTA NO EXISTE", "TRANFERENCIA INVALIDA",HEIGHT );
            return;
        } else if(Cantidad_Deposito<0){
            JOptionPane.showMessageDialog(INPUT_MONTO, "No se puede Procesar valores Negativos", "TRANFERENCIA INVALIDA", HEIGHT);
            return;
        } else if(Cantidad_Deposito==0){
            JOptionPane.showMessageDialog(INPUT_MONTO, "Ingrese una Cantidad Mayor", "TRANFERENCIA INVALIDA", HEIGHT);
            return;
        }        
        
        //Verificar Cantidad disponible del depositante
        Verificar=CAJERO.verificacion_fondos(Cantidad_Deposito);
                   
        //Proceso de Datos
        if (Verificar==true) {
            CAJERO.Transferir(Verificar, Cantidad_Deposito, Nm_DEPOSITO);
            JOptionPane.showMessageDialog(INPUT_MONTO, "Transferencia Exitossa", "TRANSFERENCIA", HEIGHT);
        }else{
            JOptionPane.showMessageDialog(INPUT_MONTO, "FONDOS INSUFICIENTES", "TRANSFERENCIA", HEIGHT);
            return;
        }                  
        
       //Setear Texto en Blanco y Setear Texto de Referencia
       this.INPUT_MONTO.setText("");
       this.INPUT_CUENTA.setText("Ingrese numero de Cuenta");
       ;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void INPUT_CUENTAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_INPUT_CUENTAMouseClicked
       //Quitar NM
        if (this.INPUT_CUENTA.getText().equals("Ingrese numero de Cuenta")) {
            this.INPUT_CUENTA.setText("");
        }
       
       
    }//GEN-LAST:event_INPUT_CUENTAMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField INPUT_CUENTA;
    private javax.swing.JFormattedTextField INPUT_MONTO;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
