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
public class Circulo extends Poligono{
    
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

   
    
    
    public void calcular_Area(){
    
   System.out.println("El area es: " + Math.PI*(Math.pow(radio, 2)));
    
}
}
