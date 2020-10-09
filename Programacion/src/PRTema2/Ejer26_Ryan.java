/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRTema2;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Ejer26_Ryan {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total = 1;
        
        for (int i = 1; i <= num; i++) {
            total = total*i;
            
        }
        
        System.out.println(total);
        
    }
    
}
