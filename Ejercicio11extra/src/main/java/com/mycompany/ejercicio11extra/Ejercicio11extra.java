/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11extra;
/*
Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
*/
/**
 *
 * @author belugallardo
 */

import java.util.Scanner;
public class Ejercicio11extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        int cantidadDigitos = 0;
        do{
            num = num/10;
            cantidadDigitos++;
        } while(num>0); 
        
        System.out.println("El numero tiene " + cantidadDigitos + " cifras");
    }
}
