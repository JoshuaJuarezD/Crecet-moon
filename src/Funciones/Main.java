package Funciones;
import GUI.CrearNuevoProducto;
import GUI.ventanaPrincipal;


public class Main {
    static IO io=new IO();
    public static void main(String[] args) {       
        inicialisarDirectorio();
        ventanaPrincipal ventana=new ventanaPrincipal();
        ventana.iniciar();
    }

    public static void inicialisarDirectorio() {
       io.Creardirectrorio("C:/Cresent moon");
       io.Creardirectrorio("C:/Cresent moon/productos");
       io.Creardirectrorio("C:/Cresent moon/proovedor");
       io.Creardirectrorio("C:/Cresent moon/tag");
       io.CrearArchivo("C:/Cresent moon/productos/Principal.txt");
       io.CrearArchivo("C:/Cresent moon/proovedor/Principal.txt");
       io.CrearArchivo("C:/Cresent moon/tag/Principal.txt");
    }
    
    
}
