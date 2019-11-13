/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1_2019;

import java.util.Random;

/**
 *
 * @author david
 */
public class Boletin9_1_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        

        int positivos = 0, negativos = 0, neutro = 0;

        int[] numeros = new int[10];

        Random aleatorio = new Random();

        for (int i = 0; i < numeros.length; i++) {

            numeros[i] = -10 + aleatorio.nextInt(21);
            System.out.println(numeros[i]);
            if (numeros[i] < 0) {

                negativos++;

            }
            if (numeros[i] > 0) {

                positivos++;
            }
            if (numeros[i] == 0) {
                neutro++;

            }
        }

        /* for (int a : numeros) {

         if (a < 0) {

         negativos++;

         }
         if (a > 0) {

         positivos++;
         }
         if (a == 0) {
         neutro++;

         }

         System.out.print(a + " \\ ");
         }
         */
       
        System.out.println("Numeros negativos que salieron = " + negativos);
        System.out.println("Numeros positivos que salieron = " + positivos);
        System.out.println("Numeros 0 se repite = " + neutro);

    }

}
