/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin1_3;

import java.util.*;

/**
 *
 * @author jalvarezbretana
 */
public class boletin1_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        //teclado.useLocale(Locale.US); ----- Para punto en vez de coma
        System.out.println("Cuantos euros quieres pasar a dolares");
        float euros = teclado.nextFloat();
        float cambio = 1.09f;
        float dolares = euros * cambio;
        System.out.println(euros + " euros son " + dolares + " dolares");

    }

}
