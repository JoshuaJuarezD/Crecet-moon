package Class;

import java.util.ArrayList;

public class Producto {
    
    private String ID;
    private String Nombre;
    private String descripcion;
    private Integer cantidadBodega=0;
    private ArrayList <String> IDtag;
    private boolean activo=true;

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Producto(String ID, String Nombre, String descripcion, ArrayList<String> IDtag, Integer cantidad, boolean acitvo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.descripcion = descripcion;
        this.IDtag = IDtag;
        this.cantidadBodega=cantidad;
        this.activo=acitvo;
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

    public Integer getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(Integer cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public ArrayList<String> getIDtag() {
        return IDtag;
    }

    public void setIDtag(ArrayList<String> IDtag) {
        this.IDtag = IDtag;
    }


    @Override
    public String toString() {
        return ID + "\n" + Nombre + "\n" + descripcion +"\n" +cantidadBodega + "\n" +activo + "\n" + formatString(IDtag);
    }
    
    public String formatString(ArrayList<String> cadena){
        String retorno = new String();
        if(cadena.size()>0)
            retorno=retorno+"1\n";
        else
            retorno=retorno+"0\n";
        for(int c=0;c<cadena.size();c++){
            retorno=retorno+cadena.get(c);
            if(c!=cadena.size()-1)
                retorno=retorno+",";
        }
        return retorno;
    }
    
}

