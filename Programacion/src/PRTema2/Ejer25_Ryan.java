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
public class Ejer25_Ryan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        char caracter = 1;
                
        do {   
            System.out.println("introduce un num del 100 al 200");
            num = sc.nextInt();
            
        } while (num<100 || num>200);
        
        for (int i = num; i <= (num+100); i++) {
            caracter = (char)i;
            System.out.println(caracter);
            
        }
        
        
    }
    
}
