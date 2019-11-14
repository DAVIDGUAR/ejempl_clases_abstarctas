/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2_2019;

/**
 *
 * @author david
 */
public class Boletin9_2_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num = 0;
        double nummulti = 0;
        double operador = 9;
        int incremento = 9;
        int sumaTotal = 0;
        int calculosuma = 0;
        long multi_total = 0;
        long calculomulti = 0;

        for (int i = 10; i < 91; i++) {
            incremento++;

            sumaTotal = sumaTotal + i;

        }

        for (long b = 10; b < 91; b++) {

            operador++;

            calculomulti = (calculomulti * b);

        }
        System.out.println("Suma : " + sumaTotal);
        System.out.println("Multiplicacion : " + calculomulti);

    }
}
