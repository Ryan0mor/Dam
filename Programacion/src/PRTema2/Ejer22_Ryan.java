/*
Ejer22:Desarrolla un programa en Java que pida un numero, N, por
çteclado y calcule la suma de los N primeros números pares a partir
del número que ha introducido el usuario (si el número introducido es
par sería el primer número que hay que sumar). Es decir, si insertamos 
un 5, nos haga la suma de 6+8+10+12+14.
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
        
        for (int i = 1; i <= 2*numInput; i++) {
            
            if (num%2==0) {
                System.out.println(num);
            }
            num++;
        }
    }
    
}
