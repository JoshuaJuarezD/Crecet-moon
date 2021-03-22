package Class;
public class Proovedor {
    private String ID;
    private String Nombre;

    public Proovedor(String ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
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
    
    
}
