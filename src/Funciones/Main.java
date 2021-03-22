package Funciones;
import Class.Producto;
import Class.Proovedor;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> lista=new ArrayList();
        ArrayList<Proovedor> proo=new ArrayList();
        ArrayList<String> poro=new ArrayList();
        ArrayList<Integer> aux=new ArrayList();
        ArrayList<String> poro2=new ArrayList();
        Proovedor prove=new Proovedor("3847FBN", "calvario");
        proo.add(prove);
        prove=new Proovedor("3sdfFBN", "mrs.huevo");
        proo.add(prove);
        poro.add("calvario");
        poro.add("mrs.huevo");
        IO io=new IO();
        Producto pro=new Producto("1234ID", "Nombre", "descripcion",poro,aux,poro2);
        io.Creardirectrorio("C:/Cresent moon");
        lista.add(pro);
        pro=new Producto("8548", "Nombre", "descripcion" ,poro,aux,poro2);
        lista.add(pro);
        io.escrituraProducto(lista);
        io.escrituraProovedor(proo);
    }
    
}
