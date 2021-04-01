package GUI;

import Class.Producto;
import Class.Proovedor;
import Class.Tag;
import Funciones.IO;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CrearNuevoProducto extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    IO io = new IO();
    ArrayList<Tag> tagGuardados = io.lecturaTags();
    ArrayList<Proovedor> proovedores = io.lecturaProovedor();
    ArrayList<Producto> producto = io.lecturaProducto();

    public CrearNuevoProducto() {
        initComponents();
    }

    public void iniciar() {

        jComboBox1.addItem("sin seleccionar");
        for (int c = 0; c < proovedores.size(); c++) {
            jComboBox1.addItem(proovedores.get(c).getNombre());
        }
        jCheckBox1.setSelected(true);
        jCheckBox2.setSelected(true);
        model = new DefaultTableModel();
        model2 = new DefaultTableModel();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 1120, 511);
        this.setVisible(true);
        jTextArea1.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jComboBox1.setSelectedIndex(0);
        iniciarTablas();
    }

    public void iniciarTablas() {
        ArrayList<Tag> tagSeleccioando = new ArrayList();
        boolean ban = false;
        ArrayList<String> seleccionado = new ArrayList();
        model.addColumn("ID");
        model.addColumn("Nombre");
        for (int c = 0; c < tagGuardados.size(); c++) {
            model.addRow(new Object[]{tagGuardados.get(c).getID(), tagGuardados.get(c).getNombre()});
        }
        jTable2.setModel(model);
        model2.addColumn("ID");
        model2.addColumn("Nombre");
        jTable3.setModel(model2);
        jTable3.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable3.getColumnModel().getColumn(1).setPreferredWidth(150);
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(150);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 255, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Agregar Producto");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 255, 41));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Codigo de barras");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 184, 39));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 328, 39));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Nombre del producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 184, 39));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 328, 39));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Descripcion ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 184, 39));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 328, 123));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Costo del producto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 184, 39));

        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 328, 39));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Agregar un proovedor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 184, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 146, 39));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("MXN");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 43, 39));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Etiquetas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, 45));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Quitar etiquetas");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 280, 170, 40));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 30));

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Guardar producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 199, 48));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 142, 43));

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 282, 113));

        jTable3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable3);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 282, 113));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("Agregar etiquetas");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 180, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (!jCheckBox1.isSelected()) {
            jLabel5.setEnabled(false);
            jLabel6.setEnabled(false);
            jLabel7.setEnabled(false);
            jComboBox1.setEnabled(false);
            jTextField3.setEnabled(false);
        } else {
            jLabel5.setEnabled(true);
            jLabel6.setEnabled(true);
            jLabel7.setEnabled(true);
            jComboBox1.setEnabled(true);
            jTextField3.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (!jCheckBox2.isSelected()) {
            jLabel8.setEnabled(false);
            jTable2.setEnabled(false);
            jTable3.setEnabled(false);
            jButton4.setEnabled(false);
            jButton1.setEnabled(false);
        } else {
            jLabel8.setEnabled(true);
            jButton1.setEnabled(true);
            jTable2.setEnabled(true);
            jTable3.setEnabled(true);
            jButton4.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextArea1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(new JFrame(), "Uno o mas campos vacios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String ID = jTextField1.getText();
        String nombre = jTextField2.getText();
        String Descripcion = jTextArea1.getText().replace("\n", ", ");
        ArrayList<String> Idproovedor = new ArrayList();
        ArrayList<Double> costo = new ArrayList();
        ArrayList<String> tags = new ArrayList();
        if (jCheckBox1.isSelected()) {

            if (jComboBox1.getSelectedIndex() != 0) {
                Idproovedor.add(proovedores.get(jComboBox1.getSelectedIndex() - 1).getID());
            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Proovedor no seleccionado", "Error", JOptionPane.ERROR_MESSAGE);
            }
            try {
                costo.add(Double.parseDouble(jTextField3.getText()));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(new JFrame(), "Costo no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (jCheckBox2.isSelected()) {
            int filas = jTable3.getRowCount();
            if (filas == 0) {
                JOptionPane.showMessageDialog(new JFrame(), "No se agregaron etiquetas", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            for (int c = 0; c < filas; c++) {
                tags.add(model2.getValueAt(c, 0).toString());
            }
        }
        Producto nuevoProducto = new Producto(ID, nombre, Descripcion, Idproovedor, costo, tags);
        if (validaProducto(nuevoProducto)) {
            JOptionPane.showMessageDialog(new JFrame(), "Producto existente ", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        producto.add(nuevoProducto);
        io.escrituraProducto(producto);
        JOptionPane.showMessageDialog(new JFrame(), "Producto agregado correctamente");
        iniciar();
    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean validaProducto(Producto productoNuevo) {
        for (int c = 0; c < producto.size(); c++) {
            if (productoNuevo.getID().equals(producto.get(c).getID())) {
                return true;
            }
        }
        return false;
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int filas[] = jTable3.getSelectedRows();
        for (int c = 0; c < filas.length; c++) {
            model.addRow(new Object[]{model2.getValueAt(filas[c], 0).toString(), model2.getValueAt(filas[c], 1).toString()});
        }
        for (int c = filas.length - 1; c >= 0; c--) {
            model2.removeRow(filas[c]);
        }
        jTable2.setModel(model);
        jTable3.setModel(model2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int filas[] = jTable2.getSelectedRows();
        for (int c = 0; c < filas.length; c++) {
            model2.addRow(new Object[]{model.getValueAt(filas[c], 0).toString(), model.getValueAt(filas[c], 1).toString()});
        }
        for (int c = filas.length - 1; c >= 0; c--) {
            model.removeRow(filas[c]);
        }
        jTable2.setModel(model);
        jTable3.setModel(model2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ventanaPrincipal ventana=new ventanaPrincipal();
        this.setVisible(false);
        ventana.iniciar();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
