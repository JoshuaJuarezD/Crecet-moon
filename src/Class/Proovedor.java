package Class;
public class Proovedor {
    private String ID;
    private String Nombre;
    private boolean active;
    public Proovedor(String ID, String Nombre, boolean active) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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
