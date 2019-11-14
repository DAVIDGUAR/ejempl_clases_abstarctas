package boletin9_4_2019;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author david
 */
public class Tabla {

    private int num;
    private boolean a = true;

    public Tabla() {
    }

    public void calculo_mul() {

        while (a) {
            this.num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
        

        if (num > 0) {
            
             System.out.println("Table del numero "+num);

            for (int i = 0; i < 11; i++) {

                int resultado = i * num;

                System.out.println(num + " * " + i + " = " + resultado);
               
                
                
            }
        } else {
            System.out.println("FIN");
            a = false;

        }
        }
    }

}
