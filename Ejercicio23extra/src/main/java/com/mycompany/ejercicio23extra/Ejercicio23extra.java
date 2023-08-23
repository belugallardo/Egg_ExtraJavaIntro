/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio23extra;
/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio23extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int [][] array = new int [20][20];
        String [] palabras = new String [5];
        
        cargarPalabras(palabras, leer);
        cargarSopaDeLetra(array, palabras);

    }
    public static void cargarPalabras(String [] palabras, Scanner leer){
        
        for (int i = 0; i< palabras.length; i++){
            System.out.println("Ingrese una palabra de entre 3 y 5 letras");
            palabras[i] = leer.nextLine();
               
        }
    }
    
    public static void cargarSopaDeLetra(int [][] array, String [] palabras){
        int [] filaCompletar = new int [5];
    }
}
