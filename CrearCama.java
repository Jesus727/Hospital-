
package Interfaces;

import Conectar.Conectar;
import Datos.DCama;
import Funciones.FActualizar;
import Funciones.FEliminar;
import Funciones.FIngresar;
import Funciones.FSeleccionar;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class CrearCama extends javax.swing.JFrame {
    FSeleccionar reg = new FSeleccionar();
    FIngresar ing = new FIngresar();
    DCama cama = new DCama();
    FEliminar eli = new FEliminar();
    FActualizar Acty = new FActualizar();
    public CrearCama() {
        initComponents();
        reg.numerosIDCama();
        setTitle("Crear Cama");
        setLocationRelativeTo(null);
        reg.TablaCama("");
        IDCAMA.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IDCAMA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Pieza = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        TIPO = new javax.swing.JTextField();
        NUMERO = new javax.swing.JTextField();
        jEstado = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBCAMA = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ActPieza = new javax.swing.JTextField();
        Actualizar = new javax.swing.JButton();
        BuscarCama = new javax.swing.JTextField();
        tbMOSTRAR = new javax.swing.JButton();
        tbBuscar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Crear Cama");

        jLabel2.setText("Tipo Cama");

        jLabel3.setText("Estado");

        Pieza.setText("Numero de Pieza");

        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        NUMERO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NUMEROKeyTyped(evt);
            }
        });

        jEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE" }));

        TBCAMA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TBCAMA);

        jLabel4.setText("Selecciona una Cama");

        jLabel5.setText("Actualizar Nº de Pieza :");

        ActPieza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ActPiezaKeyTyped(evt);
            }
        });

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        BuscarCama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BuscarCamaKeyTyped(evt);
            }
        });

        tbMOSTRAR.setText("Mostrar Todo");
        tbMOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbMOSTRARActionPerformed(evt);
            }
        });

        tbBuscar.setText("Buscar Nº Pieza");
        tbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBuscarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese Numero de Pieza");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ActPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(Actualizar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(BuscarCama, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(tbBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(tbMOSTRAR)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pieza)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(IDCAMA, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NUMERO)
                                    .addComponent(jEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(66, 66, 66)))
                        .addComponent(Ingresar)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(Eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Volver)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDCAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Ingresar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pieza)
                    .addComponent(NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbBuscar)
                    .addComponent(tbMOSTRAR))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ActPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Actualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(Volver))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
       if (TIPO.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Tipo de Cama");
            TIPO.requestFocus();
            return;
        }
        if (NUMERO.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Numero de Pieza");
            NUMERO.requestFocus();
            return;
        }
        
        reg.verificarNumeroPieza(NUMERO.getText());
        
        int veri = Conectar.ver;
        if(veri == 0){
           JOptionPane.showMessageDialog(null, "Este Numero de Pieza: " + NUMERO.getText() + ", ya se encuentra con una cama agregada!!");
        }else{
        cama.SetId_Cama(IDCAMA.getText());
        cama.SetTipoCama(TIPO.getText());
        int Estado = jEstado.getSelectedIndex();
        cama.SetEstado((String) jEstado.getItemAt(Estado));
        cama.SetPieza(Integer.parseInt(NUMERO.getText()));
        
        ing.CrearCama(cama.GetId_Cama(),cama.GetTipoCama(),cama.GetEstado(),cama.GetPieza());
        TIPO.setText("");
        IDCAMA.setText("");
        NUMERO.setText("");
        reg.numerosIDCama();
        reg.TablaCama("");
        }
    }//GEN-LAST:event_IngresarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
       dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void tbMOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbMOSTRARActionPerformed
        reg.TablaCama("");
    }//GEN-LAST:event_tbMOSTRARActionPerformed

    private void tbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBuscarActionPerformed
        reg.TablaCama(BuscarCama.getText());
    }//GEN-LAST:event_tbBuscarActionPerformed

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
    int fila = TBCAMA.getSelectedRow();
    String cod="";
    cod=TBCAMA.getValueAt(fila, 0).toString();
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea actualizar el Numero de la Pieza?", 
   "Selector de opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){
    if(ActPieza.getText().equals("")){
       JOptionPane.showMessageDialog(null,"Ingrese un Nº de Pieza");
    }else{
    reg.verificarNumeroPieza(ActPieza.getText());
        int veri = Conectar.ver;
        if(veri == 0){
           JOptionPane.showMessageDialog(null, "Este Numero de Pieza: " + ActPieza.getText() + ", ya se encuentra con una cama agregada!!");
        }else{    
    Acty.ActualizarCama(ActPieza.getText(),cod);
    reg.TablaCama("");
    ActPieza.setText("");
    JOptionPane.showMessageDialog(null,"Datos Actualizados Correctamente");
    }
    }
}
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
    int fila = TBCAMA.getSelectedRow();
    String cod="";
    cod=TBCAMA.getValueAt(fila, 0).toString();;
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea Elimnar la Cama?", 
   "Eliminar Cama",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){
        eli.EliminarCama(cod);
        reg.TablaCama("");
}
    }//GEN-LAST:event_EliminarActionPerformed

    private void NUMEROKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NUMEROKeyTyped
       char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_NUMEROKeyTyped

    private void BuscarCamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BuscarCamaKeyTyped
        char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_BuscarCamaKeyTyped

    private void ActPiezaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActPiezaKeyTyped
        char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_ActPiezaKeyTyped

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
            java.util.logging.Logger.getLogger(CrearCama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActPieza;
    private javax.swing.JButton Actualizar;
    private javax.swing.JTextField BuscarCama;
    private javax.swing.JButton Eliminar;
    public static javax.swing.JTextField IDCAMA;
    private javax.swing.JButton Ingresar;
    private javax.swing.JTextField NUMERO;
    private javax.swing.JLabel Pieza;
    public static javax.swing.JTable TBCAMA;
    private javax.swing.JTextField TIPO;
    private javax.swing.JButton Volver;
    public static javax.swing.JComboBox<String> jEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton tbBuscar;
    private javax.swing.JButton tbMOSTRAR;
    // End of variables declaration//GEN-END:variables
}
