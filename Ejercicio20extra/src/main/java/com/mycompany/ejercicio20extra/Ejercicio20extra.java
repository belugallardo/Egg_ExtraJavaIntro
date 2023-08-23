/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio20extra;
/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
*/
/**
 *
 * @author belugallardo
 */
public class Ejercicio20extra {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        int tamVector = 7; 
        int[] vector = new int [tamVector];
        rellenarVector(vector);
        imprimirVector(vector);
    }
    public static void rellenarVector(int [] vector){
        
        for(int i = 0; i< vector.length; i++){
            vector[i] = (int) (Math.random()*100); 
        }
    }
    
    public static void imprimirVector(int [] vector){
        for (int i = 0; i < vector.length; i++){
            System.out.println(" El elemento del vector " + i + " es " + vector[i]);
        }
    }
}
