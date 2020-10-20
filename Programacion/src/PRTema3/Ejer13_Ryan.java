/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRTema3;

import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Ejer13_Ryan {
    public static void compruebaPalindromo(String args) {
        
    }
    
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("dame una frase");
        String fraseOpuesta = "";
        char caracter;
        
        int longFrase = frase.length();
        
        for (int i = (longFrase-1); i >= 0; i--) {
            caracter = frase.charAt(i);
            fraseOpuesta = fraseOpuesta + caracter;
            System.out.println(fraseOpuesta);
        }
        
        
        if (frase.compareTo(fraseOpuesta) == 0) {
            System.out.println("es un palíndormo");
        } else {
            System.out.println("no es un palíndromo");
        }       
    } 
}
