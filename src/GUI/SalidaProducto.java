package GUI;

import Class.Producto;
import Class.Proovedor;
import Class.Reporte;
import Class.Tag;
import Funciones.IO;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SalidaProducto extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    DefaultListModel modeloLista = new DefaultListModel();
    IO io = new IO();
    ArrayList<Producto> productos = io.lecturaProducto();
    ArrayList<Proovedor> proveedores = io.lecturaProovedor();
    ArrayList<Tag> tagexistente = io.lecturaTags();
    ArrayList<Reporte> Reportesexistentes = io.lecturaReporte();

    public SalidaProducto() {

        initComponents();
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        this.setBounds((ancho / 2) - (this.getWidth() / 2), (alto / 2) - (this.getHeight() / 2), 800, 510);
        refrescarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        BotonSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agregar productos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 260, 41));

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Boton.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setToolTipText("");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPreferredSize(new java.awt.Dimension(125, 40));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 140, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Crear nuevo producto");
        jButton3.setBorder(null);
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 170, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Eliminar Etiqueta");
        jButton4.setBorder(null);
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 170, 30));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Salida de Producto");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, 30));

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Agregar producto");
        jButton5.setBorder(null);
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 170, 30));

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Agregar proveedor");
        jButton6.setBorder(null);
        jButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 170, 30));

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Agregar Etiqueta");
        jButton7.setBorder(null);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 170, 30));

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Eliminar Producto");
        jButton8.setBorder(null);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 170, 30));

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Eliminar proveedor");
        jButton9.setBorder(null);
        jButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 170, 30));

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Boton.png"))); // NOI18N
        jButton2.setText("Buscar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 90, 30));

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Reportes");
        jButton13.setBorder(null);
        jButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 170, 30));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 250, 30));

        BotonSalir.setBackground(new java.awt.Color(0, 0, 0));
        BotonSalir.setFont(new java.awt.Font("Tw Cen MT", 0, 36)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        BotonSalir.setText("Salir");
        BotonSalir.setBorder(null);
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 100, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 70, 30));

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 100, 30));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Etiquetas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 550, 280));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 2, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CRESCENT MOON");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 160, 40));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo menu.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 510));

        Fondo.setBackground(new java.awt.Color(255, 204, 153));
        Fondo.setForeground(new java.awt.Color(0, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 600, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int cantidad;
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(new JFrame(), "Ningun producto seleccioando", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                cantidad = Integer.parseInt(jTextField4.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(new JFrame(), "Cantidad Invalida", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String idproducto = jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString();
            ArrayList<String> idetiquetas = new ArrayList();
            for (int c = 0; c < productos.size(); c++) {
                if (productos.get(c).getID().equals(idproducto)) {
                    if (productos.get(c).getCantidadBodega() < cantidad) {
                        JOptionPane.showMessageDialog(new JFrame(), "Cantidad insuficiente en bodega", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    } else {
                        productos.get(c).setCantidadBodega(productos.get(c).getCantidadBodega() - cantidad);
                        idetiquetas = productos.get(c).getIDtag();
                    }
                }
            }
            Reporte reporte = new Reporte("RE0" + Reportesexistentes.size(), 0, new Date(), idproducto, " ", idetiquetas, cantidad, 0);
            Reportesexistentes.add(reporte);
            io.escrituraProducto(productos);
            io.escrituraReporte(Reportesexistentes);
            JOptionPane.showMessageDialog(new JFrame(), "Operacion guardada con exito", "operacion completa", JOptionPane.INFORMATION_MESSAGE);
            jTextField4.setText("");
            refrescarTabla();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        agregarProveedor ventan = new agregarProveedor();
        ventan.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        AgregarEtiqueta ventana = new AgregarEtiqueta();
        ventana.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CrearNuevoProducto ventana = new CrearNuevoProducto();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model2 = new DefaultTableModel();
        String Busqueda = jTextField1.getText().toLowerCase();
        model2.addColumn("ID");
        model2.addColumn("Nombre");
        model2.addColumn("Etiquetas");
        model2.addColumn("cantidad");
        for (int c = 0; c < model.getRowCount(); c++) {
            if (model.getValueAt(c, 0).toString().toLowerCase().contains(Busqueda) || model.getValueAt(c, 1).toString().toLowerCase().contains(Busqueda) || model.getValueAt(c, 2).toString().toLowerCase().contains(Busqueda)) {
                model2.addRow(new Object[]{model.getValueAt(c, 0), model.getValueAt(c, 1), model.getValueAt(c, 2), model.getValueAt(c, 3)});
            }
        }
        jTable1.setModel(model2);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        EliminarProducto v=new EliminarProducto();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AgregarProducto v=new AgregarProducto();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        EliminaProveedor v=new EliminaProveedor();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EliminarEtiqueta v=new EliminarEtiqueta();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        int resp=JOptionPane.showConfirmDialog(new JFrame(), "¿Segruo que desa salir?", "Confirmacion",JOptionPane.OK_CANCEL_OPTION);
        if(resp == JOptionPane.OK_OPTION)
        System.exit(0);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Reportes v=new Reportes();
        v.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

    private String fomatotag(ArrayList<String> cadena) {
        String retorno = new String();
        for (int d = 0; d < cadena.size(); d++) {
            for (int c = 0; c < tagexistente.size(); c++) {
                if (tagexistente.get(c).getID().equals(cadena.get(d)) && tagexistente.get(c).isActivo()) {
                    retorno = retorno + tagexistente.get(c).getNombre();
                }
            }
            if (d != cadena.size() - 1) {
                retorno = retorno + ", ";
            }
        }
        return retorno;
    }

    private void refrescarTabla() {
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Etiquetas");
        model.addColumn("Canridad");
        for (int c = 0; c < productos.size(); c++) {
            if (productos.get(c).isActivo()) {
                String tags = fomatotag(productos.get(c).getIDtag());
                model.addRow(new Object[]{productos.get(c).getID(), productos.get(c).getNombre(), tags, productos.get(c).getCantidadBodega()});
            }
        }
        jTable1.setModel(model);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);

    }
}
