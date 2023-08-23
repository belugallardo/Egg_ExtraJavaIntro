/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio5extra;

/*
Una obra social tiene tres clases de socios:
    o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
    o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
    o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.

Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio5extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la letra correspondiente segun su clase de socio\n"
                + "A - Socios tipo A\n"
                + "B - Socios tipo B\n"
                + "C - Socios tipo C ");

        String socio = leer.nextLine();

        System.out.println("Ingrese el valor real del tratamiento");
        int valor = leer.nextInt();
        //Chequear que ingreso letra correcta

        if (socio.equalsIgnoreCase("A") || socio.equalsIgnoreCase("B") || socio.equalsIgnoreCase("C")) {

            double valorAPagar = calculo(socio, valor);
            System.out.println("El importe a pagar por el socio es de $" + valorAPagar);
        } else {
            System.out.println("No ingreso una letra valida");
        }

    }

    public static int calculo(String socio, int valor) {
        double pagar;
        if (socio.equalsIgnoreCase("A")) {
            pagar = valor * 0.50;
        } else if (socio.equalsIgnoreCase("B")) {
            pagar = valor * 0.65;
        } else {
            pagar = valor;
        }

        return (int) pagar;
    }
}
