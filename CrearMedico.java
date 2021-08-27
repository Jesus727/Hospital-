
package Interfaces;

import Conectar.Conectar;
import Datos.DFuncionario;
import Funciones.FActualizar;
import Funciones.FEliminar;
import Funciones.FIngresar;
import Funciones.FSeleccionar;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;


public class CrearMedico extends javax.swing.JFrame {
    FSeleccionar reg = new FSeleccionar();
    FIngresar ing = new FIngresar();
    DFuncionario Fun = new DFuncionario();
    FEliminar eli = new FEliminar();
    FActualizar Acty = new FActualizar();

    public CrearMedico() {
        initComponents();
        reg.ConsultarDepa();
        reg.ConsultarEsp();
        reg.numerosFuncionario();
        setTitle("Crear Medico");
        setLocationRelativeTo(null); 
        reg.TablaMedico("");
        IDMEDICO.setVisible(false);
        IDESP.setVisible(false);
        IDDEP.setVisible(false);
        ActEsp.setVisible(false);
        ActDep.setVisible(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        DIRECCION = new javax.swing.JTextField();
        FONO = new javax.swing.JTextField();
        jEspecialidad = new javax.swing.JComboBox<>();
        jDep = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        IDMEDICO = new javax.swing.JTextField();
        IDESP = new javax.swing.JTextField();
        IDDEP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        MEDICO = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        BuscarNom = new javax.swing.JTextField();
        btNOMBRE = new javax.swing.JButton();
        btMOSTRAR = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ActDirec = new javax.swing.JTextField();
        ActFono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ActEspecialidad = new javax.swing.JComboBox<>();
        ActDepartamento = new javax.swing.JComboBox<>();
        btACTUALIZAR = new javax.swing.JButton();
        btELIMINAR = new javax.swing.JButton();
        ActEsp = new javax.swing.JTextField();
        ActDep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Crear Funcionario (Medico)");

        jLabel2.setText("Nombre y Apellido");

        jLabel3.setText("Direccion");

        jLabel4.setText("Fono");

        jLabel5.setText("Especialidad");

        jLabel6.setText("Departamento");

        FONO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FONOKeyTyped(evt);
            }
        });

        jEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEspecialidadActionPerformed(evt);
            }
        });

        jDep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        jDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepActionPerformed(evt);
            }
        });

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        IDESP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDESPActionPerformed(evt);
            }
        });

        MEDICO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(MEDICO);

        jLabel7.setText("Ingrese Nombre y Apellido");

        btNOMBRE.setText("Buscar");
        btNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNOMBREActionPerformed(evt);
            }
        });

        btMOSTRAR.setText("Mostrar Todo");
        btMOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMOSTRARActionPerformed(evt);
            }
        });

        jLabel8.setText("Seleccione un Medico");

        jLabel9.setText("Actualizar Datos ");

        jLabel11.setText("Direccion");

        jLabel12.setText("Fono");

        ActFono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ActFonoKeyTyped(evt);
            }
        });

        jLabel13.setText("Especialidad");

        jLabel14.setText("Departamento");

        ActEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        ActEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActEspecialidadActionPerformed(evt);
            }
        });

        ActDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        ActDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActDepartamentoActionPerformed(evt);
            }
        });

        btACTUALIZAR.setText("Actualizar");
        btACTUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btACTUALIZARActionPerformed(evt);
            }
        });

        btELIMINAR.setText("Eliminar");
        btELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btELIMINARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(137, 137, 137)
                                .addComponent(BuscarNom, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btNOMBRE)
                                .addGap(36, 36, 36)
                                .addComponent(btMOSTRAR))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(283, 283, 283)
                                .addComponent(jLabel8)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(IDMEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(197, 197, 197)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(DIRECCION)
                                        .addComponent(NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                        .addComponent(FONO))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jDep, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(IDDEP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(jEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(IDESP, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jButton1))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addGap(56, 56, 56)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ActFono, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ActDirec, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel14)
                                .addComponent(ActEsp, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ActDep, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(65, 65, 65)
                                    .addComponent(jButton2)
                                    .addGap(5, 5, 5))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(ActEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ActDepartamento, 0, 122, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btACTUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel9)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDMEDICO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDESP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DIRECCION, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDDEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FONO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel7)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btNOMBRE)
                    .addComponent(btMOSTRAR))
                .addGap(35, 35, 35)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(ActEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(ActDirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(ActDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(ActFono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btACTUALIZAR))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ActEsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ActDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)))
                    .addComponent(btELIMINAR))
                .addContainerGap(117, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEspecialidadActionPerformed
       reg.AgregarIDEsp((String) this.jEspecialidad.getSelectedItem());
    }//GEN-LAST:event_jEspecialidadActionPerformed

    private void jDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepActionPerformed
        reg.AgregarIDDep((String) this.jDep.getSelectedItem());
    }//GEN-LAST:event_jDepActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
        
        reg.verificarNombreFunc(NOMBRE.getText());
        
        int veri = Conectar.ver;
        if(veri == 0){
           JOptionPane.showMessageDialog(null, "Este Nombre : " + NOMBRE.getText() + ", ya fue ingresado.");
        }else{
        Fun.SetId_Funcionario(IDMEDICO.getText());
        Fun.SetNombre(NOMBRE.getText());
        Fun.SetDireccion(DIRECCION.getText());
        Fun.SetFono(Integer.parseInt(FONO.getText()));
        Fun.SetEspecialidad(IDESP.getText());
        Fun.SetDepartamento(IDDEP.getText());
        
        ing.CrearMedico(Fun.GetId_Funcionario(),Fun.GetNombre(),Fun.GetDireccion(),Fun.GetFono(),Fun.GetEspecialidad(),Fun.GetDepartamento());
        NOMBRE.setText("");
        IDMEDICO.setText("");
        FONO.setText("");
        DIRECCION.setText("");
        ActDep.setText("");
        ActEsp.setText("");
        reg.numerosFuncionario();
        reg.TablaMedico("");
        jEspecialidad.removeAllItems();
        jDep.removeAllItems();
        IDESP.setText("");
        IDDEP.setText("");
        reg.ConsultarDepa();
        reg.ConsultarEsp();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btMOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMOSTRARActionPerformed
       reg.TablaMedico("");
    }//GEN-LAST:event_btMOSTRARActionPerformed

    private void btNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNOMBREActionPerformed
        reg.TablaMedico(BuscarNom.getText());
    }//GEN-LAST:event_btNOMBREActionPerformed

    private void ActEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActEspecialidadActionPerformed
        reg.AgregarActIDEsp((String) this.ActEspecialidad.getSelectedItem());
    }//GEN-LAST:event_ActEspecialidadActionPerformed

    private void IDESPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDESPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDESPActionPerformed

    private void ActDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActDepartamentoActionPerformed
       reg.AgregarActIDDep((String) this.ActDepartamento.getSelectedItem());
    }//GEN-LAST:event_ActDepartamentoActionPerformed

    private void btACTUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btACTUALIZARActionPerformed
    int fila = MEDICO.getSelectedRow();
    String cod="";
    cod=MEDICO.getValueAt(fila, 0).toString();
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea actualizar los datos del Medico?", 
   "Selector de opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){
    //---Direccion
    if(ActDirec.getText().equals("")){
    }else{
    Acty.ActualizarMedicoDir(ActDirec.getText(),cod);
    reg.TablaMedico("");
    ActDirec.setText("");
    }
    //--Fono
    if(ActFono.getText().equals("")){
    }else{
    Acty.ActualizarMedicoFono(ActFono.getText(),cod);
    reg.TablaMedico("");
    ActFono.setText("");
    }
    //--Especialidad
    if(ActEsp.getText().equals("")){
    }else{
    Acty.ActualizarMedicoEsp(ActEsp.getText(),cod);
    reg.TablaMedico("");
    ActEsp.setText("");
    }
    
    //--Departamento
    if(ActDep.getText().equals("")){
    }else{
    Acty.ActualizarMedicoDep(ActDep.getText(),cod);
    reg.ConsultarDepa();
    ActDep.setText("");
    }
    ActEspecialidad.removeAllItems();
    ActDepartamento.removeAllItems();
    ActEsp.setText("");
    ActDep.setText("");
    reg.ConsultarDepa();
    reg.ConsultarEsp();
    JOptionPane.showMessageDialog(null,"Datos Actualizados Correctamente");
}
    }//GEN-LAST:event_btACTUALIZARActionPerformed

    private void btELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btELIMINARActionPerformed
    int fila = MEDICO.getSelectedRow();
    String cod="";
    cod=MEDICO.getValueAt(fila, 0).toString();;
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea Elimnar al Funcionario?", 
   "Eliminar Funcionario",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){
        eli.EliminarMedico(cod);
        reg.TablaMedico("");
}
    }//GEN-LAST:event_btELIMINARActionPerformed

    private void FONOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FONOKeyTyped
       char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_FONOKeyTyped

    private void ActFonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActFonoKeyTyped
        char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_ActFonoKeyTyped

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
            java.util.logging.Logger.getLogger(CrearMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ActDep;
    public static javax.swing.JComboBox<String> ActDepartamento;
    private javax.swing.JTextField ActDirec;
    public static javax.swing.JTextField ActEsp;
    public static javax.swing.JComboBox<String> ActEspecialidad;
    private javax.swing.JTextField ActFono;
    private javax.swing.JTextField BuscarNom;
    private javax.swing.JTextField DIRECCION;
    private javax.swing.JTextField FONO;
    public static javax.swing.JTextField IDDEP;
    public static javax.swing.JTextField IDESP;
    public static javax.swing.JTextField IDMEDICO;
    public static javax.swing.JTable MEDICO;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JButton btACTUALIZAR;
    private javax.swing.JButton btELIMINAR;
    private javax.swing.JButton btMOSTRAR;
    private javax.swing.JButton btNOMBRE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public static javax.swing.JComboBox<String> jDep;
    public static javax.swing.JComboBox<String> jEspecialidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
