/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPractico.Guia5;

import java.util.Scanner;

/**
 *
 * @author nyos2
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    
      public static void main(String[] args) {
        int[][] cuadrado = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int sumaFila, sumaColumna, sumaDiagonal1, sumaDiagonal2;

        // Pedir al usuario que introduzca los números
        System.out.println("Introduce los números del 1 al 9 para el cuadrado mágico:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cuadrado[i][j] = sc.nextInt();
                // Comprobar que los números están entre 1 y 9
                if (cuadrado[i][j] < 1 || cuadrado[i][j] > 9) {
                    System.out.println("Error: los números deben estar entre 1 y 9.");
                    return;
                }
            }
        }

        // Calcular la suma de la primera fila y comprobar que todas las filas suman lo mismo
        sumaFila = cuadrado[0][0] + cuadrado[0][1] + cuadrado[0][2];
        for (int i = 1; i < 3; i++) {
            if (cuadrado[i][0] + cuadrado[i][1] + cuadrado[i][2] != sumaFila) {
                System.out.println("No es un cuadrado mágico.");
                return;
            }
        }

        // Calcular la suma de la primera columna y comprobar que todas las columnas suman lo mismo
        sumaColumna = cuadrado[0][0] + cuadrado[1][0] + cuadrado[2][0];
        for (int j = 1; j < 3; j++) {
            if (cuadrado[0][j] + cuadrado[1][j] + cuadrado[2][j] != sumaColumna) {
                System.out.println("No es un cuadrado mágico.");
                return;
            }
        }

        // Calcular la suma de la diagonal principal y comprobar que ambas diagonales suman lo mismo
        sumaDiagonal1 = cuadrado[0][0] + cuadrado[1][1] + cuadrado[2][2];
        sumaDiagonal2 = cuadrado[0][2] + cuadrado[1][1] + cuadrado[2][0];
        if (sumaDiagonal1 != sumaDiagonal2 || sumaDiagonal1 != sumaFila) {
            System.out.println("No es un cuadrado mágico.");
            return;
        }

        // Si ha llegado hasta aquí, es que el cuadrado es mágico
        System.out.println("Es un cuadrado mágico.");
    }
}
