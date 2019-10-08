/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_5;

import java.util.*;

/**
 *
 * @author jalvarezbretana
 */
public class boletin1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //teclado.useLocale(Locale.US);
        System.out.println("Cuantas millas quieres pasar a metros?");
        float MILLAS = 1852f;
        float millas = teclado.nextFloat();
        float metros = millas * MILLAS;
        System.out.println("Los metros equivalentes a las millas introducidas son:\n" + metros);

    }

}
