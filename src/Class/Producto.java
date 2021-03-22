package Class;

import java.util.ArrayList;

public class Producto {
    
    private String ID;
    private String Nombre;
    private String descripcion;
    private ArrayList <String> IDProovedor;
    private ArrayList <Integer> costo;
    private ArrayList <String> IDtag;

    public Producto(String ID, String Nombre, String descripcion, ArrayList<String> IDProovedor, ArrayList<Integer> costo, ArrayList<String> IDtag) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.descripcion = descripcion;
        this.IDProovedor = IDProovedor;
        this.costo = costo;
        this.IDtag = IDtag;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ArrayList<String> getIDProovedor() {
        return IDProovedor;
    }

    public void setIDProovedor(ArrayList<String> IDProovedor) {
        this.IDProovedor = IDProovedor;
    }

    public ArrayList<Integer> getCosto() {
        return costo;
    }

    public void setCosto(ArrayList<Integer> costo) {
        this.costo = costo;
    }

    public ArrayList<String> getIDtag() {
        return IDtag;
    }

    public void setIDtag(ArrayList<String> IDtag) {
        this.IDtag = IDtag;
    }
    
}

