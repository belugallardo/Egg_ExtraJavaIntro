/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio10extra;

/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio10extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int num3 = num1 * num2;
        System.out.println(num3);

        boolean adivinaste = false;

        do {
            System.out.println("Adivine el numero");
            int numAdivinado = leer.nextInt();
            if (num3 == numAdivinado) {
                System.out.println("Adivinaste");
                adivinaste = true;
            }else {
                System.out.println("Intente nuevamente");
            }  
        } while (!adivinaste);
    }
}

