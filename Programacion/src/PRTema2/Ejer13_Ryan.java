/*
Ejer13:  Utilizando los operadores vistos en clase, diseña un programa Java que 
solicite un número de 5 dígitos del teclado y los muestre por la pantalla 
separados pantalla. Por ejemplo, si el número es 53123 que muestre:

5-3-1-2-3
 */
package PRTema2;

import java.util.Scanner;
import java.text.DecimalFormat;


/**
 *
 * @author ryano
 */
public class Ejer13_Ryan {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("dame un numeriko (y que no empiece por 0 por dios!!): ");
        int userInput = sc.nextInt();
        int resto;
        String message = "";
        
        while (userInput>=1) { 
            resto = userInput%10;
            message = resto + "-" + message;
            userInput = userInput/10;
        }
        
        System.out.println(message);
        
        
                
        
    }
    
    
}
