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
public class Ejercicio3 {

    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String frase = "";

        System.out.println("Escriba una frase.");
        frase = teclado.nextLine();

        if (frase.length() != 8) {
            System.out.println("INCORRECTO!");
        } else {
            System.out.println("CORRECTO!");
        }
    }
}
