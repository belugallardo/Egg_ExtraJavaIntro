/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio15extra;
/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
*/
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;
public class Ejercicio15extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        
        leer.nextLine();
        System.out.println(" ¿Qué operacion desea hacer?\n"
                + "S - SUMAR\n"
                + "R - RESTAR\n"
                + "M - MULTIPLICAR\n"
                + "D - DIVIDIR");
        
        String operacion = leer.nextLine();
        
        int resultado = 0;
        switch(operacion){
            case "S":
                resultado = sumar(num1,num2);
                break;
            case "R":
                resultado = restar(num1, num2);
                break;
            case "M":
                resultado = multiplicar(num1, num2);
                break;
            case "D":
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
            
        }
        
        System.out.println("El resultado es " + resultado);
    }
    
    public static int sumar(int num1, int num2){
        
        return num1 + num2;
    }
    
        public static int restar(int num1, int num2){

        return num1-num2;
    }
        public static int multiplicar(int num1, int num2){
        
        return num1 * num2;
    }
        
        public static int dividir(int num1, int num2){
        
        return num1 / num2;
    }
}
