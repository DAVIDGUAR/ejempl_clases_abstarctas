/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package david;

import javax.swing.JOptionPane;

/**
 *
 * @author drodriguezguardiola
 */
public class David {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Hoxe peli1 = new Hoxe(13.5f, "contos de Vigo");
        Hoxe peli2 = new Hoxe(new Pelicula(15, "Os dous de sempre"));

        int a;

        do {

            a = Integer.parseInt(JOptionPane.showInputDialog("Quieres siguir, pulsa un numero, sino pulsa 0"));
            peli1.setPrezo(15);
            System.out.println(peli1.visualiza());

            peli1.rebaixa(20);
            System.out.println(peli1.visualiza());

        } while (a != 0);

        System.out.println("Fin");

    }

}
