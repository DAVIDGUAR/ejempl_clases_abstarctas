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
public class Hoxe {
    
    
    
   private Pelicula peli;

    public Hoxe(float prezo,String titulo) {
        
        peli= new Pelicula(prezo, titulo);
        
        
    }

    public Hoxe(Pelicula peli) {
        this.peli = peli;
    }
    
    
    
    

    
 public void setPrezo(float prezo) {
     
     if (prezo<=0){
         
         System.out.println("prezo incorrecto");
         
     }else{
       
     peli.dar_Prezo(prezo);
     
     }
    }
   

   
   
    
    public void rebaixa(float reb){
        
      peli.dar_Prezo(peli.getPrezo()*(reb/100)-peli.getPrezo());
        
        
    }

    
    public String visualiza() {
        return "Pelicula: prezo=" + peli.getPrezo() + ", titulo=" + peli.getTitulo();
    }
    
    
    
    
    
    
    
}
