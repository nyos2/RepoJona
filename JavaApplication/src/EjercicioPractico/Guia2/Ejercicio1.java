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
public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        int num1 = 0, num2 = 0, resultado = 0;

        System.out.println("Ingrese el primer numero para su suma.");
        num1 = teclado.nextInt();

        System.out.println("Ingrese el segundo numero para su suma.");
        num2 = teclado.nextInt();

        resultado = num1 + num2;

        System.out.println("El resultado de su suma es: " + resultado);
    }
}

    

