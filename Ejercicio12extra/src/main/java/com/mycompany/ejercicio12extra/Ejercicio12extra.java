/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio12extra;
/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
*/
/**
 *
 * @author belugallardo
 */
//import java.util.Scanner;
public class Ejercicio12extra {

    public static void main(String[] args) {
       // Scanner leer = new Scanner(System.in);
        
       for(int i = 0; i < 10; i++ ){
            for(int j = 0; j < 10; j++){
                for (int k = 0; k < 10; k++){
                    String digito1 = (i == 3) ? "E" : String.valueOf(i);
                    String digito2 = (j == 3) ? "E" : String.valueOf(j);
                    String digito3 = (k == 3) ? "E" : String.valueOf(k);
                    System.out.println(digito1 + " - " + digito2 + " - " + digito3 );
                }
            }
        }
           
    }
}
