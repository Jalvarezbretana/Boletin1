/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_4;

import java.util.*;

/**
 *
 * @author jalvarezbretana
 */
public class boletin1_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //teclado.useLocale(Locale.US); ----- Para punto en vez de coma
        System.out.println("Introduce los dos números que se van a sumar, restar, hacer producto y cociente:");
        float a = teclado.nextFloat();
        float b = teclado.nextFloat();
        float suma = a + b;
        float resta = a - b;
        float producto = a * b;
        float cociente = a / b;
        System.out.println("Los resultados son: \n" + "Suma: " + suma + "\n"
                + "Resta: " + resta + "\n" + "Producto: " + producto + "\n"
                + "Cociente: " + cociente);

    }

}
