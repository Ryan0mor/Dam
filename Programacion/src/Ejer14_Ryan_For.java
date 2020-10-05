
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryan
 */
public class Ejer14_Ryan_For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0;
        double nota;
        
        for (int i = 1; i < 10; i++) {
            do {                
                System.out.println("dame la nota");
                nota = sc.nextFloat();
            } while (nota<0 && nota>10);
            
            if (nota>5){
                aprobados++;
            }
        }
        
    }

}
