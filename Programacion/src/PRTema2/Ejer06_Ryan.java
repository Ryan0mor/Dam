/*
 pedir numeros hasta introducir 0
 */
package PRTema2;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer06_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=10;
        
        while (num != 0) {
            System.out.print("introduce un número: ");
            num = sc.nextInt(); 
        }
        System.out.println("numero correcto");
        
    }
    
}
