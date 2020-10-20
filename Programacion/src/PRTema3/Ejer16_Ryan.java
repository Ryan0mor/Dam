/*
Crear un programa que muestre pida dos números enteros por teclado, n1 y n2, y muestre el siguiente menú:

1.- Suma

2.- División (cociente y resto)

3.- División (resultado con decimales)

4.- Elvado (n1 elevado a n2)

5.- Fin
 */
package PRTema3;

import java.util.Scanner;


/**
 *
 * @author ryano
 */
public class Ejer16_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int elevado = 1;
        
        System.out.println(num1 + num2);
        System.out.println("Resultado= " +(num1/num2) + " resto= " + (num1%num2));
        System.out.println((float)num1/num2);
        
        for (int i = 0; i < num2; i++) {
            elevado = elevado * num1;
        }
        System.out.println(elevado);
    }
}
