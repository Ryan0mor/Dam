/*
20) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
 */
package Ejer;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int contador = 0;
        
        for (int i = num; i > 1; i--) {
            
            if (num%i==0) {
                contador++;
            }
        }
        
        System.out.println(contador);
        if (contador==1) {
            System.out.println("es primo");
            
        } else {
            System.out.println("no es primo");
        }
        
    }
    
}
