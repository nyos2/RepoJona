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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();
        
        System.out.println("Elija una operación: ");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        
        int opcion = input.nextInt();
        double resultado = 0;
        
        switch(opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        
        System.out.println("El resultado es: " + resultado);
    }
    
    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }
    
    public static double restar(double num1, double num2) {
        return num1 - num2;
    }
    
    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public static double dividir(double num1, double num2) {
        return num1 / num2;
    }
}
    

