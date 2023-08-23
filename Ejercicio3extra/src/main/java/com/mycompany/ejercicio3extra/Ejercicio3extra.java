/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3extra;
/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio3extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = leer.nextLine();
        
        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")|| letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o") ||letra.equalsIgnoreCase("u") ){
           System.out.println("Ingreso una vocal"); 
            
        }else {
            System.out.println("La letra que ingreso no es una vocal");
        }
            
    }
}
