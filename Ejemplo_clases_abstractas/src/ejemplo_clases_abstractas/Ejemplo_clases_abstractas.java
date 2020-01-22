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
public class Ejemplo_clases_abstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Poligono tri = new Triangulo(4f,3f);
        tri.calcularArea();
        
        
        Poligono rec = new Rectangulo(5f,3f);
        rec.calcularArea();
        
        Circulo c = new Circulo(2f);
        c.calcularArea();
        
        
        Ipoligono po = new Triangulo(5f,6f);
        po.calcularPerimetro();
        
        
        
    }
    
}
