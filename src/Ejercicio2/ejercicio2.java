/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese tu nombre");
        String nombre = leer.next();
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
