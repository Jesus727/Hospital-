
package Interfaces;

import Datos.DTratamiento;
import Funciones.FActualizar;
import Funciones.FIngresar;
import Funciones.FSeleccionar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Tratamiento extends javax.swing.JFrame implements Runnable {
String hora , minuto , segundo;
Thread hilo;
    FSeleccionar reg = new FSeleccionar();
    FIngresar ing = new FIngresar();
    FActualizar act = new FActualizar();
    DTratamiento trata = new DTratamiento();

    public Tratamiento() {
        initComponents();
        setTitle("Tratamiento Paciente");
        setLocationRelativeTo(null); 
        reg.numerosIDTratamiento();
        reg.ConsultarPacienteTrata();
        reg.ConsultarMedico();
        IDTRATAMIENTO.setVisible(false);
        IDPACIENTE.setVisible(false);
        IDMEDICO.setVisible(false);
        jLabel7.setVisible(false);
        jLabel8.setVisible(false);
        darALTA.setVisible(false);
        ALTA.setVisible(false);
        FECHA.setText(fecha());
        hilo = new Thread (this);
        hilo.start();
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
        IDTRATAMIENTO = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        MEDICO = new javax.swing.JComboBox<>();
        PACIENTE = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        DIAGNOSTICO = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TRATAMIENTO = new javax.swing.JTextField();
        INGRESAR = new javax.swing.JButton();
        IDMEDICO = new javax.swing.JTextField();
        IDPACIENTE = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        SI = new javax.swing.JRadioButton();
        Aceptar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        ALTA = new javax.swing.JTextField();
        NO = new javax.swing.JRadioButton();
        FECHA = new javax.swing.JTextField();
        HORA = new javax.swing.JTextField();
        darALTA = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Chequeo del Medico");

        jLabel2.setText("Paciente");

        jLabel3.setText("Medico");

        MEDICO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        MEDICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MEDICOActionPerformed(evt);
            }
        });

        PACIENTE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        PACIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PACIENTEActionPerformed(evt);
            }
        });

        jLabel4.setText("Diagnostico");

        jLabel5.setText("Tratamiento");

        INGRESAR.setText("Ingresar");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel6.setText("Si desea Dar de alta al paciente, Seleccione \"SI\" y luego \"Aceptar\"");

        SI.setText("Si");

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        jLabel7.setText("Ingrese fecha de alta (dd/mm/aaaa)");

        NO.setText("No");

        darALTA.setText("Dar de Alta");
        darALTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darALTAActionPerformed(evt);
            }
        });

        jLabel8.setText(" Seleccione un Paciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ALTA, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(TRATAMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(152, 152, 152)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(DIAGNOSTICO, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IDTRATAMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(82, 82, 82)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(HORA, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(FECHA)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(303, 303, 303))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(SI)
                        .addGap(74, 74, 74)
                        .addComponent(NO)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(darALTA))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addComponent(IDMEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IDPACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(INGRESAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(Aceptar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IDTRATAMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(HORA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDMEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IDPACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(DIAGNOSTICO, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRATAMIENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(INGRESAR)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NO, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SI))
                .addGap(18, 18, 18)
                .addComponent(Aceptar)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ALTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Volver))
                .addGap(18, 18, 18)
                .addComponent(darALTA))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
       if (TRATAMIENTO.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un tratamiento");
            TRATAMIENTO.requestFocus();
            return;
        }
       
       if (DIAGNOSTICO.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Diagnostico");
            DIAGNOSTICO.requestFocus();
            return;
        }
       
       trata.SetId_Tratamiento(IDTRATAMIENTO.getText());
       trata.SetPaciente(IDPACIENTE.getText());
       trata.SetMedico(IDMEDICO.getText());
       trata.SetFecha(FECHA.getText());
       trata.SetHora(HORA.getText());
       trata.SetDiagnostico(DIAGNOSTICO.getText());
       trata.SetTratamiento(TRATAMIENTO.getText());
 
       ing.CrearTratamiento(trata.GetId_Tratamiento(),trata.GetPaciente(),trata.GetMedico(),trata.GetFecha(),trata.GetHora(),trata.GetDiagnostico(),trata.GetTratamiento());
       
       IDPACIENTE.setText("");
       IDMEDICO.setText("");
       DIAGNOSTICO.setText("");
       TRATAMIENTO.setText("");
       PACIENTE.removeAllItems();
       MEDICO.removeAllItems();
       reg.ConsultarPacienteTrata();
       reg.ConsultarMedico();
       reg.numerosIDTratamiento();
       
    }//GEN-LAST:event_INGRESARActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        if(SI.isSelected()==true){
            jLabel7.setVisible(true);
            ALTA.setVisible(true);
            jLabel8.setVisible(true);
            darALTA.setVisible(true);
        }else{
            jLabel7.setVisible(false);
            ALTA.setVisible(false);
            jLabel8.setVisible(false);
            darALTA.setVisible(false);
        }
        if(NO.isSelected()==true){
            jLabel7.setVisible(false);
            ALTA.setVisible(false);
            jLabel8.setVisible(false);
            darALTA.setVisible(false);
        }
    }//GEN-LAST:event_AceptarActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void PACIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PACIENTEActionPerformed
        reg.AgregarActIDPacienteTrata((String) this.PACIENTE.getSelectedItem());
    }//GEN-LAST:event_PACIENTEActionPerformed

    private void MEDICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MEDICOActionPerformed
         reg.AgregarActIDMedico((String) this.MEDICO.getSelectedItem());
    }//GEN-LAST:event_MEDICOActionPerformed

    private void darALTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darALTAActionPerformed
       if(SI.isSelected()==true){
       SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
       String alta = ALTA.getText();
       String hoy = FECHA.getText();
       Date Fecha1 = null;
       Date Fecha2 = null;
    try {
        Fecha1=a.parse(alta);        
    } catch (ParseException ex) {
        Logger.getLogger(Tratamiento.class.getName()).log(Level.SEVERE, null, ex);
    }
     try {
        Fecha2=a.parse(hoy);         
    } catch (ParseException ex) {
        Logger.getLogger(Tratamiento.class.getName()).log(Level.SEVERE, null, ex);
    }
    if(Fecha1.after(Fecha2)){
        act.ActualizarFechaCama(alta,IDPACIENTE.getText());
        act.ActualizarAltaPaciente(alta,IDPACIENTE.getText());
        act.ActualizarAltaPaciente2(IDPACIENTE.getText());
        PACIENTE.removeAllItems();
        reg.ConsultarPacienteTrata();
            JOptionPane.showMessageDialog(null, "Fecha de Alta Ingresada Correctamente!!!");
        }
    if(Fecha1.before(Fecha2)){
            JOptionPane.showMessageDialog(null, "La Fecha Ingresada es Anterior a la Actual!!!... Reingrese Otra Fecha!!!");
            ALTA.setText("");
        }
    if(Fecha1.equals(Fecha2)){
        act.ActualizarFechaCama(alta,IDPACIENTE.getText());
        act.ActualizarAltaPaciente(alta,IDPACIENTE.getText());
        act.ActualizarAltaPaciente2(IDPACIENTE.getText());
        PACIENTE.removeAllItems();
        reg.ConsultarPacienteTrata();
            JOptionPane.showMessageDialog(null, "Fecha de Alta Ingresada Correctamente!!!");
    }
       }
    }//GEN-LAST:event_darALTAActionPerformed


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
            java.util.logging.Logger.getLogger(Tratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tratamiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tratamiento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ALTA;
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextField DIAGNOSTICO;
    private javax.swing.JTextField FECHA;
    private javax.swing.JTextField HORA;
    public static javax.swing.JTextField IDMEDICO;
    public static javax.swing.JTextField IDPACIENTE;
    public static javax.swing.JTextField IDTRATAMIENTO;
    private javax.swing.JButton INGRESAR;
    public static javax.swing.JComboBox<String> MEDICO;
    private javax.swing.JRadioButton NO;
    public static javax.swing.JComboBox<String> PACIENTE;
    private javax.swing.JRadioButton SI;
    private javax.swing.JTextField TRATAMIENTO;
    private javax.swing.JButton Volver;
    private javax.swing.JButton darALTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables

    
}
