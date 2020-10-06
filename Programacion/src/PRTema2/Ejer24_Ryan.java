/*
Ejer24.-Mostrar el cuadrado de todos los números desde el 20 al 10 (descendiente)

El cuadrado de: 20 es: 400

El cuadrado de: 19 es: 361

El cuadrado de: 18 es: 324

El cuadrado de: 17 es: 289

El cuadrado de: 16 es: 256

El cuadrado de: 15 es: 225

El cuadrado de: 14 es: 196

El cuadrado de: 13 es: 169

El cuadrado de: 12 es: 144

El cuadrado de: 11 es: 121

El cuadrado de: 10 es: 100
 */
package PRTema2;

/**
 *
 * @author Ryan
 */
public class Ejer24_Ryan {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        
        for (int i = num2; i >= num1; i--) {
            System.out.println(i*i);
            
        }
    }
    
}
