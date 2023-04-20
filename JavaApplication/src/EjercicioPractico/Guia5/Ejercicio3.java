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
public class Ejercicio3 {

        
        public static void main(String[] args) {
        
        int[] numeros = { 5, 13, 456, 7890, 23, 67, 2, 1 };
        
        // Vector para almacenar la cantidad de números por cantidad de dígitos
        int[] digitos = new int[6]; 
        
        for (int i = 0; i < numeros.length; i++) {
            int cantidadDigitos = contarDigitos(numeros[i]);
            digitos[cantidadDigitos]++;
        }
        
        // Mostrar resultados
        for (int i = 1; i <= 5; i++) {
            System.out.printf("%d dígitos: %d%n", i, digitos[i]);
        }

    }

    /**
     * Método para contar la cantidad de dígitos de un número entero.
     */
    public static int contarDigitos(int numero) {
        if (numero < 0) {
            numero *= -1;
        }
        if (numero < 10) {
            return 1;
        } else if (numero < 100) {
            return 2;
        } else if (numero < 1000) {
            return 3;
        } else if (numero < 10000) {
            return 4;
        } else {
            return 5;
        }
    }
}
    
    

