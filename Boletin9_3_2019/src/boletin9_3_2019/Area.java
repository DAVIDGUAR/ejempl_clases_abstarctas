/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3_2019;

import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Area {
    
    private double base,altura,resultado;
    private boolean a=true;

   

    public Area() {
        
        
    }
    
    
    
    
    
    public void calculo_area(){
        
        
        while(a){
            
           base =Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
           this.altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura")); 
            
            
        
        if (base>0 && altura>0){
            
            resultado=base*altura;
            a=false;
             System.out.println("El area del rectangulo es : "+resultado);
            
        }else{
            
            JOptionPane.showMessageDialog(null,"Numero negativo, vuelve a introducirlo");
            a=true;
            
        }
        
        }
        
    }
    
    
}
