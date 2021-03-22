package Funciones;

import Class.Producto;
import Class.Proovedor;
import Class.Tag;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
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

    public void escrituraProducto(ArrayList<Producto> lista) {
        Creardirectrorio("C:/Cresent moon/productos");
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
                pw.println(lista.get(c).getNombre());
                pw.println(lista.get(c).getDescripcion());
                pw.println(lista.get(c).getIDProovedor().toString());
                pw.println(lista.get(c).getCosto().toString());
                pw.println(lista.get(c).getIDtag().toString());
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
        Creardirectrorio("C:/Cresent moon/proovedor");
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
        Creardirectrorio("C:/Cresent moon/tag");
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
                fichero = new FileWriter("C:/Cresent moon/tag/" + lista.get(c).getID() + ".txt");
                pw = new PrintWriter(fichero);
                pw.println(lista.get(c).getNombre());
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
        ArrayList <Producto> lista;
        File archivoPrincipal = null;
        FileReader frPrincipal = null;
        BufferedReader brPrincipal = null;
        try {
            archivoPrincipal = new File("C:/Cresent moon/productos/Principal.txt");
            frPrincipal = new FileReader(archivoPrincipal);
            brPrincipal = new BufferedReader(frPrincipal);
            int num=Integer.parseInt(brPrincipal.readLine());
            for(int c=0;c<num;c++){
                String nombreArchivo=brPrincipal.readLine();
                File archivo= new File("C:/Cresent moon/productos/"+nombreArchivo);
                FileReader fr=new FileReader(archivo);
                BufferedReader br = new BufferedReader(fr);
                String id= br.readLine();
                String nombre=br.readLine();
                String descripcion = br.readLine();
                String[] idprove = br.readLine().split(", ");
                ArrayList <String> idProveedor = null;
                idProveedor.addAll(Arrays.asList(idprove));
                String[] cos = br.readLine().split(", ");
                ArrayList <Integer> costo = null;
                for(int d=0 ; d<cos.length ; d++ )
                    costo.add(Integer.parseInt(cos[c]));
                String[] tag = br.readLine().split(", ");
                ArrayList <String> idtag = null;
                idtag.addAll(Arrays.asList(tag));
                Producto producto=new Producto(id, nombre, descripcion, idProveedor, costo, idtag);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        return null;
    }
}
