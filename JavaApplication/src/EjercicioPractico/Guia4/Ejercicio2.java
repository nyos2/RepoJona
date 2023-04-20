/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPractico.Guia4;

import java.util.ArrayList;
import java.util.List;
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
        Scanner sc = new Scanner(System.in);
        List<String> datosPersonas = new ArrayList<>();
        boolean seguirMostrando = true;
        while (seguirMostrando) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la edad de la persona: ");
            int edad = sc.nextInt();
            sc.nextLine(); // para consumir el salto de línea después de la edad
            
            String datosPersona = "Nombre: " + nombre + ", Edad: " + edad;
            if (edad >= 18) {
                datosPersona += " (Mayor de edad)";
            } else {
                datosPersona += " (Menor de edad)";
            }
            datosPersonas.add(datosPersona);
            
            System.out.print("¿Quiere seguir mostrando personas? (Si/No): ");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                seguirMostrando = false;
            }
        }
        
        System.out.println("Datos de las personas ingresadas:");
        for (String datosPersona : datosPersonas) {
            System.out.println(datosPersona);
        }
        System.out.println("Fin del programa.");
        sc.close();
    }
}