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
public class Ejer10_Ryan {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("Dame la cadena de las narices");
        int longCadena = cadena.length();
        char caracter;
        String palabra = "";
        int contador = 0;
        
        for (int i = 0; i < longCadena; i++) {
            caracter = cadena.charAt(i);
            if (caracter == ' ') {
                System.out.println("");
                palabra = "";
            } else
                palabra = palabra + caracter;
                contador++;
        System.out.println(palabra);
        System.out.println(contador);

            
        }
        
    }
    
}
