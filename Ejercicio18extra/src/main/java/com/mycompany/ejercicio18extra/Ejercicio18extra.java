/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio18extra;
/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio18extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de elementos a sumar");
        int tamVector = leer.nextInt();
        
        int[]vector = new int[tamVector];
        
        sumar(vector, tamVector, leer);
        
        
        
    }
    
    public static void sumar(int[] vector, int tamVector, Scanner leer ){
    
        int total = 0;
        for (int i = 0; i<tamVector; i++){
        System.out.println("Ingrese el numero");
        int num = leer.nextInt();
        total = total + num;    
        }
        System.out.println("El total de la suma de esos digitos es de: " + total);
        
}
}
