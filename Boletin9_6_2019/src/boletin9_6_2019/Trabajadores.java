/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author drodriguezguardiola
 */
public class Trabajadores {

    private boolean a = true;
    private  String nombre;
    private int sueldo;

    private int contador = 1;
   private int operacion;
   private int sueldo_bajo;
   
   
   
   

    public Trabajadores(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public Trabajadores() {
        

    }

    public void comprobar_sueldo() {

        while (a) {

            sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce sueldo trabajador"));
           // nombre =JOptionPane.showInputDialog("Introduce nombre trabajador");
            Trabajadores obx = new Trabajadores(nombre, sueldo);
            
            
            
            if (sueldo >= 1000 && sueldo <= 1750) {

                contador++;

            } else if (sueldo < 1000) {
                contador++;
                sueldo_bajo++;
               // operacion=(contador/sueldo_bajo)/100;

            } else {

                contador++;

            }
            
            
            
            
            
            if (sueldo == 0) {
                a = false;
            }

        }
        operacion=(contador/sueldo_bajo)/100;
        System.out.println(operacion+"%");
        
        
    }

}
