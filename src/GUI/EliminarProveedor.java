
package GUI;

import Class.Producto;
import Class.Proovedor;
import Funciones.IO;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EliminarProveedor extends javax.swing.JFrame {

    IO io=new IO();
    ArrayList <Proovedor> proveedorExitente = io.lecturaProovedor();
    ArrayList <Producto> producto=new ArrayList();
    public EliminarProveedor() {
        initComponents();
    }

    public void iniciar(){
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 510, 391);
        DefaultTableModel modelo=new DefaultTableModel();       
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        for(int c=0;c<proveedorExitente.size();c++){
            modelo.addRow(new Object[]{proveedorExitente.get(c).getID(),proveedorExitente.get(c).getNombre()});
        }
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(40);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Eliminar Proveedor");

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

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Eliminar Proveedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ventanaPrincipal ventana=new ventanaPrincipal();
        this.setVisible(false);
        ventana.iniciar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int seleccionado = jTable1.getSelectedRow();
        if (seleccionado == -1) {
            JOptionPane.showMessageDialog(new JFrame(), "Ninguna etiqueta seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int lugar = 0;
        for (int c = 0; c < proveedorExitente.size(); c++) {
            if (proveedorExitente.get(c).getID().equals(jTable1.getValueAt(seleccionado, 0))) {
                lugar = c;
            }
        }
        int A = JOptionPane.showConfirmDialog(new JFrame(), "seguro que desa eliminar el Proveedor" + proveedorExitente.get(lugar).getNombre());
        if (A == JOptionPane.YES_OPTION) {
            eliminarProProducto(proveedorExitente.get(lugar));
            proveedorExitente.remove(lugar);
            io.escrituraProovedor(proveedorExitente);
            JOptionPane.showMessageDialog(new JFrame(), "Proveedor eliminado correctamente");
            iniciar();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void eliminarProProducto(Proovedor proveedor) {
        producto=io.lecturaProducto();
        for(int c=0;c<producto.size();c++){
            ArrayList <Double> costo=producto.get(c).getCosto();
            ArrayList <String> proveedores=producto.get(c).getIDProovedor();
            for(int d=0;d<proveedores.size();d++){
                if(proveedores.get(d).equals(proveedor.getID())){
                    proveedores.remove(d);
                    costo.remove(d);
                }
            }
            producto.get(c).setIDtag(proveedores);
            producto.get(c).setCosto(costo);
        }
        io.escrituraProducto(producto);
    }
}
