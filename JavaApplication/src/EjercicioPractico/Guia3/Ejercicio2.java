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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in).useDelimiter("\n");
        String contraseña = "";

        System.out.println("Ingrese su contraseña porfavor.");
        contraseña = teclado.nextLine();

        if (contraseña.equalsIgnoreCase("Eureka")) {
            System.out.println("La contraseña es CORRECTA!");
        } else {
            System.out.println("La contraseña es INCORRECTA!");
        }
    }
}
