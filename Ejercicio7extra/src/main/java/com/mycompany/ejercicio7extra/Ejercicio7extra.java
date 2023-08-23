/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio7extra;
/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
de n números (n>0). El valor de n se solicitará al principio del programa y los números
serán introducidos por el usuario. Realice dos versiones del programa, una usando el
bucle “while” y otra con el bucle “do - while”.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio7extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que va a ingresar");
        int num = leer.nextInt();
        
        int[] vector = new int [num];
        int max = 0;
        int min = Integer.MAX_VALUE;
        int promedio = 0;


        for (int i =0; i<num; i++){
            System.out.println("Ingrese un numero mayor a 0");
            vector[i]= leer.nextInt();
            while (vector[i]>max){
                max= vector[i];
            }
            while (vector[i]< min){
                min= vector[i];
            }
            promedio = promedio + vector[i];
        }
        
        int promedioFinal = promedio/num;
        System.out.println("El numero maximo es: " + max + " el numero minimo es " + min + " y el promedio de todos los numeros es: " + promedioFinal);
    }
}
