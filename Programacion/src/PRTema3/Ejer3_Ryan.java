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
public class Ejer3_Ryan {
    public static void main(String[] args) {
        
        String cadena = JOptionPane.showInputDialog("introduce una cadena");
        Scanner sc = new Scanner(System.in);
        int num;
        char caracter;
        
        do {
            num = sc.nextInt();
            caracter = cadena.charAt(num);
            System.out.println(caracter);
        } while (num>=0);
        
    }
    
}
