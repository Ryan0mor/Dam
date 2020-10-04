/*
Ejer18: Pedir las notas de 10 alumnos y al final decir cuántos han aprobado.  
No es necesario comprobar si la nota introducida es válida, se considerará 
aprobado cualquier nota igual o superior a 5.
 */
package PRTema2;

import java.util.Scanner;


/**
 *
 * @author ryano
 */
public class Ejer14_Ryan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int alumnos = 10;
        int aprobados = 0;
        double nota = 0;
        
        while (alumnos>0) {
            alumnos--;
            System.out.print("introduce nota de alumno: ");
            nota = sc.nextDouble();
            if (nota>=5) {
                aprobados++;    
            }  
        }
        
        System.out.println("En total hay " + aprobados + " alumno/s aprobados");   
    } 
}
