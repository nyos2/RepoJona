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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        double f = 32, c = 0;

        System.out.println("Ingrese la cantidad de grados Centigrados para calcular.");
        c = teclado.nextInt();

        f += (9 * c / 5);

        System.out.println("El equivalente en grados Fahrenheit es: " + f);
    }
}
