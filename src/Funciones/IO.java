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
                isLinea = br.readLine();
                ArrayList<String> idtag = new ArrayList();
                ArrayList<Double> costo = new ArrayList();
                ArrayList<String> idProveedor = new ArrayList();
                if (isLinea.equals("1")) {
                    String[] idprove = br.readLine().split(",");
                    idProveedor.addAll(Arrays.asList(idprove));
                }else
                    br.readLine();
                isLinea = br.readLine();
                if (isLinea.equals("1")) {
                    String[] cos = br.readLine().split(",");
                    for (int d = 0; d < cos.length; d++) {
                        costo.add(Double.parseDouble(cos[d]));
                    }
                }else
                    br.readLine();
                isLinea = br.readLine();
                if (isLinea.equals("1")) {
                    String[] tag = br.readLine().split(",");
                    idtag.addAll(Arrays.asList(tag));
                }
                Producto producto = new Producto(id, nombre, descripcion, idProveedor, costo, idtag);
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
                Proovedor proovedor = new Proovedor(nombreArchivo, nombre);
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
                Tag tag = new Tag(nombreArchivo, nombre);
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
}
