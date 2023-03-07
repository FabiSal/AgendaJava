package com.mycompany.agendafabian;

public class Contacto {

    //Definiciones privadas
    private String nombre;
    private int telefono;
//------------------------------------------Constructor--------------------------------------

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //constructor auxiliar
    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = 0;
    }
//----------------------------------------Getters and Setters---------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
//------------------------------------Si los nombres son iguales---------------------------------

    public boolean equals(Contacto c) {
        //por si acaso meten mayusculas o minusculas que no hagan la trampa de un nombre en mayusculas y otro minusculas
        //el metodo trim elimina espacios delante y detras , no en medio.
        if (this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())) {
            return true;
        }
        return false;
    }
//--------------------------generado el toString-------------------------------------

    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono;
    }

}
