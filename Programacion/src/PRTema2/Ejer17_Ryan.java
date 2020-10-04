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
public class Ejer17_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero: ");
        double num = sc.nextDouble();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(num*i);
            
            
        }
        
    }
    
}
