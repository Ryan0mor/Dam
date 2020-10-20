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
public class Ejer14_Ryan {
    public static void main(String[] args) {
        String cadenaInput;
        String cadenaOutput;
        cadenaInput = JOptionPane.showInputDialog("Dame un nombre");
        cadenaOutput = cadenaInput;
        System.out.println(cadenaOutput);

        for (int i = 0; i < 4; i++) {
            cadenaInput = JOptionPane.showInputDialog("Dame un nombre");
            System.out.println(cadenaInput);
            if (cadenaInput.compareTo(cadenaOutput) <= 0) {
                cadenaOutput = cadenaInput;
            }
        }
        
        System.out.println("El primer nombre es " + cadenaOutput);
        
    }
    
}
