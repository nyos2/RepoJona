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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num = 0, limite = 0, suma = 0;

        System.out.println("Ingrese un numero limite.");
        limite = teclado.nextInt();

        do {
            System.out.println("Ingrese un número");
            num = teclado.nextInt();
            suma += num;
        } while (suma < limite);

        System.out.println("Limite alcanzado!.");
    }
}