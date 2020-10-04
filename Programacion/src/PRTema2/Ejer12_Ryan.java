/*
Ejer12:  Pedir números por teclado hasta que su suma sea mayor que 100 o se 
introduzca un número negativo.  Al final mostrar la suma de todos los números 
y el número total de números que se han introducido (incluido el negativo, si 
lo hubiera) 
 */
package PRTema2;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer12_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        double userInput = 0; 
        double totals = 0;
        
        while ((totals < 100) || (userInput<0)) {

            System.out.print("Dame un numeriko priiiimo: ");
            userInput = sc.nextDouble();
            totals = totals + userInput;
            
        }
        
        System.out.println("me has dado en total " + totals);
        
    }  
}
