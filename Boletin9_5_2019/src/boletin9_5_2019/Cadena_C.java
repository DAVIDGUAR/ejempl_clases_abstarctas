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
public class Cadena_C {
    
        int incremento = 1;
        int decremento = 0;
        private boolean a = true;
        private int elementos;
        int num1=0,num2=1,resultado,operacion=1;
        
        
        public void comprobar_cadena_C(){
        
        while (a) {
            elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce o numero de elementos"));

            if (elementos > 0) {

                System.out.print(decremento+" , "+incremento);
                
                for (int i = 2; i < elementos; i++) {
                            
                
                
               resultado=num1+num2;
               
                    System.out.print(" , "+resultado);
                    
                   
                    
                    num1=num2;
                    num2=resultado;
                
               

                    a = false;
                     operacion+=resultado;
                    
                    
                }

            } else {

                JOptionPane.showMessageDialog(null, "Numero no valido, prueba otra vez");
                a = true;
            }
            
            System.out.println("\nEl sumatori de la cadena de Fibonacci es : " + operacion);
            
        }
    
    
    
    
}
    
    
}
