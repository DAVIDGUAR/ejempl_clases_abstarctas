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
public interface Ipoligono {
    
    
    public static final double PI= 3.1416;
    
    public abstract void calcularArea();
    
    default public void calcularPerimetro(){
        
        System.out.println("Este metodo aparece por defecto nas clases que implementa ...");
        
    }
    
    
}
