/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRTema2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ryano
 */
public class Ejer35_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Strin
        double a = 1.25063,c = 1.22;
        int b = 20;
        
        //a)Valor de a con solo tres decimales.
        System.out.printf("El valor de a con solo 3 decimales es %.3f \n", a);
        
        //b)Valor de b.
        System.out.printf("El valor de b es %d \n", b);
        
        //c)Valor de b con signo.
        System.out.printf("El valor de b con signo es +%d \n", b);
        
        //d)Valor de a con dos decimales y valor de b como entero.
        System.out.printf("El valor de a con dos decimales es %.2f y el valor de b como entero es %d \n", a, b);
        
        //e)Muestra lo mismo que en el apartado anterior utilizando los elementos "posición de dato”.
        System.out.printf("Muestra lo mismo que en el apartado anterior utilizando los elementos \"posición de dato”.");
        
        //f)Muestra el valor de a y su cuadrado, ambos con dos decimales.
        System.out.printf("El valor de a (%.2f) y su cuadrado (%.2f), ambos con dos decimales.\n", a, a*a);
        
        //g)Muestra el valor de a ocupando un ancho de campo de 9.
        System.out.printf("MAL??? El valor de a ocupando un ancho de campo de 9 es %f \n", a);
        
        //h)Muestra el valor de a ocupando un ancho de campo de 9 caracteres pero completando el ancho con ceros.
        System.out.printf("El valor de a ocupando un ancho de campo de 9 caracteres pero completando el ancho con ceros es %09f \n", a);
        
        //i)Muestra el valor de c en un ancho de campo de 10 caracteres y con dos decimales.
        System.out.printf("El valor de c en un ancho de campo de 10 caracteres y con dos decimales es %10f \n", c);
       
        //j)Pide tu nombre por teclado y muéstralo por pantalla.
        String nombre = JOptionPane.showInputDialog("tu nombre");
        System.out.println("Pide tu nombre por teclado y muéstralo por pantalla.");
        
        
    }
    
}
