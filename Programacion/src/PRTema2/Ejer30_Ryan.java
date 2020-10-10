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
public class Ejer30_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 =  sc.nextInt();
        int num2 = sc.nextInt();
        
        //Metodo 1
        System.out.println("Aquí el método 1");
        for (int j = 0; j < num2; j++) {
            for (int i = 0; i < num1; i++) {
            System.out.printf("*");
            }
            System.out.println("");
        }
        
        //Metodo 2
        String salida = "";
        System.out.println("Aquí el método 2");
        
        for (int j = 0; j < num1; j++) {
            salida = salida + "*";
        }
        
        for (int i = 0; i < num2; i++) {
            System.out.println(salida);
        }
        
        
    }
    
    
    
}
