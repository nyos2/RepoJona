/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPractico.Guia4.Teoria;

import java.util.Scanner;


public class Ejercicio11 {

    
    
        public static String codificar(String cadena) {
        String resultado = "";
        for (char c : cadena.toCharArray()) {
            switch (c) {
                case 'a':
                    resultado += "@";
                    break;
                case 'e':
                    resultado += "#";
                    break;
                case 'i':
                    resultado += "$";
                    break;
                case 'o':
                    resultado += "%";
                    break;
                case 'u':
                    resultado += "*";
                    break;
                case 'A':
                    resultado += "@";
                    break;
                case 'E':
                    resultado += "#";
                    break;
                case 'I':
                    resultado += "$";
                    break;
                case 'O':
                    resultado += "%";
                    break;
                case 'U':
                    resultado += "*";
                    break;
                default:
                    resultado += c;
                    break;
            }
        }
        return resultado;
    }
    
    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una secuencia de caracteres: ");
        String entrada = sc.nextLine().toLowerCase();
        while (!entrada.endsWith(".")) {
            System.out.print("La secuencia debe terminar en punto. Ingrese nuevamente: ");
            entrada = sc.nextLine().toLowerCase();
        }
        String resultado = codificar(entrada.substring(0, entrada.length() - 1));
        System.out.println("El resultado de la codificación es: " + resultado + ".");
    }
}
