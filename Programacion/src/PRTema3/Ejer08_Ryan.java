/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRTema3;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer08_Ryan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cadena;
        int longCadena;
        int sumaTotal = 0;
        
        //variables auxiliares para la conversión de datos: seguro que existe un método mejor que esto
        int sumando;
        char caracter;
        String caracterSt = "";
        
        do {
            cadena = sc.nextLine();
            longCadena = cadena.length();
            
            for (int i = 0; i <= longCadena; i++) {
                sumaTotal = 0; // Reinicio el valor del total
                for (int j = 0; j < longCadena; j++) {
                    caracter = cadena.charAt(j);

                    caracterSt = caracterSt + caracter; //Conversión de Char a String
                    sumando = Integer.parseInt(caracterSt); // Coversión de String a Entero
                    caracterSt = ""; //Reinicio el valor de la string
                    
                    System.out.print(sumando + " + ");
                    sumaTotal = sumaTotal + sumando;
                }
                
                System.out.println(" = " + sumaTotal);
                cadena = "" + sumaTotal; //Actualizo el valor de cadena
                longCadena = cadena.length();
                
            }
            System.out.println("tu numero de la suerte es " + sumaTotal);            
        } while (cadena != "0");
            
    }
    
}
