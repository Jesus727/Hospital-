

package Interfaces;

import Datos.DGastos;
import Funciones.FActualizar;
import Funciones.FIngresar;
import Funciones.FSeleccionar;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicolás
 */
public class ControlPaciente extends javax.swing.JFrame implements Runnable {
String hora , minuto , segundo;
Thread hilo;
    FSeleccionar reg = new FSeleccionar(); 
    FIngresar ing = new FIngresar();
    DGastos g = new DGastos();
    FActualizar Acty = new FActualizar();
    

    public ControlPaciente() {
        initComponents();
        FECHA.setText(fecha());
        hilo = new Thread (this);
        hilo.start();
        reg.numerosIDControl();
        setTitle("Control Gastos Paciente");
        setLocationRelativeTo(null); 
        reg.ConsultarPas();
        reg.TablaItemsControl("");
        reg.ConsultarPacienteTras();
        reg.ConsultarCamaTras();
        IDCONTROL.setVisible(false);
        IDPACIENTE.setVisible(false);
        IDPAS.setVisible(false);
        IDcam.setVisible(false);
        idcama.setVisible(false);
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
        IDCONTROL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        FECHA = new javax.swing.JTextField();
        HORA = new javax.swing.JTextField();
        PACIENTE = new javax.swing.JComboBox<>();
        IDPACIENTE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BUSCAR = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();
        BUSCARITEM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        CONTROL = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CANTIDAD = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PacienteTras = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        CAMA = new javax.swing.JComboBox<>();
        Traslado = new javax.swing.JButton();
        IDPAS = new javax.swing.JTextField();
        IDcam = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        idcama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Control Consumo del Paciente");

        jLabel2.setText("Paciente");

        PACIENTE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        PACIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PACIENTEActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar Item");

        BUSCAR.setText("Buscar");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        MOSTRAR.setText("Mostrar Todo");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });

        CONTROL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(CONTROL);

        jLabel4.setText("Seleccione un Item");

        jLabel5.setText("Ingrese Cantidad");

        CANTIDAD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CANTIDADKeyTyped(evt);
            }
        });

        Agregar.setText("Agregar Item");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel6.setText("Traslado de Pieza (Cama) del paciente");

        jLabel7.setText("Paciente");

        PacienteTras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {
        }));
        PacienteTras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteTrasActionPerformed(evt);
            }
        });

        jLabel8.setText("Pieza");

        CAMA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        CAMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAMAActionPerformed(evt);
            }
        });

        Traslado.setText("Trasladar");
        Traslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrasladoActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel9.setText("Seleccione Paciente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(CANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Agregar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(HORA, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(214, 214, 214)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDPAS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(PacienteTras, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(idcama, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Traslado)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(IDcam, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(Volver)))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(BUSCARITEM, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BUSCAR)
                                    .addComponent(IDPACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jLabel1)))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IDCONTROL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MOSTRAR))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDCONTROL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HORA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(IDPACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUSCARITEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUSCAR)
                    .addComponent(MOSTRAR))
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(CANTIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PacienteTras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(CAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDPAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idcama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Traslado)
                    .addComponent(IDcam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Volver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PACIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PACIENTEActionPerformed
        reg.AgregarActIDPacienteControl((String) this.PACIENTE.getSelectedItem());
    }//GEN-LAST:event_PACIENTEActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
        reg.TablaItemsControl(BUSCARITEM.getText());
    }//GEN-LAST:event_BUSCARActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
       reg.TablaItemsControl("");
    }//GEN-LAST:event_MOSTRARActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
    int fila = CONTROL.getSelectedRow();
    String cod="";
    cod=CONTROL.getValueAt(fila, 0).toString();
    String Stoc=CONTROL.getValueAt(fila, 2).toString();
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea Agregar el item al consumo del Paciente?", 
   "Selector de opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

    
  int Stock = Integer.parseInt(Stoc);
  int cant = Integer.parseInt(CANTIDAD.getText()); 
  int Suma = Stock - cant ;
  
  if (seleccion != 1){
    if(Stock < cant ){
        JOptionPane.showMessageDialog(null,"La cantidad ingresada sobre pasa el Stock Actual.... Ingrese otra cantidad!!!");
    }else{
        g.SetId_Gastos(IDCONTROL.getText());
        g.SetPaciente(IDPACIENTE.getText());
        g.SetFecha(FECHA.getText());
        g.SetItem(cod);
        g.SetCant(Integer.parseInt(CANTIDAD.getText()));
        
        ing.CrearGastos(g.GetId_Gastos(),g.GetPaciente(),g.GetFecha(),g.GetItem(),g.GetCant());
        
        Acty.ActualizarStock(Suma,cod);
        reg.TablaItemsControl("");
        CANTIDAD.setText("");
        PACIENTE.removeAllItems();
        IDPACIENTE.setText("");
        IDCONTROL.setText("");
        reg.ConsultarPas();
    }
  }

    }//GEN-LAST:event_AgregarActionPerformed

    private void PacienteTrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacienteTrasActionPerformed
       reg.AgregarActIDPacienteTras((String) this.PacienteTras.getSelectedItem()); 
       reg.buscarcama(IDPAS.getText()); 
       
    }//GEN-LAST:event_PacienteTrasActionPerformed

    private void CAMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAMAActionPerformed
       reg.AgregarActIDCamaTras((String) this.CAMA.getSelectedItem());
    }//GEN-LAST:event_CAMAActionPerformed

    private void TrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrasladoActionPerformed
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea trasladar de cama al Paciente?", 
   "Selector de opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");
  
    
  if (seleccion != 1){
      Acty.TrasladoPaciente(IDcam.getText(),IDPAS.getText());
      Acty.TrasladoOcupado(IDcam.getText());
      Acty.TrasladoDisponible(idcama.getText());
      JOptionPane.showMessageDialog(null,"Traslado de pieza (CAMA) del paciente realizado con exito!!!! ");
      PacienteTras.removeAllItems();
      CAMA.removeAllItems();
      IDcam.setText("");
      idcama.setText("");
      IDPAS.setText("");
      reg.ConsultarPas();
      reg.ConsultarPacienteTras();
      reg.ConsultarCamaTras();
  }
    }//GEN-LAST:event_TrasladoActionPerformed

    private void CANTIDADKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CANTIDADKeyTyped
        char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_CANTIDADKeyTyped

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
            java.util.logging.Logger.getLogger(ControlPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ControlPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ControlPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ControlPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ControlPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton BUSCAR;
    private javax.swing.JTextField BUSCARITEM;
    public static javax.swing.JComboBox<String> CAMA;
    private javax.swing.JTextField CANTIDAD;
    public static javax.swing.JTable CONTROL;
    private javax.swing.JTextField FECHA;
    private javax.swing.JTextField HORA;
    public static javax.swing.JTextField IDCONTROL;
    public static javax.swing.JTextField IDPACIENTE;
    public static javax.swing.JTextField IDPAS;
    public static javax.swing.JTextField IDcam;
    private javax.swing.JButton MOSTRAR;
    public static javax.swing.JComboBox<String> PACIENTE;
    public static javax.swing.JComboBox<String> PacienteTras;
    private javax.swing.JButton Traslado;
    private javax.swing.JButton Volver;
    public static javax.swing.JTextField idcama;
    private javax.swing.JLabel jLabel1;
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
