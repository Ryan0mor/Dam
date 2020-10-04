/*
Dado un carácter (char, no lo pediremos por teclado, lo tendremos inicializado)
diremos si es una letra mayúscula, minúscula o si no es una letra.
 */
package PRTema2;

/**
 *
 * @author ryano
 */
public class Ejer01_Ryan {
    public static void main(String[] args) {
        char caracter = 1;
        
        if (caracter>=65 && caracter<=90) {
            System.out.println("es mayúscula");
        } else if (caracter>=97 && caracter<=122){
            System.out.println("es minuscula");
        } else{
            System.out.println("no es una letra");
        }
    }
    
}
