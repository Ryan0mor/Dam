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
public class Ejer02_Ryan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        
        if (num1 == num2) {
            System.out.println("son iguales");
        } else if (num1 < num2){
            System.out.println("el segun número es mayor");
        } else {
            System.out.println("el primer número es mayor");
        }
        
        
    }
    
}
