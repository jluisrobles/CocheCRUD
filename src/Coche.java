package impl;

/**
 * Clase coche basica con ID y nombre
 */
public class Coche {

    int ID = 0;
    String nombre = "";

    public Coche(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
