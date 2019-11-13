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
        double nummulti=0;
        double operador = 9;
        int incremento = 9;
        
        
       for (int i = 10; i < 91; i++) {
            incremento++;
           
            for (int a = 10; a < 91; a++) {

                int calculosuma = a + incremento;
                System.out.println("Suma : " + a + " + " + incremento + " = " + calculosuma);

            }

        }

        for(double b=10;b<91;b++){
            
            operador++;
            
            for(double c=10;c<91;c++){
                
                 double calculomulti = c * operador;
                System.out.println("Multiplicacion : " + c + " * " + operador + " = " + calculomulti);
                
            }
            
            
        }
        
        
        
    }
}
