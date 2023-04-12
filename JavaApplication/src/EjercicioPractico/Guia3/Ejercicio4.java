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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String palabra = "";

        System.out.println("Escriba una palabra");
        palabra = teclado.nextLine();

        palabra.equalsIgnoreCase(palabra);
        if (palabra.substring(0, 1).equalsIgnoreCase("a")) {
            System.out.println("CORRECTO!");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
