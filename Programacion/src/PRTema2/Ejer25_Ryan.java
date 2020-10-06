/*
Ejer25.-Pedir un nº entre 100 y 200 (incluidos), comprobar que el valor
del número introducido es adecuado, si no lo es, volver a pedirlo hasta 
que sea el valor adecuado.  Después mostrar el código ASCII desde el
100 hasta el nº introducido.
 */
package PRTema2;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer25_Ryan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        char caracter = 1;
                
        do {   
            System.out.println("introduce un num del 100 al 200");
            num = sc.nextInt();
            
        } while (num<100 || num>200);
        
        for (int i = num; i <= (num+100); i++) {
            caracter = (char)i;
            System.out.println(caracter);
            
        }
        
        
    }
    
}
