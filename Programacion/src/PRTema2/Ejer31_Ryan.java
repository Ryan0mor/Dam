/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRTema2;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer31_Ryan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String cadena = "*";
        
        
        for (int i = 0; i < num; i++) {
            System.out.println(cadena);
            cadena = cadena + "*";
            
        }
        
    }
    
}
