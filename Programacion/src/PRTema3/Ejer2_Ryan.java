/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRTema3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Ejer2_Ryan {
    public static void main(String[] args) {
        
        int longitud =0;
        
        do {  
            String cadena = JOptionPane.showInputDialog("dame una cadena");
            longitud = cadena.length();
            System.out.println("La longitud es: " + longitud);
            
        } while (longitud>0);
        
    }
    
}
