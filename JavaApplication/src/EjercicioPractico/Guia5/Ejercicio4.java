/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPractico.Guia5;

import java.util.Random;


public class Ejercicio4 {

    
    public static void main(String[] args) {

    // Crea la matriz de 4x4
    int[][] matriz = new int[4][4];

    // Rellena la matriz con valores aleatorios entre 1 y 10
    Random rand = new Random();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        matriz[i][j] = rand.nextInt(10) + 1;
      }
    }

    // Imprime la matriz original
    System.out.println("Matriz original:");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(matriz[i][j] + "\t");
      }
      System.out.println();
    }

    // Crea la matriz traspuesta
    int[][] traspuesta = new int[4][4];
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        traspuesta[i][j] = matriz[j][i];
      }
    }

    // Imprime la matriz traspuesta
    System.out.println("\nMatriz traspuesta:");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(traspuesta[i][j] + "\t");
      }
      System.out.println();
    }

  }

}
