package GUI;

import Class.Producto;
import Class.Tag;
import Funciones.IO;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EliminarEtiqueta extends javax.swing.JFrame {
    IO io=new IO();
    ArrayList <Tag> tagExistente =io.lecturaTags();
    
    ArrayList<Producto> producto= new ArrayList();
    public EliminarEtiqueta() {
        initComponents();
    }

    public void iniciar(){
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 510, 391);
        DefaultTableModel modelo=new DefaultTableModel();       
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        for(int c=0;c<tagExistente.size();c++){
            modelo.addRow(new Object[]{tagExistente.get(c).getID(),tagExistente.get(c).getNombre()});
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Eliminar etiqueta");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 180, 36));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 440, 220));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 120, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Eliminar etiqueta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 160, 40));

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
        for (int c = 0; c < tagExistente.size(); c++) {
            if (tagExistente.get(c).getID().equals(jTable1.getValueAt(seleccionado, 0))) {
                lugar = c;
            }
        }
        int A = JOptionPane.showConfirmDialog(new JFrame(), "seguro que desa eliminar la etiqueta " + tagExistente.get(lugar).getNombre());
        if (A == JOptionPane.YES_OPTION) {
            eliminarTagProducto(tagExistente.get(lugar));
            tagExistente.remove(lugar);
            io.escrituraTags(tagExistente);         
            JOptionPane.showMessageDialog(new JFrame(), "Etiqueta Eliminada correctamente");
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

    private void eliminarTagProducto(Tag tag) {
        producto=io.lecturaProducto();
        for(int c=0;c<producto.size();c++){
            ArrayList<String> etiquetas=producto.get(c).getIDtag();
            for(int d=0;d<etiquetas.size();d++){
                if(etiquetas.get(d).equals(tag.getID()))
                    etiquetas.remove(d);
            }
            producto.get(c).setIDtag(etiquetas);
        }
        io.escrituraProducto(producto);
    }
}
