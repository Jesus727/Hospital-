package Interfaces;


import Funciones.FSeleccionar;
import Conectar.Conectar;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
    FSeleccionar Reg = new FSeleccionar();
    public Login() {
        initComponents();
        setTitle("Iniciar Sesión");
        setLocationRelativeTo(null); 
    }
void entrar(){
    Reg.entrar(USUARIO.getText(),CONTRASEÑA.getText());
    if(Conectar.ver == 0){
                if(Conectar.tipo_acc.equals("Administrador")){
                    Menu n = new Menu();
                    n.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null,"Bienvenido Administrador","java",1);
                    Menu.MenuCrear.setEnabled(true);
                    Menu.CrearUsuario.setEnabled(true);
                    
                    Menu.MenuIngresar.setEnabled(true);
                    Menu.IngDepartamento.setEnabled(true);
                    Menu.IngEspecialidad.setEnabled(true);
                    Menu.IngIsapre.setEnabled(true);
                    Menu.IngFuncionario.setEnabled(true);
                    Menu.IngCama.setEnabled(true);
                    Menu.IngItems.setEnabled(true);
                    
                    Menu.MenuRegistros.setEnabled(true);
                    Menu.RegPaciente.setEnabled(true);
                    
                    Menu.MenuOperaciones.setEnabled(true);
                    Menu.OpTratamiento.setEnabled(true);
                    Menu.OpGastos.setEnabled(true);
                    Menu.OpFactura.setEnabled(true);
                    
                    Menu.MenuInformacion.setEnabled(true);
                    Menu.Info.setEnabled(true);

                    
                    Menu.MenuSalir.setEnabled(true);
                    Menu.Salir.setEnabled(true);
                }
    }else{
        USUARIO.setText("");
        CONTRASEÑA.setText("");
    }
    if(Conectar.ver == 0){
                if(Conectar.tipo_acc.equals("Medico")){
                    Menu n = new Menu();
                    n.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null,"Bienvenido Medico","java",1);
                    Menu.MenuCrear.setEnabled(false);
                    Menu.CrearUsuario.setEnabled(false);
                    
                    Menu.MenuIngresar.setEnabled(false);
                    Menu.IngDepartamento.setEnabled(false);
                    Menu.IngEspecialidad.setEnabled(false);
                    Menu.IngIsapre.setEnabled(false);
                    Menu.IngFuncionario.setEnabled(false);
                    Menu.IngCama.setEnabled(false);
                    Menu.IngItems.setEnabled(false);
                    
                    Menu.MenuRegistros.setEnabled(false);
                    Menu.RegPaciente.setEnabled(false);
                    
                    Menu.MenuOperaciones.setEnabled(true);
                    Menu.OpTratamiento.setEnabled(true);
                    Menu.OpGastos.setEnabled(false);
                    Menu.OpFactura.setEnabled(false);
                    
                    Menu.MenuInformacion.setEnabled(true);
                    Menu.Info.setEnabled(true);

                    
                    Menu.MenuSalir.setEnabled(true);
                    Menu.Salir.setEnabled(true);
                }
    }else{
        USUARIO.setText("");
        CONTRASEÑA.setText("");
    }
    if(Conectar.ver == 0){
                if(Conectar.tipo_acc.equals("Secretaria")){
                    Menu n = new Menu();
                    n.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null,"Bienvenido Secretaria","java",1);
                    Menu.MenuCrear.setEnabled(false);
                    Menu.CrearUsuario.setEnabled(false);
                    
                    Menu.MenuIngresar.setEnabled(true);
                    Menu.IngDepartamento.setEnabled(true);
                    Menu.IngEspecialidad.setEnabled(true);
                    Menu.IngIsapre.setEnabled(true);
                    Menu.IngFuncionario.setEnabled(true);
                    Menu.IngCama.setEnabled(false);
                    Menu.IngItems.setEnabled(false);
                    
                    Menu.MenuRegistros.setEnabled(true);
                    Menu.RegPaciente.setEnabled(true);
                    
                    Menu.MenuOperaciones.setEnabled(true);
                    Menu.OpTratamiento.setEnabled(false);
                    Menu.OpGastos.setEnabled(false);
                    Menu.OpFactura.setEnabled(true);
                    
                    Menu.MenuInformacion.setEnabled(true);
                    Menu.Info.setEnabled(true);

                    
                    Menu.MenuSalir.setEnabled(true);
                    Menu.Salir.setEnabled(true);
                }
    }else{
        USUARIO.setText("");
        CONTRASEÑA.setText("");
    }
    if(Conectar.ver == 0){
                if(Conectar.tipo_acc.equals("Enfermera")){
                    Menu n = new Menu();
                    n.setVisible(true);
                    dispose();
                    JOptionPane.showMessageDialog(null,"Bienvenido Enfermera","java",1);
                    Menu.MenuCrear.setEnabled(false);
                    Menu.CrearUsuario.setEnabled(true);
                    
                    Menu.MenuIngresar.setEnabled(true);
                    Menu.IngDepartamento.setEnabled(false);
                    Menu.IngEspecialidad.setEnabled(false);
                    Menu.IngIsapre.setEnabled(false);
                    Menu.IngFuncionario.setEnabled(false);
                    Menu.IngCama.setEnabled(true);
                    Menu.IngItems.setEnabled(true);
                    
                    Menu.MenuRegistros.setEnabled(false);
                    Menu.RegPaciente.setEnabled(false);
                    
                    Menu.MenuOperaciones.setEnabled(true);
                    Menu.OpTratamiento.setEnabled(false);
                    Menu.OpGastos.setEnabled(true);
                    Menu.OpFactura.setEnabled(false);
                    
                    Menu.MenuInformacion.setEnabled(true);
                    Menu.Info.setEnabled(true);

                    
                    Menu.MenuSalir.setEnabled(true);
                    Menu.Salir.setEnabled(true);
                }
    }else{
        USUARIO.setText("");
        CONTRASEÑA.setText("");
    }
    if(Conectar.Exit == 3){
        JOptionPane.showMessageDialog(null,"Ha sido DESCONECTADO del Sistema!!!","java",1);
        System.exit(0);
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jIniciar = new javax.swing.JLabel();
        jUser = new javax.swing.JLabel();
        jCon = new javax.swing.JLabel();
        USUARIO = new javax.swing.JTextField();
        INGRESAR = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        CONTRASEÑA = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jIniciar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jIniciar.setText("Iniciar Sesión");

        jUser.setText("Usuario :");

        jCon.setText("Contraseña :");

        INGRESAR.setText("Ingresar");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        SALIR.setText("Salir");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jUser)
                            .addComponent(jCon))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(USUARIO, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(CONTRASEÑA)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(INGRESAR)
                        .addGap(95, 95, 95)
                        .addComponent(SALIR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jIniciar)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jIniciar)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUser)
                    .addComponent(USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCon)
                    .addComponent(CONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INGRESAR)
                    .addComponent(SALIR))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
        entrar();
    }//GEN-LAST:event_INGRESARActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
         System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPasswordField CONTRASEÑA;
    private javax.swing.JButton INGRESAR;
    private javax.swing.JButton SALIR;
    private javax.swing.JTextField USUARIO;
    private javax.swing.JLabel jCon;
    private javax.swing.JLabel jIniciar;
    private javax.swing.JLabel jUser;
    // End of variables declaration//GEN-END:variables
}
