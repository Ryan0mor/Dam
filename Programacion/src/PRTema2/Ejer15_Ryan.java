/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRTema2;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer15_Ryan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int alumnos = 10;
        int aprobados = 0;
        double nota = 0;

        while (alumnos>0) {
            alumnos--;
            System.out.print("introduce nota de alumno: ");
            nota = sc.nextDouble();
            
            while (nota < 1 || nota > 10) {                
                System.out.println("esa nota es incorrecta, introducela de nuevo");
                nota = sc.nextDouble();  
            }
            
            if (nota>=5) {
            aprobados++;    
            } 
        }
        System.out.println("En total hay " + aprobados + " alumno/s aprobados");   
    } 
}
