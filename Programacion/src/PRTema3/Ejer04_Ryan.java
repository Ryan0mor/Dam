/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRTema3;

import java.util.Scanner;

/**
 *
 * @author Ryan
 */
public class Ejer04_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        int longCadena = cadena.length();
        char caracter;
        
        for (int i = 0; i < longCadena; i++) {
            caracter = cadena.charAt(i);
            System.out.print(caracter + "-");
            
        }
    }
    
}
