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
public class Ejer21_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        int edadMayor=0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Introduce edad "+ i + ": ");
            edad = sc.nextInt();
            
            while (edad<0){
                System.out.println("la edad debe de ser mayor de 0");
                edad = sc.nextInt();
            }
            if (edad>edadMayor)
                edadMayor = edad;
            
        }
        
        System.out.println(edadMayor);
        
        
    }
    
}
