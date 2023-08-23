/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio13extra;
/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio13extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        String escalera = ""; 
        for (int i = 1; i <= num; i ++){
            String digito = String.valueOf(i);
            escalera = escalera.concat(digito + " ");
            System.out.println(escalera);
            
            
        }
        
        
    }
}
