package Class;

public class Tag {

    private String ID;
    private String Nombre;
    private boolean activo;

    public Tag(String ID, String Nombre, boolean activo) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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
