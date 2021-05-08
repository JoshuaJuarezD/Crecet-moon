package GUI;

import Class.Producto;
import Class.Tag;
import Funciones.IO;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EliminarProductoobsoleto extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    IO io = new IO();
    ArrayList<Producto> productosExistentes = io.lecturaProducto();

    public EliminarProductoobsoleto() {
        initComponents();
    }

    public void iniciar() {
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 842, 613);
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Descripcion");
        model.addColumn("Etiquetas");
        for (int c = 0; c < productosExistentes.size(); c++) {
            String tags = fomatotag(productosExistentes.get(c).getIDtag());
            model.addRow(new Object[]{productosExistentes.get(c).getID(), productosExistentes.get(c).getNombre(), productosExistentes.get(c).getDescripcion(), tags});
        }
        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Eliminar producto");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Eliminar Producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Regresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model2 = new DefaultTableModel();
        String Busqueda = jTextField1.getText().toLowerCase();
        model2.addColumn("ID");
        model2.addColumn("Nombre");
        model2.addColumn("Descripcion");
        model2.addColumn("Etiquetas");
        ArrayList<Producto> productoBuscado = new ArrayList();
        for (int c = 0; c < model.getRowCount(); c++) {
            if (model.getValueAt(c, 0).toString().toLowerCase().contains(Busqueda)||model.getValueAt(c, 1).toString().toLowerCase().contains(Busqueda)||model.getValueAt(c, 3).toString().toLowerCase().contains(Busqueda)) {
                model2.addRow(new Object[]{model.getValueAt(c, 0),model.getValueAt(c, 1),model.getValueAt(c, 2),model.getValueAt(c, 3) });
            }
        }
        jTable1.setModel(model2);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(150);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int seleccionado = jTable1.getSelectedRow();
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(new JFrame(), "Ningun producto selecciando", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int lugar = 0;
        for (int c = 0; c < productosExistentes.size(); c++) {
            if (productosExistentes.get(c).getID() == jTable1.getValueAt(seleccionado, 0)) {
                lugar = c;
            }
        }
        int A = JOptionPane.showConfirmDialog(new JFrame(), "seguro que desa eliminar el producto " + productosExistentes.get(lugar).getNombre());
        if (A == JOptionPane.YES_OPTION) {
            productosExistentes.remove(lugar);
            JOptionPane.showMessageDialog(new JFrame(), "Producto eliminado correctamente");
            io.escrituraProducto(productosExistentes);
            iniciar();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
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
                retorno = retorno + ",";
            }
        }
        return retorno;
    }
}
