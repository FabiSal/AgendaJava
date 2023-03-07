
package com.mycompany.agendafabian;

import java.util.InputMismatchException;
import java.util.Scanner;


/*Esta es la agenda de fabian salinas // este comentario es para probar el control de versiones de githud, nada mas*/

/**
 *
 * @author matal
 */
public class NewMain {
//--------------------------------------------Definiciones staticas para poder usarlas en todos los metodos sin necesida de crear en cada metodo una propia---------------------------

    static Scanner entrada = new Scanner(System.in);
    static boolean salir = false;
    static int opcion;
    static String nombre;
    static int telefono;

    public static void main(String[] args) {
        Agenda agendaTelefonico = new Agenda(3);
        Contacto c;
//----------------------------------------------------Menu con opciones-----------------------------------------------------      
        while (!salir) {
            System.out.println("**-------------------------------**");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contacto");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Existe contacto");
            System.out.println("5. Eliminar contacto");
            System.out.println("6. Contactos disponibles");
            System.out.println("7. Salir");
            System.out.println("**-------------------------------**");
//----------------------------------------------------casos del Menu---------------------------------------------------------            
            try {
                System.out.println("Escribe una de las opciones correctas");
                opcion = entrada.nextInt();
                switch (opcion) {
                    case 1://---------------------------------------------------añadir contacto
                        System.out.println("Escribe un nombre");
                        nombre = entrada.next();
                        System.out.println("Escribe un telefono");
                        telefono = entrada.nextInt();
                        //auxiliar
                        c = new Contacto(nombre, telefono);
                        //---------------------------------
                        agendaTelefonico.AñadirContacto(c);
                        break;
                    case 2://---------------------------------------------------Listar contacto
                        agendaTelefonico.ListarContacto();
                        break;
                    case 3://---------------------------------------------------Buscar contacto
                        System.out.println("Escribe un nombre del contacto");
                        nombre = entrada.next();
                        agendaTelefonico.BuscarContacto(nombre);
                        break;
                    case 4://---------------------------------------------------Existe contacto
                        System.out.println("Escribe un nombre del contacto");
                        nombre = entrada.next();
                        //auxiliar 
                        /*aerhaerfb adfbafnbaerbaerhnbaerhnarehaRHAQrhgRHAwerhgWERHrh*/
                        c = new Contacto(nombre, telefono);                       
                        agendaTelefonico.ExisteContacto(c);                     
                        if (agendaTelefonico.EliminarContacto(nombre)) {
                            System.out.println("Existe contacto");
                        } else {
                            System.out.println("No existe el contacto");
                        }
                        break;
                    case 5://---------------------------------------------------Eliminar contacto
                        System.out.println("Escribe un nombre del contacto");
                        nombre = entrada.next();
                        c = new Contacto(nombre, 0);
                        agendaTelefonico.EliminarContacto(nombre);
                        break;
                    case 6://---------------------------------------------------Contactos disponibles
                        System.out.println("Hay "+ agendaTelefonico.HuecosLibre() + " Contactos libres ");
                        break;
                    case 7://---------------------------------------------------Salir
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo numero entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un numero");
                entrada.nextInt();
                
                System.out.println("esto es solo para probar , es nuevo , altera todo el code ");
            }
      
        }
          
    }

}
