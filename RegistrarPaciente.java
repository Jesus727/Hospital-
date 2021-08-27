
package Interfaces;

import Conectar.Conectar;
import Datos.DPaciente;
import Funciones.FActualizar;
import Funciones.FEliminar;
import Funciones.FIngresar;
import Funciones.FSeleccionar;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class RegistrarPaciente extends javax.swing.JFrame implements Runnable {
String hora , minuto , segundo;
Thread hilo;
    FSeleccionar reg = new FSeleccionar();
    FIngresar ing = new FIngresar();
    DPaciente paci = new DPaciente();
    FEliminar eli = new FEliminar();
    FActualizar Acty = new FActualizar();

    public RegistrarPaciente() {
        initComponents();
        FECHA.setText(fecha());
        hilo = new Thread (this);
        hilo.start();
        reg.numerosIDPaciente();
        setTitle("Registrar Usuario");
        setLocationRelativeTo(null); 
        reg.TablaPaciente("");
        reg.ConsultarIsapre();
        IDUSUARIO.setVisible(false);
        IDisap.setVisible(false);
        AsigCama.setVisible(false);
    }
public static String fecha(){
    Date fecha = new Date();
    SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
    return formatofecha.format(fecha);
}
public void hora(){
    Calendar c =new GregorianCalendar();
    Date hor= new Date();
    c.setTime(hor); 
    hora=c.get(Calendar.HOUR_OF_DAY)>9?""+c.get(Calendar.HOUR_OF_DAY):"O"+c.get(Calendar.HOUR_OF_DAY);
    minuto=c.get(Calendar.MINUTE)>9?""+c.get(Calendar.MINUTE):"O"+c.get(Calendar.MINUTE);
    segundo=c.get(Calendar.SECOND)>9?""+c.get(Calendar.SECOND):"O"+c.get(Calendar.SECOND);
}
public void run(){
    Thread current = Thread.currentThread();
    
    while (current == hilo){
        hora();
        HORA.setText(hora+":"+minuto+":"+segundo);
    } 
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        IDUSUARIO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        HORA = new javax.swing.JTextField();
        FECHA = new javax.swing.JTextField();
        NOMBRE = new javax.swing.JTextField();
        DIRECCION = new javax.swing.JTextField();
        FONO = new javax.swing.JTextField();
        ISAPRE = new javax.swing.JComboBox<>();
        CAMA = new javax.swing.JButton();
        INGRESAR = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btMostrar = new javax.swing.JButton();
        BUSCAR = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PACIENTE = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ACTNOMBRE = new javax.swing.JTextField();
        ACTDIRECCION = new javax.swing.JTextField();
        ACTFONO = new javax.swing.JTextField();
        btActualizar = new javax.swing.JButton();
        btELIMINAR = new javax.swing.JButton();
        VOLVER = new javax.swing.JButton();
        IDisap = new javax.swing.JTextField();
        AsigCama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Registrar Usuario");

        jLabel2.setText("Nombre y Apellido");

        jLabel3.setText("Direccion");

        jLabel4.setText("Fono");

        jLabel5.setText("Isapre");

        jLabel7.setText("Asignar Cama");

        FONO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FONOKeyTyped(evt);
            }
        });

        ISAPRE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        ISAPRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ISAPREActionPerformed(evt);
            }
        });

        CAMA.setText("Asignar");
        CAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMAActionPerformed(evt);
            }
        });

        INGRESAR.setText("Ingresar");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        jLabel6.setText("Ingrese Nombre y Apellido del paciente");

        btBuscar.setText("Buscar Nombre");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btMostrar.setText("Mostrar Todo");
        btMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarActionPerformed(evt);
            }
        });

        jLabel8.setText("Seleccione un Paciente");

        PACIENTE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(PACIENTE);

        jLabel9.setText("Actualizar Datos");

        jLabel10.setText("Nombre y Apellido");

        jLabel11.setText("Fono");

        jLabel12.setText("Dirección");

        ACTFONO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ACTFONOKeyTyped(evt);
            }
        });

        btActualizar.setText("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        btELIMINAR.setText("Eliminar");
        btELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btELIMINARActionPerformed(evt);
            }
        });

        VOLVER.setText("Volver");
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });

        AsigCama.setText("NO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel12)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ACTNOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                    .addComponent(ACTDIRECCION)
                    .addComponent(ACTFONO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VOLVER)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btELIMINAR)
                    .addComponent(btActualizar))
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(IDUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jLabel1)
                                .addGap(54, 54, 54)
                                .addComponent(HORA, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(FONO, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(INGRESAR, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(ISAPRE, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btMostrar)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDisap, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AsigCama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addComponent(CAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDUSUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(HORA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(ISAPRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(INGRESAR)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(IDisap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AsigCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CAMA))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar)
                    .addComponent(btMostrar))
                .addGap(15, 15, 15)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ACTNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(btELIMINAR))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(ACTDIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btActualizar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(VOLVER)))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(ACTFONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ISAPREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ISAPREActionPerformed
        reg. AgregarActIDIsapre((String) this.ISAPRE.getSelectedItem());
    }//GEN-LAST:event_ISAPREActionPerformed

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
        if (NOMBRE.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre");
            NOMBRE.requestFocus();
            return;
        }
       if (DIRECCION.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Direccion");
            DIRECCION.requestFocus();
            return;
        }
       if (FONO.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Fono");
            FONO.requestFocus();
            return;
        }
        
        reg.verificarNombrePaciente(NOMBRE.getText());
        
        int veri = Conectar.ver;
        if(veri == 0){
           JOptionPane.showMessageDialog(null, "Este Nombre : " + NOMBRE.getText() + ", ya fue ingresado.");
        }else{
        paci.SetId_Paciente(IDUSUARIO.getText());
        paci.SetNombre(NOMBRE.getText());
        paci.SetDireccion(DIRECCION.getText());
        paci.SetFono(Integer.parseInt(FONO.getText()));
        paci.SetIsapre(IDisap.getText());
        paci.SetFecha_Ing(FECHA.getText());
        paci.SetCama(AsigCama.getText());
        paci.SetAlta(AsigCama.getText());
        
        ing.CrearPaciente(paci.GetId_Paciente(),paci.GetNombre(),paci.GetDireccion(),paci.GetFono(),paci.GetIsapre(),paci.GetFecha_Ing(),paci.GetCama(), paci.GetAlta());
        NOMBRE.setText("");
        IDUSUARIO.setText("");
        FONO.setText("");
        DIRECCION.setText("");
        reg.numerosIDPaciente();
        reg.TablaPaciente("");
        ISAPRE.removeAllItems();
        reg.ConsultarIsapre();
        IDisap.setText("");
        }
    }//GEN-LAST:event_INGRESARActionPerformed

    private void btMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarActionPerformed
       reg.TablaPaciente("");
    }//GEN-LAST:event_btMostrarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
       reg.TablaPaciente(NOMBRE.getText());
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
    int fila = PACIENTE.getSelectedRow();
    String cod="";
    cod=PACIENTE.getValueAt(fila, 0).toString();
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea actualizar los datos del Paciente?", 
   "Selector de opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){
    //--Nombre
    if(ACTNOMBRE.getText().equals("")){
    }else{
    Acty.ActualizarPacienteNom(ACTNOMBRE.getText(),cod);
    reg.TablaPaciente("");
    ACTNOMBRE.setText("");
    }
    //---Direccion
    if(ACTDIRECCION.getText().equals("")){
    }else{
    Acty.ActualizarPacienteDir(ACTDIRECCION.getText(),cod);
    reg.TablaPaciente("");
    ACTDIRECCION.setText("");
    }
    //--Fono
    if(ACTFONO.getText().equals("")){
    }else{
    Acty.ActualizarPacienteFono(ACTFONO.getText(),cod);
    reg.TablaPaciente("");
    ACTFONO.setText("");
    }
    JOptionPane.showMessageDialog(null,"Datos Actualizados Correctamente");
}
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btELIMINARActionPerformed
    int fila = PACIENTE.getSelectedRow();
    String cod="";
    cod=PACIENTE.getValueAt(fila, 0).toString();;
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea Elimnar al Paciente?", 
   "Eliminar Paciente",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){
        eli.EliminarPaciente(cod);
        reg.TablaPaciente("");
}
    }//GEN-LAST:event_btELIMINARActionPerformed

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        dispose();
    }//GEN-LAST:event_VOLVERActionPerformed

    private void CAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMAActionPerformed
      AsignarCama n = new AsignarCama();
      n.setVisible(true);
    }//GEN-LAST:event_CAMAActionPerformed

    private void FONOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FONOKeyTyped
        char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_FONOKeyTyped

    private void ACTFONOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ACTFONOKeyTyped
        char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_ACTFONOKeyTyped

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
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ACTDIRECCION;
    private javax.swing.JTextField ACTFONO;
    private javax.swing.JTextField ACTNOMBRE;
    private javax.swing.JTextField AsigCama;
    private javax.swing.JTextField BUSCAR;
    private javax.swing.JButton CAMA;
    private javax.swing.JTextField DIRECCION;
    public static javax.swing.JTextField FECHA;
    private javax.swing.JTextField FONO;
    public static javax.swing.JTextField HORA;
    public static javax.swing.JTextField IDUSUARIO;
    public static javax.swing.JTextField IDisap;
    private javax.swing.JButton INGRESAR;
    public static javax.swing.JComboBox<String> ISAPRE;
    private javax.swing.JTextField NOMBRE;
    public static javax.swing.JTable PACIENTE;
    private javax.swing.JButton VOLVER;
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btELIMINAR;
    private javax.swing.JButton btMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}
