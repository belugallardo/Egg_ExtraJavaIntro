/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio14extra;

/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio14extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el numero de familias");
        int familias = leer.nextInt();
        int totalEdades = 0;
        
        int totalHijos = 0;
        for (int i = 1; i <= familias; i++) {
            
            System.out.println("Cuantos hijos tiene la familia " + i);
            int numHijos = leer.nextInt();
            
            
            
            for (int j = 1; j <= numHijos; j++) {
                System.out.println("Cual es la edad del hijo " + j + " de la familia " + i);
                int edadHijo = leer.nextInt();
                totalEdades = edadHijo + totalEdades;
                totalHijos++;
            }
            
        }
            double promedio = (double)totalEdades/totalHijos;
            System.out.println("Los hijos de la familias tienen un promedio de edad de " + promedio);
        
    }
    
}
