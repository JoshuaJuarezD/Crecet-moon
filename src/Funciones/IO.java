package Funciones;

import Class.Producto;
import Class.Proovedor;
import Class.Reporte;
import Class.Tag;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IO {

    public void Creardirectrorio(String ruta) {
        File directorios = new File(ruta);
        if (!directorios.exists()) {
            if (directorios.mkdirs()) {
                System.out.println("Multiples directorios fueron creados");
            } else {
                System.out.println("Error al crear directorios");
            }
        }
    }

    public void CrearArchivo(String ruta) {
        File archivo = new File(ruta);
        FileWriter fw = null;
        PrintWriter pw = null;
        if (!archivo.exists())
            try {
            archivo.createNewFile();
            fw = new FileWriter(archivo);
            pw = new PrintWriter(fw);
            pw.print("0");
            pw.close();
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void escrituraProducto(ArrayList<Producto> lista) {

        FileWriter ficheroPrincipal = null;
        PrintWriter pwPrincial = null;
        try {
            ficheroPrincipal = new FileWriter("C:/Cresent moon/productos/Principal.txt");
            pwPrincial = new PrintWriter(ficheroPrincipal);
            pwPrincial.println(lista.size());
            FileWriter fichero = null;
            PrintWriter pw = null;
            for (int c = 0; c < lista.size(); c++) {
                pwPrincial.println(lista.get(c).getID());
                fichero = new FileWriter("C:/Cresent moon/productos/" + lista.get(c).getID() + ".txt");
                pw = new PrintWriter(fichero);
                pw.println(lista.get(c).toString());
                if (null != fichero) {
                    fichero.close();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (null != ficheroPrincipal) {
                    ficheroPrincipal.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void escrituraProovedor(ArrayList<Proovedor> lista) {

        FileWriter ficheroPrincipal = null;
        PrintWriter pwPrincial = null;
        try {
            ficheroPrincipal = new FileWriter("C:/Cresent moon/proovedor/Principal.txt");
            pwPrincial = new PrintWriter(ficheroPrincipal);
            pwPrincial.println(lista.size());
            FileWriter fichero = null;
            PrintWriter pw = null;
            for (int c = 0; c < lista.size(); c++) {
                pwPrincial.println(lista.get(c).getID());
                fichero = new FileWriter("C:/Cresent moon/proovedor/" + lista.get(c).getID() + ".txt");
                pw = new PrintWriter(fichero);
                pw.println(lista.get(c).getNombre());
                pw.println(lista.get(c).isActive());
                if (null != fichero) {
                    fichero.close();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (null != ficheroPrincipal) {
                    ficheroPrincipal.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void escrituraTags(ArrayList<Tag> lista) {

        FileWriter ficheroPrincipal = null;
        PrintWriter pwPrincial = null;
        try {
            ficheroPrincipal = new FileWriter("C:/Cresent moon/tag/Principal.txt");
            pwPrincial = new PrintWriter(ficheroPrincipal);
            pwPrincial.println(lista.size());
            FileWriter fichero = null;
            PrintWriter pw = null;
            for (int c = 0; c < lista.size(); c++) {
                pwPrincial.println(lista.get(c).getID());
                fichero = new FileWriter("C:/Cresent moon/tag/" + lista.get(c).getID() + ".txt");
                pw = new PrintWriter(fichero);
                pw.println(lista.get(c).getNombre());
                pw.println(lista.get(c).isActivo());
                if (null != fichero) {
                    fichero.close();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (null != ficheroPrincipal) {
                    ficheroPrincipal.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void escrituraReporte(ArrayList<Reporte> lista) {
        FileWriter ficheroPrincipal = null;
        PrintWriter pwPrincial = null;
        try {
            ficheroPrincipal = new FileWriter("C:/Cresent moon/reporte/Principal.txt");
            pwPrincial = new PrintWriter(ficheroPrincipal);
            pwPrincial.println(lista.size());
            FileWriter fichero = null;
            PrintWriter pw = null;
            for (int c = 0; c < lista.size(); c++) {
                pwPrincial.println(lista.get(c).getID());
                fichero = new FileWriter("C:/Cresent moon/reporte/" + lista.get(c).getID() + ".txt");
                pw = new PrintWriter(fichero);
                pw.println(lista.get(c).toString());
                if (null != fichero) {
                    fichero.close();
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (null != ficheroPrincipal) {
                    ficheroPrincipal.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public ArrayList<Producto> lecturaProducto() {
        ArrayList<Producto> lista = new ArrayList();
        File archivoPrincipal = null;
        FileReader frPrincipal = null;
        BufferedReader brPrincipal = null;
        try {
            archivoPrincipal = new File("C:/Cresent moon/productos/Principal.txt");
            frPrincipal = new FileReader(archivoPrincipal);
            brPrincipal = new BufferedReader(frPrincipal);
            int num = Integer.parseInt(brPrincipal.readLine());
            String isLinea = new String();
            for (int c = 0; c < num; c++) {
                String nombreArchivo = brPrincipal.readLine();
                File archivo = new File("C:/Cresent moon/productos/" + nombreArchivo + ".txt");
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String id = br.readLine();
                String nombre = br.readLine();
                String descripcion = br.readLine();
                Integer cantidadBodega = Integer.parseInt(br.readLine());
                String Activacion = br.readLine();
                boolean activado = false;
                if (Activacion.equals("true")) {
                    activado = true;
                }
                isLinea = br.readLine();
                ArrayList<String> idtag = new ArrayList();
                if (isLinea.equals("1")) {
                    String[] tag = br.readLine().split(",");
                    idtag.addAll(Arrays.asList(tag));
                }
                Producto producto = new Producto(id, nombre, descripcion, idtag, cantidadBodega, activado);
                producto.setCantidadBodega(cantidadBodega);
                lista.add(producto);
            }
            return lista;
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (null != frPrincipal) {
                    frPrincipal.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<Proovedor> lecturaProovedor() {
        ArrayList<Proovedor> lista = new ArrayList();
        File archivoPrincipal = null;
        FileReader frPrincipal = null;
        BufferedReader brPrincipal = null;
        try {
            archivoPrincipal = new File("C:/Cresent moon/proovedor/Principal.txt");
            frPrincipal = new FileReader(archivoPrincipal);
            brPrincipal = new BufferedReader(frPrincipal);
            int num = Integer.parseInt(brPrincipal.readLine());
            for (int c = 0; c < num; c++) {
                String nombreArchivo = brPrincipal.readLine();
                File archivo = new File("C:/Cresent moon/proovedor/" + nombreArchivo + ".txt");
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String nombre = br.readLine();
                String act = br.readLine();
                boolean activo = false;
                if (act.equals("true")) {
                    activo = true;
                }
                Proovedor proovedor = new Proovedor(nombreArchivo, nombre, activo);
                lista.add(proovedor);
            }
            return lista;
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (null != frPrincipal) {
                    frPrincipal.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    public ArrayList<Tag> lecturaTags() {
        ArrayList<Tag> lista = new ArrayList();
        File archivoPrincipal = null;
        FileReader frPrincipal = null;
        BufferedReader brPrincipal = null;
        try {
            archivoPrincipal = new File("C:/Cresent moon/tag/Principal.txt");
            frPrincipal = new FileReader(archivoPrincipal);
            brPrincipal = new BufferedReader(frPrincipal);
            int num = Integer.parseInt(brPrincipal.readLine());
            for (int c = 0; c < num; c++) {
                String nombreArchivo = brPrincipal.readLine();
                File archivo = new File("C:/Cresent moon/tag/" + nombreArchivo + ".txt");
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String nombre = br.readLine();
                boolean activo = false;
                String act = br.readLine();
                if (act.equals("true")) {
                    activo = true;
                }
                Tag tag = new Tag(nombreArchivo, nombre, activo);
                lista.add(tag);
            }
            return lista;
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (null != frPrincipal) {
                    frPrincipal.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }
    
    public ArrayList<Reporte> lecturaReporte(){
        ArrayList<Reporte> lista = new ArrayList();
        File archivoPrincipal = null;
        FileReader frPrincipal = null;
        BufferedReader brPrincipal = null;
        try {
            archivoPrincipal = new File("C:/Cresent moon/reporte/Principal.txt");
            frPrincipal = new FileReader(archivoPrincipal);
            brPrincipal = new BufferedReader(frPrincipal);
            int num = Integer.parseInt(brPrincipal.readLine());
            for (int c = 0; c < num; c++) {
                String nombreArchivo = brPrincipal.readLine();
                File archivo = new File("C:/Cresent moon/reporte/" + nombreArchivo + ".txt");
                FileReader fr = new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String id=br.readLine();
                int tipo=Integer.parseInt(br.readLine());
                String fecha=br.readLine();
                String isLinea = br.readLine();
                ArrayList<String> idtag = new ArrayList();
                if (isLinea.equals("1")) {
                    String[] tag = br.readLine().split(",");
                    idtag.addAll(Arrays.asList(tag));
                }
                String IDproducro = br.readLine();
                String IDproveedor=br.readLine();
                int cantidad =Integer.parseInt(br.readLine());
                double costo =Double.parseDouble(br.readLine());
                Date date=new Date(fecha);     
                Reporte reporte=new Reporte(id, tipo, date, IDproducro, IDproveedor, idtag, cantidad, costo);
                lista.add(reporte);
            }
            return lista;
            
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (null != frPrincipal) {
                    frPrincipal.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
        
    }
}
