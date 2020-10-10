/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer21 {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {

            int num = i;
            int contador = 0;

            for (int j = num; j > 1; j--) {

                if (num%j==0) {
                    contador++;
                }
            }

            if (contador==1) {
                
                System.out.println(num);
                
            }
        }
    }
    
}

