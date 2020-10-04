/*
Escribe un programa que pida un número, a continuación debe pedir tantos 
números al usuario como el número introducido al principio. Al final el 
programa debe mostrar por pantalla la media de todos los números introducidos 
y si se ha insertado o no algún número que sea par.
 */
package PRTema2;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer19_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos inputs??");
        int totalInputs = sc.nextInt();
        int numeroInput;
        int acumulador = 0;
        int acumuladoTotal = 0;
        int acumuladorPar = 0;
        int check;
   
        while (acumulador<totalInputs) {            
            System.out.println("dame numeros");
            numeroInput = sc.nextInt();
            acumuladoTotal = acumuladoTotal + numeroInput;
            check = numeroInput%2;
            acumulador++;
            if (check==0) {
                acumuladorPar++;
            }
        }
        
        System.out.println("la media es: " + (acumuladoTotal/totalInputs));
        System.out.println("en total " + acumuladorPar + " pares");
        
 
        
    }
    
}
