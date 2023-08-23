/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio8extra;

/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio8extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        boolean flag;
        int leidos = 0;
        boolean par;
        int numeroPar = 0;
        boolean negativo;

        do {
            System.out.println("Ingrese un numero entero");
            int num = leer.nextInt();
            flag = esMultiplo(num);
            negativo = esNegativo(num);
            if (!negativo) {
                leidos++;
                par = esPar(num);
                if (par) {
                    numeroPar++;
                }
            }
        } while (!flag);

        int impar = leidos - numeroPar;

        System.out.println("Se ingresaron " + leidos + " numeros, de los cuales " + numeroPar + " son pares y " + impar + " son impares");
    }

    public static boolean esMultiplo(int num) {
        return num % 5 == 0;
    }

    public static boolean esPar(int num) {
        return num % 2 == 0;
    }
    
    public static boolean esNegativo(int num){
        return num < 0;
    }
}
