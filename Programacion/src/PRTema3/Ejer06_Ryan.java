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
public class Ejer06_Ryan {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Dame una frase");
        int contador = 0;
        int longCadena = frase.length();
        char caracter = '0';
        
        for (int i = 0; i < longCadena; i++) {
            caracter = frase.charAt(i);
            switch (caracter) {
                case 'a':
                    contador++;
                    break;
                case 'e':
                    contador++;
                    break;
                case 'i':
                    contador++;
                    break;
                case 'o':
                    contador++;
                    break;
                case 'u':
                    contador++;
                    break;
                 
                    
                        
            }
            
        }
        System.out.println(contador);
    }
    
}
