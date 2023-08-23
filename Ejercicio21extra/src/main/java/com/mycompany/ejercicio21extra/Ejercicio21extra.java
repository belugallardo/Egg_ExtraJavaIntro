/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio21extra;

/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
igual al 7 de sus notas del curso.

 */
/**
 *
 * @author belugallardo
 */
import java.util.Scanner;

public class Ejercicio21extra {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] arrayNotas = new int[10][4];

        cargarNotas(arrayNotas, leer);
        int alumnosAprobados = calcularNotas(arrayNotas);
        System.out.println("La cantidad de alumnos aprobados es de " + alumnosAprobados);
        
    }

    public static void cargarNotas(int[][] arrayNotas, Scanner leer) {

        for (int i = 0; i < arrayNotas.length; i++) {
            for (int j = 0; j < arrayNotas[i].length; j++) {
                System.out.println("Ingrese la nota " + (j + 1) + " del alumno " + (i + 1));
                arrayNotas[i][j] = leer.nextInt();
            }

        }
    }

    public static int calcularNotas(int[][] arrayNotas) {
        int aprobados = 0;
        for (int i = 0; i < arrayNotas.length; i++) {
            double total;
            total = 0.0;

            for (int j = 0; j < arrayNotas[i].length; j++) {
                switch (j) {
                    case 0:
                        total += (int) (arrayNotas[i][j] * 0.1);
                        break;
                    case 1:
                        total += (int) (arrayNotas[i][j] * 0.15);
                        break;
                    case 2:
                        total += (int) (arrayNotas[i][j] * 0.25);
                        break;
                    default:
                        total += (int) (arrayNotas[i][j] * 0.5);
                        break;
                }

            }
            if (total >= 7.0) {
                aprobados++;
            }
        }
        return aprobados;
    }
}
