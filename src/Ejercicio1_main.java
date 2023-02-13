package impl;

import impl.CRUD.CocheCRUD;
import impl.CRUD.CocheCRUDImpl;

public class Ejercicio1_main {

    /**
     * Clase main
     * @param args
     */
    public static void main(String[] args) {
        System.out.printf("" +
                "<>---------<> TEMA 5 <>---------<>\n" +
                "+-------------------------------+\n" +
                "|          Ejercicio 1          |\n"+
                "+-------------------------------+\n");

        CocheCRUD cocheCrud = new CocheCRUDImpl();
        //C Create
        System.out.println("Añadimos algun coche");
        cocheCrud.añadir(new Coche(0, "Audi R8"));
        cocheCrud.añadir(new Coche(1, "Lamborgini Diablo"));
        //R Read
        System.out.println("Leemos un coche");
        System.out.println(cocheCrud.leer(0).toString());
        System.out.println(cocheCrud.leer(1).toString());
        //D Delete
        System.out.println("Borrar un coche");
        cocheCrud.borrar(1);

        //Para evitar que se salga de rango buscando
        try {
            System.out.println(cocheCrud.leer(1).toString());
        }catch (Exception e) {
            System.out.println("El coche no esta en la BBDD");
        }

        //U Update
        System.out.println("Modificar un coche");
        System.out.println("SIN MODIFICAR: "+cocheCrud.leer(0).toString());
        if (cocheCrud.actualizar(0, "Ferrari"))
            System.out.println("MODIFICADO: "+cocheCrud.leer(0).toString());
        else
            System.out.println("No se ha podido modificar: ");


    }
}
