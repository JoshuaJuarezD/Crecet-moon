
import Funciones.IO;
import GUI.PaginaPrincipal;


public class Main {

    public static void main(String[] args) {
        try{
           IO io=new IO();
           io.Creardirectrorio("C:/Cresent moon/productos");
           io.Creardirectrorio("C:/Cresent moon/proovedor");
           io.Creardirectrorio("C:/Cresent moon/tag");
           io.Creardirectrorio("C:/Cresent moon/reporte");
           io.CrearArchivo("C:/Cresent moon/productos/Principal.txt");
           io.CrearArchivo("C:/Cresent moon/proovedor/Principal.txt");
           io.CrearArchivo("C:/Cresent moon/tag/Principal.txt");
           io.CrearArchivo("C:/Cresent moon/reporte/Principal.txt");
           PaginaPrincipal ventana= new PaginaPrincipal();
           ventana.setVisible(true);
        }catch(Exception e){
            
        }
    }
    
}
