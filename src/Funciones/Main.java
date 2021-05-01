package Funciones;
import GUI.CrearNuevoProducto;


public class Main {
    static IO io=new IO();
    public static void main(String[] args) {       
        inicialisarDirectorio();
        CrearNuevoProducto ventana= new CrearNuevoProducto();
        ventana.setVisible(true);
    }

    public static void inicialisarDirectorio() {
       io.Creardirectrorio("C:/Cresent moon");
       io.Creardirectrorio("C:/Cresent moon/productos");
       io.Creardirectrorio("C:/Cresent moon/proovedor");
       io.Creardirectrorio("C:/Cresent moon/tag");
       io.Creardirectrorio("C:/Cresent moon/reporte");
       io.CrearArchivo("C:/Cresent moon/productos/Principal.txt");
       io.CrearArchivo("C:/Cresent moon/proovedor/Principal.txt");
       io.CrearArchivo("C:/Cresent moon/tag/Principal.txt");
       io.CrearArchivo("C:/Cresent moon/reporte/Principal.txt");
    }
    
    
}
