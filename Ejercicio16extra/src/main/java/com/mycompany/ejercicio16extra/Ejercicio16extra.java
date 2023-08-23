/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio16extra;
/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio16extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String seguir;
        do {
           System.out.println("Ingrese un nombre"); 
           String nombre = leer.nextLine();
           System.out.println("Ingrese la edad de " + nombre); 
           int edad = leer.nextInt();
           if (edad > 18){
               System.out.println(nombre + " es mayor de edad");
           } else {
               System.out.println(nombre + " es menor de edad");
           }
           leer.nextLine();
           System.out.println("¿Desea seguir?\n"
                   + "Si / No");
          seguir = leer.nextLine();
        } while (!seguir.equals("No"));
       
        
        
    }
}
