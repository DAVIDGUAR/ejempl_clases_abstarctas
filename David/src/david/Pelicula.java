/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david;

/**
 *
 * @author drodriguezguardiola
 */
public class Pelicula {
    
   private float prezo;
   private String titulo;

    public Pelicula(float prezo, String titulo) {
        this.prezo = prezo;
        this.titulo = titulo;
    }

    public void dar_Prezo(float prezo) {
        this.prezo = prezo;
    }

    public float getPrezo() {
        return prezo;
    }

    public String getTitulo() {
        return titulo;
    }

  

  

   
   
    
    
    
    
    
    
    
}
