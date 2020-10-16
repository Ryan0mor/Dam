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
public class Ejer03_1_Ryan {
    public static void main(String[] args) {
        String cadena = JOptionPane.showInputDialog("dame una cadena");
        int num;
        do {            
            String numSt = JOptionPane.showInputDialog("dame un numero");
            num = Integer.parseInt(numSt);
            

        } while (num>0);
    }
    
}
