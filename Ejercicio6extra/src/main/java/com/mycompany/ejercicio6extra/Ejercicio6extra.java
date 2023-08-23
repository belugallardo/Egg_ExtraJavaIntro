/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio6extra;

/*
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio6extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas");
        int cantidad = leer.nextInt();
        int[] personas = new int[cantidad];

        int promedioBajo = 0;
        int cantidadBajo = 0;
        int promedio = 0;

        for (int i = 0; i < cantidad; i++) {
            
            System.out.println("Ingrese la altura de la persona " + (i + 1));
            personas[i] = leer.nextInt();
            if (personas[i] < 160) {
                promedioBajo = promedioBajo + personas[i];
                cantidadBajo++;
            }
            promedio = promedio + personas[i];
        }
        int resultadoPromedio = promedio / cantidad;
        int resultadoPromedioBajo = promedioBajo / cantidadBajo;

        System.out.println("El promedio de todas las personas es de " + resultadoPromedio + " centimetros y el primedio de las personas por debajo de 160cm es de " + resultadoPromedioBajo);

    }
}
