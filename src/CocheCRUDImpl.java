package impl.CRUD;

import impl.Coche;

import java.util.ArrayList;

public class CocheCRUDImpl implements CocheCRUD {

    ArrayList<Coche> listaCoches = new ArrayList<>();

    @Override
    public void añadir(Coche cocheNuevo) {
        listaCoches.add(cocheNuevo);
    }

    @Override
    public Coche leer(int ID) {
        return listaCoches.get(ID);
    }

    @Override
    public void borrar(int ID) {
        listaCoches.remove(ID);
    }

    @Override
    public boolean actualizar(int ID, String nombreNuevo) {
        if (listaCoches.get(ID) != null) {
            listaCoches.get(ID).setNombre(nombreNuevo);
            return true;
        }
        else return false;
    }
}
