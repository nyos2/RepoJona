/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPractico.Guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nyos2
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    
       public static void main(String[] args) {
        int n = 3; // La matriz siempre será de tamaño 3x3
        int[][] matriz = new int[n][n];
        Random rand = new Random();
        System.out.println("La matriz generada es:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(101) - 50; // Genera valores entre -50 y 50
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        if (esAntisimetrica(matriz)) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz NO es antisimétrica");
        }
    }
    
    public static boolean esAntisimetrica(int[][] matriz) {
        int n = matriz.length;
        // Comprobamos si A = -AT
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
