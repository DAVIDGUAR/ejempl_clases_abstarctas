/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_clases_abstractas;

/**
 *
 * @author drodriguezguardiola
 */
public class Rectangulo extends Cuadrilatero{
    
    
    
    
    

    public Rectangulo(float base,float altura) {
        super(base,altura);
        
        
    }

  
  
    
    
    
    
    public void calcularArea(){

    Rectangulo rec = new Rectangulo(4f,4f);
    
        System.out.println("Area rectangulo"+rec);
    
    
    Cuadrilatero c = new Rectangulo(1f,1f);
    
        System.out.println("Area cudrilatero: "+(c.getBase()*c.getAltura()));
        
    }
    
    
    
    
    
}
