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
public class Ejer03_Ryan {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Tu nota es: ");
        int nota = sc.nextInt();
        
        
        switch (nota){
            case 0:
            case 1:
                System.out.println("Eres un paquete");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Espabila");
                break;
            case 5:
                System.out.println("por los pelos");
                break;
            case 6:
            case 7:
                System.out.println("Notable");
            case 8:
            case 9:
            case 10:
                System.out.println("Seguro que has copiao, confiesa!");
                break;
            default: 
                System.out.println("introduce tu nota de verdad, trol!");
        }
                
                  
        
        
        
    }
    
}
