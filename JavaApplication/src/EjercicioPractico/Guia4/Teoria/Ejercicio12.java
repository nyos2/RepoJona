/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioPractico.Guia4.Teoria;

/**
 *
 * @author nyos2
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 12;
        int b = 3;
        EsMultiplo(a, b);
    }
    public static void EsMultiplo(int num1, int num2) {
    if (num1 % num2 == 0) {
        System.out.println(num1 + " es múltiplo de " + num2);
    } else {
        System.out.println(num1 + " no es múltiplo de " + num2);
    }
}
    
}
