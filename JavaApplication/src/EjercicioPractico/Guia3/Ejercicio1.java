/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPractico.Guia3;

import java.util.Scanner;

/**
 *
 * @author nyos2
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num = 0;

        System.out.println("Ingrese un numero.");
        num = teclado.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero ingresado es PAR.");
        } else {
            System.out.println("El numero ingresado es IMPAR.");
        }
    }
}
