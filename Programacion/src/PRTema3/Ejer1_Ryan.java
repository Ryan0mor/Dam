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
public class Ejer1_Ryan {
    public static void main(String[] args) {
        
         
        String nombre = JOptionPane.showInputDialog("Dame tu nombre");
        int longNombre = nombre.length();
        char inicial = nombre.charAt(0);
        char ultimaFinal = nombre.charAt(nombre.length()-1);

        System.out.println("longitud: "+longNombre +" inicial: "+inicial+" final: "+ultimaFinal);
    }
    
}
