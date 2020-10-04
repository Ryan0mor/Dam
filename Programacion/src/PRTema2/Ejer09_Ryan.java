/*
Igual que el ejer6, pero al final mostraremos la suma de todos los números introducidos.
Ejer6:  Pedir números por teclado hasta que se introduzca un cero.
 */
package PRTema2;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer09_Ryan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = 99;
        int total = 0;
        
        while (num != 0) {
            System.out.print("introduce un número: ");
            num = sc.nextInt();
            total = num + total;
            
        }
        System.out.println(total);        
        
    }
    
}
