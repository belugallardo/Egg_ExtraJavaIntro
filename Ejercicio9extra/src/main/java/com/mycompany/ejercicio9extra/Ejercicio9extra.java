/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9extra;
/*
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio9extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        
        int cociente = 0;
        int residuo = num1;
        
        while (residuo >= num2){
            residuo = residuo - num2; 
            cociente++;
        }
        
        System.out.println(" La division entre " + num1 + " y " + num2 + " da como cociente " + cociente + " y un residuo de " + residuo );
        
    }
}
