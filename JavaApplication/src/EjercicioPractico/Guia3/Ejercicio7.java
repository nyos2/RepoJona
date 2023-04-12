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
public class Ejercicio7 {

    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int correctas = 0, incorrectas = 0;
        String cadena;

        do {
            System.out.println("Ingrese el codigo - para finalizar ingrese [&&&&&]");
            cadena = teclado.nextLine();

            boolean b = cadena.length() <= 5 && cadena.startsWith("X") && cadena.endsWith("O");
            if (b) {
                correctas++;
            } else {
                incorrectas++;
            }
        } while (!"&&&&&".equals(cadena));

        System.out.println("Codigo CORRECTO:" + correctas
                + "\nCodigo INCORRECTO:" + (incorrectas - 1));
    }
}