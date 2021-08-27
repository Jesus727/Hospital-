
package Interfaces;

import Funciones.FActualizar;
import Funciones.FSeleccionar;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Font;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CobroGastos extends javax.swing.JFrame implements Runnable {
String hora , minuto , segundo;
Thread hilo;
    FSeleccionar reg = new FSeleccionar();
    FActualizar Acty = new FActualizar();
    private Font fuenteTitulo = new Font(Font.FontFamily.COURIER, 15, Font.BOLD);
    private Font fuenteTextos = new Font(Font.FontFamily.COURIER, 10, Font.NORMAL);
    private Font fuenteEtiquetas = new Font(Font.FontFamily.COURIER, 12, Font.BOLD);
    public CobroGastos() {
        initComponents();
        reg.CPaciente();
        setTitle("Cobro Factura Paciente");
        setLocationRelativeTo(null);
        FECHA.setText(fecha());
        hilo = new Thread (this);
        hilo.start();
        IDPACIENTE.setVisible(false);
        cama.setVisible(false);
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
    void Total(){
    int fila = GASTOS.getRowCount();
    int i;
    int valores = 0;
    
    for (i = 0; i < fila; i++) {
    String valor = (String) GASTOS.getValueAt(i, 4);
    int a = Integer.parseInt(valor);
    valores = valores + a;
    }
    ValorTotal.setText(valores+"");
 }
private void agregarTextoNormal(Document document, String string,
            Font font, int align) {
        try {
            Chunk espacio = new Chunk(string, font);
            Paragraph p = new Paragraph(espacio);
            p.setAlignment(align);
            document.add(p);
        } catch (DocumentException ex) {
            ex.printStackTrace();
        }
    }

    private void agregarSeparacion(Document document) {
        try {
            Font fuente = new Font(Font.FontFamily.TIMES_ROMAN, 4, Font.NORMAL);
            Chunk espacio = new Chunk("\n", fuente);
            document.add(new Paragraph(espacio));
        } catch (DocumentException ex) {
            ex.printStackTrace();
        }
    }

    private void agregarEtiqueta(Document document, String string,
            Font font, int align) {
       
          try {
            Chunk espacio = new Chunk(string, font);
            Paragraph p = new Paragraph(espacio);
            p.setAlignment(align);
            document.add(p);
        } catch (DocumentException ex) {
            ex.printStackTrace();
        }
    }

    private void agregarTexto(Document document, String string,
            Font font, int align) {
            try {
            Chunk espacio = new Chunk(string, font);
            Paragraph p = new Paragraph(espacio);
            p.setAlignment(align);
            document.add(p);
        } catch (DocumentException ex) {
            ex.printStackTrace();
        }
    }
        private void agregarEtiquetaTab(PdfPTable table, String string, int align,
            boolean isBorder, int colspan) {
        Chunk c = new Chunk(string, fuenteEtiquetas);
        PdfPCell cell = new PdfPCell(new Phrase(c));
        if (!isBorder) {
            cell.setBorder(Rectangle.NO_BORDER);
        }
        cell.setColspan(colspan);
        cell.setVerticalAlignment(align);
        cell.setHorizontalAlignment(align);
        table.addCell(cell);
    }
            private void agregarTextoTab(PdfPTable table, String string, int align,
            boolean isBorder, int colspan) {
        Chunk c = new Chunk(string, fuenteTextos);
        PdfPCell cell = new PdfPCell(new Phrase(c));
        if (!isBorder) {
            cell.setBorder(Rectangle.NO_BORDER);
        }
        cell.setColspan(colspan);
        cell.setHorizontalAlignment(align);
        table.addCell(cell);
    }
                               
          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BUSCAR = new javax.swing.JButton();
        PACIENTE = new javax.swing.JComboBox<>();
        IDPACIENTE = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        GASTOS = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        ValorTotal = new javax.swing.JTextField();
        imprimir = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        FECHA = new javax.swing.JTextField();
        HORA = new javax.swing.JTextField();
        cama = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Factura del Paciente");

        BUSCAR.setText("Buscar Paciente");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        PACIENTE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        PACIENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PACIENTEActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione al Paciente");

        GASTOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(GASTOS);

        jLabel3.setText("El total a cancelar es de : ");

        imprimir.setText("Imprimir Factura");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        HORA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HORAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(imprimir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(volver))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cama)
                                    .addComponent(IDPACIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addComponent(PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(BUSCAR)))
                        .addGap(21, 21, 21)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FECHA)
                    .addComponent(HORA, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FECHA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(HORA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUSCAR)
                    .addComponent(PACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDPACIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imprimir)
                    .addComponent(volver))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PACIENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PACIENTEActionPerformed
       reg.PacienteGastos((String) this.PACIENTE.getSelectedItem());
       reg.PACIENTECAMAA((String) this.PACIENTE.getSelectedItem());
    }//GEN-LAST:event_PACIENTEActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
       reg.PacienteGasto(IDPACIENTE.getText());
       Total();
    }//GEN-LAST:event_BUSCARActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void HORAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HORAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HORAActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
             
        try {
            Rectangle pagesize = new Rectangle(400f, 380f);
            Document documento = new Document(pagesize, 10, 10, 0, 0);
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/Desktop/FACTURADEGASTOS.pdf"));// donde y como se llama el PDF
            documento.open();           
            agregarTextoNormal(documento, " 'FACTURA DE GASTOS' ", fuenteTitulo, Element.ALIGN_CENTER);
            agregarSeparacion(documento);
            agregarSeparacion(documento);
            agregarSeparacion(documento);
            agregarSeparacion(documento);
            agregarEtiqueta(documento , "NOMBRE DEL PACIENTE " ,fuenteEtiquetas,Element.ALIGN_LEFT);
            agregarTexto(documento , (String) this.PACIENTE.getSelectedItem() ,fuenteTextos,Element.ALIGN_LEFT);
            agregarEtiqueta(documento , "FECHA EMITIDA " ,fuenteEtiquetas,Element.ALIGN_LEFT);
            agregarTexto(documento , FECHA.getText() ,fuenteTextos,Element.ALIGN_LEFT);
            agregarEtiqueta(documento , "HORA EMITIDA" ,fuenteEtiquetas,Element.ALIGN_LEFT);
            agregarTexto(documento , HORA.getText() ,fuenteTextos,Element.ALIGN_LEFT);
            
       
            int fila=this.GASTOS.getRowCount();
            int i;
        agregarEtiqueta(documento , "===================================================" ,fuenteEtiquetas,Element.ALIGN_CENTER);    
        PdfPTable tabla = new PdfPTable(3);
        tabla.setWidthPercentage(100f);
        agregarEtiquetaTab(tabla, "DESCRIPCION", Element.ALIGN_CENTER, false, 1);
        for (i = 0; i < fila; i++) {
        agregarTextoTab(tabla, GASTOS.getValueAt(i, 0).toString(),Element.ALIGN_CENTER, false, 1 );
        }
         agregarEtiquetaTab(tabla, "CANTIDAD", Element.ALIGN_CENTER, false, 1);
        for (i = 0; i < fila; i++) {
        agregarTextoTab(tabla, GASTOS.getValueAt(i,2).toString(),Element.ALIGN_CENTER, false, 1);
        }
        agregarEtiquetaTab(tabla, "PRECIO", Element.ALIGN_CENTER, false, 1);
        for (i = 0; i < fila; i++) {
        agregarTextoTab(tabla, GASTOS.getValueAt(i, 3).toString(), Element.ALIGN_CENTER, false, 1);
        }
        documento.add(tabla);
        agregarSeparacion(documento);
        agregarEtiqueta(documento , "MONTO TOTAL A CANCELAR" ,fuenteEtiquetas,Element.ALIGN_CENTER);
        agregarTexto(documento , ValorTotal.getText() ,fuenteTextos,Element.ALIGN_CENTER);
        agregarEtiqueta(documento , "==================================================" ,fuenteEtiquetas,Element.ALIGN_CENTER);    
            agregarSeparacion(documento);
            agregarSeparacion(documento);
            agregarSeparacion(documento);
            agregarTextoNormal(documento, ".:: SISTEMAS UBO ::.", fuenteTitulo, Element.ALIGN_CENTER);
            agregarTextoNormal(documento, "NICOLAS DIAZ - CARLOS SANHUEZA", fuenteTitulo, Element.ALIGN_CENTER);
            agregarTextoNormal(documento, "JOEL GONZALEZ - CRISTOBAL QUIROZ", fuenteTitulo, Element.ALIGN_CENTER);
            agregarSeparacion(documento);
            agregarSeparacion(documento);
            agregarSeparacion(documento);
            agregarSeparacion(documento);            
            documento.close();
            JOptionPane.showMessageDialog(null, " La Boleta se ha guardado exitosamente en el 'Escritorio'");
            documento.open();
            
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            e.printStackTrace();
        } 
        try{
           String ruta = System.getProperty("user.home");
          String url = (ruta + "/Desktop/FACTURADEGASTOS.pdf");
          ProcessBuilder p = new ProcessBuilder();
          p.command("cmd.exe","/c",url );
          p.start();
        }catch(IOException ex){
            Logger.getLogger(CobroGastos.class.getName()).log(Level.SEVERE, null, ex);
        }
        Acty.TrasladoDisponible(cama.getText());
        Acty.Alta(IDPACIENTE.getText());
        PACIENTE.removeAllItems();
        reg.CPaciente();
        IDPACIENTE.setText("");
        ValorTotal.setText("");
        reg.PacienteGasto(IDPACIENTE.getText());
       
    }//GEN-LAST:event_imprimirActionPerformed


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
            java.util.logging.Logger.getLogger(CobroGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CobroGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CobroGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CobroGastos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CobroGastos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSCAR;
    private javax.swing.JTextField FECHA;
    public static javax.swing.JTable GASTOS;
    private javax.swing.JTextField HORA;
    public static javax.swing.JTextField IDPACIENTE;
    public static javax.swing.JComboBox<String> PACIENTE;
    private javax.swing.JTextField ValorTotal;
    public static javax.swing.JTextField cama;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
