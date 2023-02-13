package impl.CRUD;

import impl.Coche;

/**
 * Operaciones CRUD de coches
 */
public interface CocheCRUD {

    Coche coche = null;

    /**
     * Metodo para añadir la BBDD
     * @param cocheNuevo coche para añadir
     */
    public void añadir(Coche cocheNuevo);

    /**
     * Metodo para leer un coche de la BBDD
     * @param ID Identificador del coche
     * @return Coche de la BBDD
     */
    public Coche leer(int ID);

    /**
     * Metodo para borrar la BBDD
     * @param ID Identificador del coche
     */
    public void borrar(int ID);

    /**
     * Metodo que modifica el coche con el ID recibido por parametros y le modifica su nombre
     * @param ID Identificador del coche
     * @param nombreNuevo Valor a modificar
     * @return True si se puede realizar el cambio sino false
     */
    public boolean actualizar(int ID, String nombreNuevo);

}
