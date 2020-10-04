/*
Ejer20:  Realiza el juego de "adivina un numerito”.  Las reglas son las siguientes:

1.  Generar un número aleatorio entre 1 y 100:  (int)(Math.random()*100)+1;

2.Pedir nº al usuario por teclado hasta que lo acierte.

3.Para cada número introducido indicar si el número aleatorio es mayor o menor.

4.Cuando se acierte el número, indicar el nº de fallos.
 */
package PRTema2;

import java.util.Scanner;


/**
 *
 * @author ryano
 */
public class Ejer20_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRandom = (int)(Math.random()*100)+1;
        int userInput = 999;
        int acumulador = 0;
        
        while (userInput != numRandom) {
            System.out.print("adivina un numero del 1 al 100:_");
            userInput = sc.nextInt();
            acumulador++;
            
            if (userInput<numRandom) {
                System.out.println("Es mayor");
            }
            if (userInput>numRandom) {
                System.out.println("Es menor");
            }
        }
        System.out.println(acumulador);
    }
    
}
