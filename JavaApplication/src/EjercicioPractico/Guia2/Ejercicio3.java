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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String frase = "";

        System.out.println("Escriba una frase.");
        frase = teclado.nextLine();

        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    }
}

