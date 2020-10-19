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
public class Ejer11_Ryan {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("dame una frase ");
        String numeroSt = JOptionPane.showInputDialog("ahora dame un numero");
        String nuevaFrase = "";
        int numero = Integer.parseInt(numeroSt);
        int longFrase = frase.length();
        char caracter;
        
        
        for (int i = 0; i < longFrase; i++) {
            caracter = frase.charAt(i);
            caracter = (char) (caracter + numero);
            nuevaFrase = nuevaFrase + caracter;
            
        }
        System.out.println(nuevaFrase);
        
    }
    
}
