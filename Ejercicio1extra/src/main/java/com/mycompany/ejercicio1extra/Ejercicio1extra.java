/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1extra;
/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio1extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("Ingrese una cantidad de minutos");
        int minutos = leer.nextInt();
        
        int dias= minutos/1440;
        int resto = minutos % 1440; 
        int horas = resto/60;
        resto = resto % 60;
        minutos = resto;
        
        System.out.println("Equivalente: " + dias + " dias " + horas + " horas " + minutos + " minutos ");
    }
    
    
}
