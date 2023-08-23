/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio22extra;
/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
muestre la suma de sus elementos.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio22extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese la cantidad de filas del arreglo");
        int filas = leer.nextInt();
        
        System.out.println("Ingrese la cantidad de columnas");
        int columnas = leer.nextInt();
        
        int [][] arreglo = new int [filas][columnas];
        int suma = 0;
        for(int i = 0; i< filas; i++){
            for (int j = 0; j< columnas; j++){
                arreglo[i][j] = (int)(Math.random()*10);
                System.out.println(arreglo [i][j]);
                suma += arreglo[i][j];
            }
        }
        
        System.out.println("La suma total de todos los elementos es de" + suma);
    }
}
