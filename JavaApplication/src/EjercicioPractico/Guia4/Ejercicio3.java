/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPractico.Guia4;

import java.util.Scanner;

/**
 *
 * @author nyos2
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedimos la cantidad de euros a convertir
        System.out.print("Introduce la cantidad de euros a convertir: ");
        double euros = sc.nextDouble();
        
        // Pedimos la moneda de destino
        System.out.print("Introduce la moneda a la que quieres convertir (libras, dolares o yenes): ");
        String monedaDestino = sc.next().toLowerCase();  // convertimos a minúsculas para evitar errores de mayúsculas
        
        // Convertimos los euros a la moneda de destino
        double cambio = 0.0;
        switch (monedaDestino) {
            case "libras":
                cambio = 0.86;
                break;
            case "dolares":
                cambio = 1.28611;
                break;
            case "yenes":
                cambio = 129.852;
                break;
            default:
                System.out.println("Moneda no soportada.");
                return;  // salimos del programa si la moneda no es soportada
        }
        double cantidadDestino = euros * cambio;
        
        // Mostramos el resultado
        System.out.printf("%.2f € son %.2f %s", euros, cantidadDestino, monedaDestino.toUpperCase());
    }

}