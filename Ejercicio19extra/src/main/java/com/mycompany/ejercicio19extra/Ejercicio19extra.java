/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio19extra;
/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio19extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamVector = leer.nextInt();
        
        int[] vector1 = new int [tamVector];
        int[] vector2 = new int [tamVector];
        
        rellenarVector(vector1, tamVector);
        rellenarVector(vector2, tamVector);
        boolean igual = esIgual(vector1, vector2, tamVector);
        
        if (igual){
            System.out.println("Ambos vectores son iguales");
        } else {
            System.out.println("Ambos vectores no son iguales");
        }
    }
    
    public static void rellenarVector(int[] vector, int tamVector){
  
        for (int i = 0; i< tamVector; i++){
            vector[i]= (int)(Math.random()*10);
            System.out.print( vector[i] + " ");
        }
        System.out.println("");
        
    }
    
    public static boolean esIgual(int [] vector1, int [] vector2, int tamVector){
        
        for (int i = 0; i<tamVector; i++){
            if (vector1[i] != vector2[i]){
                return false;
            }
        }
        return true;
    }
}
