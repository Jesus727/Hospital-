
package Interfaces;

import Conectar.Conectar;
import Datos.DItems;
import Funciones.FActualizar;
import Funciones.FEliminar;
import Funciones.FIngresar;
import Funciones.FSeleccionar;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class CrearItems extends javax.swing.JFrame {
    FSeleccionar reg = new FSeleccionar();
    FIngresar ing = new FIngresar();
    DItems item = new DItems();
    FEliminar eli = new FEliminar();
    FActualizar Acty = new FActualizar();
    public CrearItems() {
        initComponents();
        reg.numerosIDItems();
        setTitle("Crear Items");
        setLocationRelativeTo(null);
        reg.TablaItems("");
        IDITEM.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IDITEM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        NOMBRE = new javax.swing.JTextField();
        STOCK = new javax.swing.JTextField();
        VALOR = new javax.swing.JTextField();
        INGRESAR = new javax.swing.JButton();
        VOLVER = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ITEMS = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        BuscarNom = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        btMostrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ActPrecio = new javax.swing.JTextField();
        btAct = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ActStock = new javax.swing.JTextField();
        btActStock = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Crear Items");

        jLabel2.setText("Nombre");

        jLabel3.setText("Stock");

        jLabel4.setText("Valor Unitario");

        STOCK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                STOCKKeyTyped(evt);
            }
        });

        VALOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VALORKeyTyped(evt);
            }
        });

        INGRESAR.setText("Ingresar");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });

        VOLVER.setText("Volver");
        VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOLVERActionPerformed(evt);
            }
        });

        ITEMS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(ITEMS);

        jLabel5.setText("Ingrese el nombre de Item");

        btBuscar.setText("Buscar Item");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btMostrar.setText("Mostar Todo");
        btMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMostrarActionPerformed(evt);
            }
        });

        jLabel6.setText("Seleccione un Item");

        jLabel7.setText("Actualizar Precio");

        ActPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ActPrecioKeyTyped(evt);
            }
        });

        btAct.setText("Actualizar");
        btAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActActionPerformed(evt);
            }
        });

        jLabel8.setText("Reponer Stock");

        ActStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ActStockKeyTyped(evt);
            }
        });

        btActStock.setText("Reponer");
        btActStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActStockActionPerformed(evt);
            }
        });

        btEliminar.setText("Eliminar");
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDITEM, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(NOMBRE, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(STOCK)
                                    .addComponent(VALOR))))
                        .addGap(62, 62, 62)
                        .addComponent(INGRESAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(BuscarNom, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar)
                        .addGap(27, 27, 27)
                        .addComponent(btMostrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ActPrecio)
                            .addComponent(ActStock, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btAct)
                            .addComponent(btActStock)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel5)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(btEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(VOLVER)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IDITEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(STOCK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INGRESAR))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar)
                    .addComponent(btMostrar))
                .addGap(36, 36, 36)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ActPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ActStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btActStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEliminar)
                    .addComponent(VOLVER))
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
      if (NOMBRE.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre");
            NOMBRE.requestFocus();
            return;
        }
        if (STOCK.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Stock");
            STOCK.requestFocus();
            return;
        }
        if (VALOR.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Valor");
            VALOR.requestFocus();
            return;
        }
        
        reg.verificarNombreItems(NOMBRE.getText());
        
        int veri = Conectar.ver;
        if(veri == 0){
           JOptionPane.showMessageDialog(null, "Este Nombre de Item : " + NOMBRE.getText() + ", ya fue ingresado.");
        }else{
        item.SetId_Items(IDITEM.getText());
        item.SetNombre(NOMBRE.getText());
        item.SetStock(Integer.parseInt(STOCK.getText()));
        item.SetValorUnit(Integer.parseInt(VALOR.getText()));
        
        ing.CrearItems(item.GetId_Items(),item.GetNombre(),item.GetStock(),item.GetValorUnit());
        
        NOMBRE.setText("");
        IDITEM.setText("");
        STOCK.setText("");
        VALOR.setText("");
        reg.numerosIDItems();
        reg.TablaItems("");
        }
    }//GEN-LAST:event_INGRESARActionPerformed

    private void VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOLVERActionPerformed
        dispose();
    }//GEN-LAST:event_VOLVERActionPerformed

    private void btActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActActionPerformed
    int fila = ITEMS.getSelectedRow();
    String cod="";
    cod=ITEMS.getValueAt(fila, 0).toString();
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea actualizar el Precio del Producto?", 
   "Selector de opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){
    if(ActPrecio.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Ingrese un Precio!!");
    }else{  
    Acty.ActualizarItems(ActPrecio.getText(),cod);
    reg.TablaItems("");
    ActPrecio.setText("");
    JOptionPane.showMessageDialog(null,"Datos Actualizados Correctamente");
    }
}
    }//GEN-LAST:event_btActActionPerformed

    private void btActStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActStockActionPerformed
    int fila = ITEMS.getSelectedRow();
    String cod="";
    cod=ITEMS.getValueAt(fila, 0).toString();
    String a = ITEMS.getValueAt(fila, 2).toString();
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea agregar Stock al Producto?", 
   "Selector de opciones",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

     int b = Integer.parseInt(a);   
     int c = Integer.parseInt(ActStock.getText());
     int Suma = b + c ;
if (seleccion != 1){
    if(ActStock.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Ingrese una Cantidad!!");
    }else{
    Acty.ActualizarStock(Suma,cod);
    reg.TablaItems("");
    ActStock.setText("");
    JOptionPane.showMessageDialog(null,"Datos Reposición Agregada Correctamente");
    }
}
    }//GEN-LAST:event_btActStockActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
    int fila = ITEMS.getSelectedRow();
    String cod="";
    cod=ITEMS.getValueAt(fila, 0).toString();;
    int seleccion = JOptionPane.showOptionDialog(
    null,
   "¿Está Seguro que desea Elimnar el Producto?", 
   "Eliminar Items",
   JOptionPane.YES_NO_CANCEL_OPTION,
   JOptionPane.QUESTION_MESSAGE,
   null,    
   new Object[] { "SI", "NO" },   
   "SI");

if (seleccion != 1){
        eli.EliminarItems(cod);
        reg.TablaItems("");
}
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        reg.TablaItems(BuscarNom.getText());
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMostrarActionPerformed
        reg.TablaItems("");
    }//GEN-LAST:event_btMostrarActionPerformed

    private void STOCKKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_STOCKKeyTyped
        char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_STOCKKeyTyped

    private void VALORKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VALORKeyTyped
       char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_VALORKeyTyped

    private void ActPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActPrecioKeyTyped
       char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_ActPrecioKeyTyped

    private void ActStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActStockKeyTyped
       char ty =evt.getKeyChar();
            if ((((ty<'0')||(ty>'9')))&&(ty!=KeyEvent.VK_BACK_SPACE) && (ty!=KeyEvent.VK_ENTER)){
            getToolkit().beep();
            evt.consume();
            }
    }//GEN-LAST:event_ActStockKeyTyped

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
            java.util.logging.Logger.getLogger(CrearItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActPrecio;
    private javax.swing.JTextField ActStock;
    private javax.swing.JTextField BuscarNom;
    public static javax.swing.JTextField IDITEM;
    private javax.swing.JButton INGRESAR;
    public static javax.swing.JTable ITEMS;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JTextField STOCK;
    private javax.swing.JTextField VALOR;
    private javax.swing.JButton VOLVER;
    private javax.swing.JButton btAct;
    private javax.swing.JButton btActStock;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
