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
public class Ejer07_Ryan {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("dame una frase");
        String fraseOut = "";
        int longFrase = frase.length();
        
        for (int i = 0; i < longFrase; i++) {
            fraseOut = fraseOut + (frase.charAt(i));
            System.out.println(fraseOut);
                       
        }
        
    }
    
}
