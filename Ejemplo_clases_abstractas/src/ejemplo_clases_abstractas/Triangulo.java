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
public class Triangulo extends Poligono{
    
    
    private float base,altura;

    public Triangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    
    
    
    

   
    public void calcularArea(){
        
        System.out.println("El area del triangulo es: "+(base*altura)/2);
        
        
    }
    
    
    
}
