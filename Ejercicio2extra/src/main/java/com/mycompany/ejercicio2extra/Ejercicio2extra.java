/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2extra;
/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio2extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese el valor del numero 1");
        int valorA = leer.nextInt();
        System.out.println("Ingrese el valor del numero 2");
        int valorB = leer.nextInt();
        System.out.println("Ingrese el valor del numero 3");
        int valorC = leer.nextInt();
        System.out.println("Ingrese el valor del numero 4");
        int valorD = leer.nextInt();
        int aux;
        
        aux= valorA;
        valorA= valorB;
        valorB= valorC;
        valorC= valorD;
        valorD = aux;
        
        System.out.println("Variable A: " + valorA + " Variable B: " + valorB + " Variable C: " + valorC + " Variable D: " + valorD);
    }
}
