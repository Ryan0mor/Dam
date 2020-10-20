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
public class Ejer12_Ryan {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("dame el primer nombre");
        String nombre2 = JOptionPane.showInputDialog("dame el segundo nombre");
        
        if (nombre1.compareToIgnoreCase(nombre2) == 0) {
            System.out.println("son iguales");
        } else if (nombre1.compareToIgnoreCase(nombre2) <= 0){
            System.out.println(nombre1);
            System.out.println(nombre2);        
        } else {
            System.out.println(nombre2);
            System.out.println(nombre1);
        }
        
        System.out.println("Estos son los nombres en mayus y minus");
        System.out.println(nombre1.toLowerCase());
        System.out.println(nombre1.toUpperCase());
        System.out.println(nombre2.toLowerCase());
        System.out.println(nombre2.toUpperCase());

    }
    
}
