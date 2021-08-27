package Interfaces;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setTitle("Menú");
        setLocationRelativeTo(null); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCrear = new javax.swing.JMenu();
        CrearUsuario = new javax.swing.JMenuItem();
        MenuIngresar = new javax.swing.JMenu();
        IngDepartamento = new javax.swing.JMenuItem();
        IngEspecialidad = new javax.swing.JMenuItem();
        IngIsapre = new javax.swing.JMenuItem();
        IngFuncionario = new javax.swing.JMenuItem();
        IngCama = new javax.swing.JMenuItem();
        IngItems = new javax.swing.JMenuItem();
        MenuRegistros = new javax.swing.JMenu();
        RegPaciente = new javax.swing.JMenuItem();
        MenuOperaciones = new javax.swing.JMenu();
        OpTratamiento = new javax.swing.JMenuItem();
        OpGastos = new javax.swing.JMenuItem();
        OpFactura = new javax.swing.JMenuItem();
        MenuInformacion = new javax.swing.JMenu();
        Info = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MenuCrear.setText("Crear");

        CrearUsuario.setText("Crear Usuario");
        CrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearUsuarioActionPerformed(evt);
            }
        });
        MenuCrear.add(CrearUsuario);

        jMenuBar1.add(MenuCrear);

        MenuIngresar.setText("Ingresar");

        IngDepartamento.setText("Departamento");
        IngDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngDepartamentoActionPerformed(evt);
            }
        });
        MenuIngresar.add(IngDepartamento);

        IngEspecialidad.setText("Especialidad");
        IngEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngEspecialidadActionPerformed(evt);
            }
        });
        MenuIngresar.add(IngEspecialidad);

        IngIsapre.setText("Isapre");
        IngIsapre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngIsapreActionPerformed(evt);
            }
        });
        MenuIngresar.add(IngIsapre);

        IngFuncionario.setText("Funcionario(Medico)");
        IngFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngFuncionarioActionPerformed(evt);
            }
        });
        MenuIngresar.add(IngFuncionario);

        IngCama.setText("Cama");
        IngCama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngCamaActionPerformed(evt);
            }
        });
        MenuIngresar.add(IngCama);

        IngItems.setText("Items");
        IngItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngItemsActionPerformed(evt);
            }
        });
        MenuIngresar.add(IngItems);

        jMenuBar1.add(MenuIngresar);

        MenuRegistros.setText("Registro");

        RegPaciente.setText("Paciente");
        RegPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegPacienteActionPerformed(evt);
            }
        });
        MenuRegistros.add(RegPaciente);

        jMenuBar1.add(MenuRegistros);

        MenuOperaciones.setText("Operaciones");

        OpTratamiento.setText("Control Medico");
        OpTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpTratamientoActionPerformed(evt);
            }
        });
        MenuOperaciones.add(OpTratamiento);

        OpGastos.setText("Control consumo Paciente");
        OpGastos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpGastosActionPerformed(evt);
            }
        });
        MenuOperaciones.add(OpGastos);

        OpFactura.setText("Cobro Factura");
        OpFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpFacturaActionPerformed(evt);
            }
        });
        MenuOperaciones.add(OpFactura);

        jMenuBar1.add(MenuOperaciones);

        MenuInformacion.setText("Informacion");

        Info.setText("Informaciones");
        Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoActionPerformed(evt);
            }
        });
        MenuInformacion.add(Info);

        jMenuBar1.add(MenuInformacion);

        MenuSalir.setText("Salir");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        MenuSalir.add(Salir);

        jMenuBar1.add(MenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngDepartamentoActionPerformed
       CrearDepartamento n = new CrearDepartamento();
       n.setVisible(true);
    }//GEN-LAST:event_IngDepartamentoActionPerformed

    private void CrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearUsuarioActionPerformed
       CrearUsuario n = new CrearUsuario();
       n.setVisible(true);
    }//GEN-LAST:event_CrearUsuarioActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void IngEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngEspecialidadActionPerformed
       CrearEspecialidad n = new CrearEspecialidad();
       n.setVisible(true);
    }//GEN-LAST:event_IngEspecialidadActionPerformed

    private void IngIsapreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngIsapreActionPerformed
        CrearIsapre n = new CrearIsapre();
       n.setVisible(true);
    }//GEN-LAST:event_IngIsapreActionPerformed

    private void IngFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngFuncionarioActionPerformed
        CrearMedico n = new CrearMedico();
       n.setVisible(true);
    }//GEN-LAST:event_IngFuncionarioActionPerformed

    private void IngCamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngCamaActionPerformed
       CrearCama n = new CrearCama();
       n.setVisible(true);
    }//GEN-LAST:event_IngCamaActionPerformed

    private void IngItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngItemsActionPerformed
        CrearItems n = new CrearItems();
       n.setVisible(true);
    }//GEN-LAST:event_IngItemsActionPerformed

    private void RegPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegPacienteActionPerformed
       RegistrarPaciente n = new RegistrarPaciente();
       n.setVisible(true);
    }//GEN-LAST:event_RegPacienteActionPerformed

    private void OpTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpTratamientoActionPerformed
       Tratamiento n = new Tratamiento();
       n.setVisible(true);
    }//GEN-LAST:event_OpTratamientoActionPerformed

    private void OpGastosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpGastosActionPerformed
       ControlPaciente n = new ControlPaciente();
       n.setVisible(true);
    }//GEN-LAST:event_OpGastosActionPerformed

    private void OpFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpFacturaActionPerformed
       CobroGastos n = new CobroGastos();
       n.setVisible(true);
    }//GEN-LAST:event_OpFacturaActionPerformed

    private void InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoActionPerformed
        Informaciones n = new Informaciones();
       n.setVisible(true);
    }//GEN-LAST:event_InfoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem CrearUsuario;
    public static javax.swing.JMenuItem Info;
    public static javax.swing.JMenuItem IngCama;
    public static javax.swing.JMenuItem IngDepartamento;
    public static javax.swing.JMenuItem IngEspecialidad;
    public static javax.swing.JMenuItem IngFuncionario;
    public static javax.swing.JMenuItem IngIsapre;
    public static javax.swing.JMenuItem IngItems;
    public static javax.swing.JMenu MenuCrear;
    public static javax.swing.JMenu MenuInformacion;
    public static javax.swing.JMenu MenuIngresar;
    public static javax.swing.JMenu MenuOperaciones;
    public static javax.swing.JMenu MenuRegistros;
    public static javax.swing.JMenu MenuSalir;
    public static javax.swing.JMenuItem OpFactura;
    public static javax.swing.JMenuItem OpGastos;
    public static javax.swing.JMenuItem OpTratamiento;
    public static javax.swing.JMenuItem RegPaciente;
    public static javax.swing.JMenuItem Salir;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
