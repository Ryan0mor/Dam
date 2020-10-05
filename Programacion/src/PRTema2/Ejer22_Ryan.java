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
public class Ejer22_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInput = sc.nextInt();
        int num = numInput;
        int numTotal = 0;
        
        for (int i = 1; i <= 2*numInput; i++) {
            
            if (num%2==0) {
                numTotal = numTotal + num;
                System.out.println(num);
            }
            num++;
        }
        System.out.println(numTotal);
    }
    
}
