/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Cadena_A {

    private int elementos, sumatorio = 1;
    private int incremento = 2;
    private boolean a = true;

    public Cadena_A() {

    }

    public void comprobar_cadena_A() {

        while (a) {
            elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de elementos"));

            if (elementos > 0) {

                for (int i = 0; i < elementos; i++) {

                    int operacion = i + incremento;
                    incremento++;
                    System.out.print(operacion+" , ");
                    a = false;
                    sumatorio += operacion;
                }
            } else {

                JOptionPane.showMessageDialog(null, "Numero no valido, prueba otra vez");
                a = true;
            }
        }
        
        System.out.println("\nSumatorio de la cadena es : "+sumatorio);
    }

}
