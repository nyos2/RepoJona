/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPractico.Guia2;

import java.util.Scanner;

/**
 *
 * @author nyos2
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num = 0;

        System.out.println("Escribe un numero.");
        num = teclado.nextInt();

        System.out.println("El doble del numero ingresado es: " + num * 2);
        System.out.println("El triple del numero ingresado es: " + num * 3);
        System.out.println("La raiz cuadrada del numero ingresado es: " + Math.sqrt(num));
    }
}
