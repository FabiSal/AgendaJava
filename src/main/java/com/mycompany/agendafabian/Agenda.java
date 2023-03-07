package com.mycompany.agendafabian;

public class Agenda {
//-----------array de contactos-------------------------------

    private Contacto[] Contacto = new Contacto[10];
//----------------constructores-----------------------------

    public Agenda() {
        //
        this.Contacto = new Contacto[10];
    }
//-------------------------tamaño array--------------------    

    public Agenda(int tamaño) {
        this.Contacto = new Contacto[tamaño];
    }
//-------------------------funcion para añadir contactos-------------------------

    public boolean AñadirContacto(Contacto c) {
        if (this.ExisteContacto(c)) {
            System.out.println("El contacto con ese nombre ya existe");

        } else {

            boolean encontrado = false;
            //verificar si se encontro o no
            for (int i = 0; i < Contacto.length && !encontrado; i++) {
                if (Contacto[i] == null) {
                    Contacto[i] = c;
                    encontrado = true;
                }
            }
            if (encontrado) {
                System.out.println("Se ha añadido");
            } else {
                System.out.println("No se ha podido añadir");
            }
        }
        return true;
    }
//------------------------funcion para verificar si existe el contacto o no----------------------------

    public boolean ExisteContacto(Contacto c) {

        for (int i = 0; i < Contacto.length; i++) {
            //si es distinto de null y el contacto que me as paso es igual al contacto que estoy revisando-
            //sale de aqui -return true- y si nunca se mete ahi , significa que no existe return false.
            if (Contacto[i] != null && c.equals(Contacto[i])) {
                return true;
            }
        }
        return false;

    }
//-------------------------------funcion para listar por pantalla----------------------------------

    public void ListarContacto() {
        //enlazado con huevos libres para que si no hay , te diga de lista que no hay.
        if (HuecosLibre() == Contacto.length) {
            System.out.println("No hay contactos que mostrar");

        } else {
            //metodo equals de contacto
            for (int i = 0; i < Contacto.length; i++) {
                if (Contacto[i] != null) {
                    System.out.println(Contacto[i]);
                }
            }
        }
    }
//-------------------------------Funcion para buscar el contacto-------------------------------------------

     void BuscarContacto(String nombre) {
        //para decirle si lo ha encontrado o no
        boolean encontrado = false;
        for (int i = 0; i < Contacto.length; i++) {
            //tener cuidado con los null puede que de error/ buscar por nombre 
            //Contacto[i] != null && Contacto[i].getNombre().trim().equalsIgnoreCase(nombre.trim())
            if (this.Contacto[i].getNombre() != null && nombre.equals(this.Contacto[i].getNombre())) {
                System.out.println("Su telefono es " +this. Contacto[i].getTelefono());
                encontrado = true;
                break;
            }
        }
        //simpre es bueno decirle algo al usuario/esto esta bien o esto esta mal/
        if (!encontrado) {
            System.out.println("No se ha encontrado el contacto");
        }
    }
//---------------------------------------Elimina un contacto de la lista---------------------------------------------------

    public boolean EliminarContacto(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < Contacto.length && !encontrado; i++) {
            if (Contacto[i] != null && Contacto[i].equals(nombre)) {
                Contacto[i] = null;
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("Se ha eliminado el contacto");
        } else {
            System.out.println("No se ha eliminado el contacto");
        }
        return false;

    }
//-------------------------------funcion que indica cuantos contacto mas puedes meter------------------------------------------------
    //el ejercicio no lo requiere , pero queda bien en la agenda.

    public int HuecosLibre() {

        int contadorlibres = 0;
        for (int i = 0; i < Contacto.length; i++) {
            if (Contacto[i] == null) {
                contadorlibres++;

            }

        }
        return contadorlibres;
    }
}
