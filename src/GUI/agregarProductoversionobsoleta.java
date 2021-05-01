package GUI;

import Class.Producto;
import Class.Proovedor;
import Class.Tag;
import Funciones.IO;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class agregarProductoversionobsoleta extends javax.swing.JFrame {
    
    DefaultTableModel model = new DefaultTableModel();
    IO io=new IO();
    ArrayList <Producto> productos =io.lecturaProducto();
    ArrayList <Proovedor> proveedores=io.lecturaProovedor();
    public agregarProductoversionobsoleta() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 147, 37));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, 540, 374));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 90, 30));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 200, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Proveedor");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 170, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Precio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 150, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Cantidad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 90, 40));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 90, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Agregar Productos");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 190, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Seleccionar Producto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 210, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model2 = new DefaultTableModel();
        String Busqueda = jTextField1.getText().toLowerCase();
        model2.addColumn("ID");
        model2.addColumn("Nombre");
        model2.addColumn("Etiquetas");
        ArrayList<Producto> productoBuscado = new ArrayList();
        for (int c = 0; c < model.getRowCount(); c++) {
            if (model.getValueAt(c, 0).toString().toLowerCase().contains(Busqueda)||model.getValueAt(c, 1).toString().toLowerCase().contains(Busqueda)||model.getValueAt(c, 2).toString().toLowerCase().contains(Busqueda)) {
                model2.addRow(new Object[]{model.getValueAt(c, 0),model.getValueAt(c, 1),model.getValueAt(c, 2) });
            }
        }
        jTable1.setModel(model2);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jComboBox1.setEnabled(false);
        jTextField2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     /*   jComboBox1=new JComboBox();
        jComboBox1.setEnabled(true);
        int seleccionado=jTable1.getSelectedRow();
        int lugar=0;
        for(int c=0;c<productos.size();c++)
            if(productos.get(c).getID().equals(jTable1.getValueAt(seleccionado, 0).toString()))
                lugar=c;
        if(productos.get(lugar).getIDProovedor().isEmpty()){
            JOptionPane.showMessageDialog(new JFrame(), "El producto no tiene algun proveedor asignado", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        for(int c=0;c<productos.get(lugar).getIDProovedor().size();c++)
            for(int d=0;d<proveedores.size();d++)
                if(proveedores.get(d).getID().equals(productos.get(lugar).getIDProovedor().get(c)))
                      jComboBox1.addItem(proveedores.get(d).getNombre());
       jTextField2.setEnabled(true);*/
    }//GEN-LAST:event_jButton4ActionPerformed

    public void iniciar(){
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 790, 530);
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Etiquetas");
        for (int c = 0; c < productos.size(); c++) {
            String tags = fomatotag(productos.get(c).getIDtag());
            model.addRow(new Object[]{productos.get(c).getID(), productos.get(c).getNombre(), tags});
        }
        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        this.setVisible(true);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

   private String fomatotag(ArrayList<String> cadena) {
        String retorno = new String();
        ArrayList<Tag> tagexistente = io.lecturaTags();
        for (int d = 0; d < cadena.size(); d++) {
            for (int c = 0; c < tagexistente.size(); c++) {
                if (tagexistente.get(c).getID().equals(cadena.get(d))) {
                    retorno = retorno + tagexistente.get(c).getNombre();
                }
            }
            if (d != cadena.size() - 1) {
                retorno = retorno + ", ";
            }
        }
        return retorno;
    }

}