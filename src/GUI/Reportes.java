package GUI;

import Class.Producto;
import Class.Proovedor;
import Class.Reporte;
import Class.Tag;
import Funciones.IO;
import Funciones.exportExcel;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Reportes extends javax.swing.JFrame {
    
    DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss   dd/MM/yyyy");
    IO io = new IO();
    ArrayList<Producto> productos = io.lecturaProducto();
    ArrayList<Proovedor> proveedores = io.lecturaProovedor();
    ArrayList<Tag> tagexistente = io.lecturaTags();
    ArrayList<Reporte> Reportesexistentes = io.lecturaReporte();
    
    public Reportes() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(1070, 820);
        jTable1.setModel(modelo());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consulta de Reportes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 40));

        jButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Boton.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 120, 40));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha final");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha inicial");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 110, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 90, 30));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 110, 30));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 90, 30));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 110, 30));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026" }));
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 110, 30));

        jCheckBox1.setBackground(new java.awt.Color(93, 119, 127));
        jCheckBox1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Salida de producto");
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 190, 30));

        jCheckBox2.setBackground(new java.awt.Color(93, 119, 127));
        jCheckBox2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Entrada de producto");
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 190, 30));

        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Boton.png"))); // NOI18N
        jButton2.setText("Consultar");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 140, 110, 50));

        jButton3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo Boton.png"))); // NOI18N
        jButton3.setText("Exportar excel");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 760, 140, 40));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 1030, 480));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 660));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 1070, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Boton salir
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo=modelo();
        if(jComboBox1.getSelectedIndex()==0||jComboBox2.getSelectedIndex()==0||jComboBox3.getSelectedIndex()==0||jComboBox4.getSelectedIndex()==0||jComboBox5.getSelectedIndex()==0||jComboBox6.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(new JFrame(), "Fecha invalida","Error",JOptionPane.ERROR_MESSAGE);
                return;
        }    
        String fechaA="00:00:00 " + jComboBox2.getSelectedItem().toString()+ "/" + jComboBox3.getSelectedItem().toString()+ "/" + jComboBox1.getSelectedItem().toString();
        String fechaB="00:00:00 " + jComboBox4.getSelectedItem().toString()+ "/" + jComboBox5.getSelectedItem().toString()+ "/" + jComboBox6.getSelectedItem().toString();
        Date fechaIni=new Date(fechaA);
        Date fechaFin=new Date(fechaB);
        for(int c=0;c<Reportesexistentes.size();c++){
            Reporte rport=Reportesexistentes.get(c);
            if(fechaIni.before(rport.getDate())&&fechaFin.after(rport.getDate())){
                if(rport.getTipo()==0 && jCheckBox1.isSelected()){
                    modelo.addRow(new Object[]{"Salida",rport.getIDproducto(),BuscaProducto(rport.getIDproducto()),hourdateFormat.format(rport.getDate()),"No valido","No valido",rport.getCantidad(),formatoTag(rport.getIdtag())});
                }else{
                    if(jCheckBox2.isSelected()&&rport.getTipo()==1)
                        modelo.addRow(new Object[]{"Entrada",rport.getIDproducto(),BuscaProducto(rport.getIDproducto()),hourdateFormat.format(rport.getDate()),Buscaproveedor(rport.getIDproveedor()),rport.getCosto(),rport.getCantidad(),formatoTag(rport.getIdtag())});
                }
            }
        }
        jTable1.setModel(modelo);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(90);  
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(4).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(5).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(6).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(50);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try { 
        if(jTable1.getRowCount()==0){
                JOptionPane.showMessageDialog(new JFrame(), "Tabla Vacia","Error",JOptionPane.ERROR_MESSAGE);
                return;
        }    
        String fechaA=jComboBox2.getSelectedItem().toString()+ "-" + jComboBox3.getSelectedItem().toString()+ "-" + jComboBox1.getSelectedItem().toString();
        String fechaB=jComboBox4.getSelectedItem().toString()+ "-" + jComboBox5.getSelectedItem().toString()+ "-" + jComboBox6.getSelectedItem().toString();
        List<JTable> tb = new ArrayList<JTable>();
        File f=new File("Reporte Crecet moon "+fechaA+" - "+fechaB+".xls");
        tb.add(jTable1); 
        exportExcel excelExporter = new exportExcel(tb, new File(f.getAbsolutePath())); // String con directorio
        if (excelExporter.export()) {
            JOptionPane.showMessageDialog(new JFrame(), "Tabla exportada","Operacion completada",JOptionPane.INFORMATION_MESSAGE);
        }
    }catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private DefaultTableModel modelo() {
        DefaultTableModel model=new DefaultTableModel();
        model.addColumn("Tipo de reporte");
        model.addColumn("Codigo");
        model.addColumn("Nombre de producto");
        model.addColumn("Fecha y hora");
        model.addColumn("Provgeedor");
        model.addColumn("costo");
        model.addColumn("Cantidad");
        model.addColumn("Etiquetas");
        return model;
    }

    private String BuscaProducto(String iDproducto) {
        for(int c=0;c<productos.size();c++){
            if(productos.get(c).getID().equals(iDproducto))
                return productos.get(c).getNombre();
        }
        return "NULL";
    }

    private String formatoTag(ArrayList<String> cadena) {
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

    private Object Buscaproveedor(String iDproveedor) {
        for(int c=0;c<proveedores.size();c++){
            if(proveedores.get(c).getID().equals(iDproveedor))
                return proveedores.get(c).getNombre();
        }
        return "NULL";
    }
}
