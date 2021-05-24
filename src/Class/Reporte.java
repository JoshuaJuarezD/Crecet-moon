package Class;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Reporte {
    
    DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
    
    private String ID;
    private int Tipo;
    private Date date;
    private String IDproducto;
    private String IDproveedor;
    private ArrayList<String> idtag;
    private double costo;
    private int cantidad;

    public Reporte(String ID, int Tipo, Date date, String IDproducto, String IDproveedor, ArrayList<String> idtag, int cantidad, double costo) {
        this.ID = ID;
        this.Tipo = Tipo;
        this.date = date;
        this.IDproducto = IDproducto;
        this.IDproveedor = IDproveedor;
        this.idtag = idtag;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getTipo() {
        return Tipo;
    }

    public void setTipo(int Tipo) {
        this.Tipo = Tipo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIDproducto() {
        return IDproducto;
    }

    public void setIDproducto(String IDproducto) {
        this.IDproducto = IDproducto;
    }

    public String getIDproveedor() {
        return IDproveedor;
    }

    public void setIDproveedor(String IDproveedor) {
        this.IDproveedor = IDproveedor;
    }

    public ArrayList<String> getIdtag() {
        return idtag;
    }

    public void setIdtag(ArrayList<String> idtag) {
        this.idtag = idtag;
    }

    @Override
    public String toString() {
        return ID + "\n" + Tipo + "\n" + date + "\n"+ formatString(idtag)  +"\n" +  IDproducto + "\n" + IDproveedor+"\n"+cantidad+"\n"+costo;
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
