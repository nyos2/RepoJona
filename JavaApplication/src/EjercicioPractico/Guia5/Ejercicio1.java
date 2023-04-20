/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPractico.Guia5;

/**
 *
 * @author nyos2
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
    
    // Llenar el vector con los primeros 100 números enteros
    for (int i = 0; i < vector.length; i++) {
      vector[i] = i + 1;
    }
    
    // Mostrar el vector en orden descendente
    for (int i = vector.length - 1; i >= 0; i--) {
      System.out.println(vector[i]);
    }
  }
    }
    

