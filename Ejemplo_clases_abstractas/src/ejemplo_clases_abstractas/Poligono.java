/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package ejemplo_clases_abstractas;

import java.awt.Color;

/**
 *
 * @author drodriguezguardiola
 */
public abstract class Poligono implements Ipoligono{
    
    private Color colorRecheo;

    public Poligono(Color colorRecheo) {
        this.colorRecheo = colorRecheo;
    }

    public Poligono() {
    }
    
    
    
    
    
    public void calcularArea(){
        
        
    }
    
    
    
    
}
