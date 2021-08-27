
package Interfaces;

import Funciones.FSeleccionar;

public class Informaciones extends javax.swing.JFrame {
    FSeleccionar selec = new FSeleccionar();
    public Informaciones() {
        initComponents();
        selec.CPacienteInformacion();
        setTitle("Informaciones");
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Medicos = new javax.swing.JButton();
        Especialidades = new javax.swing.JButton();
        Ocupadas = new javax.swing.JButton();
        Disponibles = new javax.swing.JButton();
        Items = new javax.swing.JButton();
        PacientesAlta = new javax.swing.JButton();
        PacientesAct = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        FICHAPACIENTE = new javax.swing.JComboBox<>();
        FICHA = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        INFORMACIONES = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Informaciones");

        Medicos.setText("Mostrar Medicos");
        Medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicosActionPerformed(evt);
            }
        });

        Especialidades.setText("Mostrar Especialidades");
        Especialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EspecialidadesActionPerformed(evt);
            }
        });

        Ocupadas.setText("Mostrar Camas Ocupadas");
        Ocupadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OcupadasActionPerformed(evt);
            }
        });

        Disponibles.setText("Mostrar Camas Disponibles");
        Disponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisponiblesActionPerformed(evt);
            }
        });

        Items.setText("Mostrar Items");
        Items.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemsActionPerformed(evt);
            }
        });

        PacientesAlta.setText("Pacientes Con Alta");
        PacientesAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacientesAltaActionPerformed(evt);
            }
        });

        PacientesAct.setText("Pacientes Actuales");
        PacientesAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacientesActActionPerformed(evt);
            }
        });

        jLabel2.setText("Ficha del Paciente");

        FICHAPACIENTE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));

        FICHA.setText("Mostrar");
        FICHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FICHAActionPerformed(evt);
            }
        });

        INFORMACIONES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(INFORMACIONES);

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PacientesAct)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Medicos)
                                .addGap(132, 132, 132)
                                .addComponent(Ocupadas))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Especialidades)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(FICHAPACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PacientesAlta)
                                    .addComponent(Disponibles)
                                    .addComponent(FICHA, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Items)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Medicos)
                    .addComponent(Ocupadas))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Especialidades)
                    .addComponent(Disponibles))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PacientesAct)
                    .addComponent(PacientesAlta))
                .addGap(27, 27, 27)
                .addComponent(Items)
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FICHA)
                    .addComponent(FICHAPACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicosActionPerformed

        selec.informacionesMedicos();
    }//GEN-LAST:event_MedicosActionPerformed

    private void ItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemsActionPerformed
     selec.informacionesItems();       
    }//GEN-LAST:event_ItemsActionPerformed

    private void EspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EspecialidadesActionPerformed
        selec.informacionesEspecialidad();
    }//GEN-LAST:event_EspecialidadesActionPerformed

    private void OcupadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OcupadasActionPerformed
       selec.informacionesOcupada();
    }//GEN-LAST:event_OcupadasActionPerformed

    private void PacientesActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacientesActActionPerformed
       selec.informacionesActuales();
    }//GEN-LAST:event_PacientesActActionPerformed

    private void DisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponiblesActionPerformed
       selec.informacionesDisponible();
    }//GEN-LAST:event_DisponiblesActionPerformed

    private void PacientesAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacientesAltaActionPerformed
      selec.informacionesAlta();
    }//GEN-LAST:event_PacientesAltaActionPerformed

    private void FICHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FICHAActionPerformed
        selec.informacionesPacientes((String) this.FICHAPACIENTE.getSelectedItem());
    }//GEN-LAST:event_FICHAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Informaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Disponibles;
    private javax.swing.JButton Especialidades;
    private javax.swing.JButton FICHA;
    public static javax.swing.JComboBox<String> FICHAPACIENTE;
    public static javax.swing.JTable INFORMACIONES;
    private javax.swing.JButton Items;
    private javax.swing.JButton Medicos;
    private javax.swing.JButton Ocupadas;
    private javax.swing.JButton PacientesAct;
    private javax.swing.JButton PacientesAlta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
