package Funciones;
import Class.Producto;
import Class.Proovedor;
import Class.Tag;
import GUI.agregarProducto;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        IO io=new IO();
        ArrayList <Tag> tags=new ArrayList();
        Tag aux=new Tag("fhj12", "computo");
        tags.add(aux);
        aux=new Tag("fhj122", "2computo");
        tags.add(aux);
        aux=new Tag("fh12j12", "4computo");
        tags.add(aux);
        io.escrituraTags(tags);
        tags=io.lecturaTags();
        agregarProducto ventan=new agregarProducto();
  
        ArrayList<Proovedor> proovedores=io.lecturaProovedor();
        ventan.iniciar();
        //ArrayList <Tag> liisss= venatan1.iniciar();
    }
    
}
