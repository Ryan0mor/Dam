/*
Pedir 5 nombres (igual para 500) y decir cuál es el primero de la lista.
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

        for (int i = 0; i < 4; i++) {
            cadenaInput = JOptionPane.showInputDialog("Dame un nombre");
            if (cadenaInput.compareTo(cadenaOutput) <= 0) {
                cadenaOutput = cadenaInput;
            }
        }
        
        System.out.println("El primer nombre es " + cadenaOutput);
        
    }
    
}
