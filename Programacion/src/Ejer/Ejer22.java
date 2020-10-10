/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejer;

/**
 *
 * @author ryano
 */
public class Ejer22 {
    public static void main(String[] args) {
        String texto = "La lluvia de Sevilla es un maravilla";
        int contador = 0;
        
        for (int i = 0; i <= texto.length(); i++) {
            
            if(texto.charAt(i)=='a' || 
                texto.charAt(i)=='e' || 
                texto.charAt(i)=='i' || 
                texto.charAt(i)=='o' || 
                texto.charAt(i)=='u')
                    {
                contador++;
            }
            
        }
        
        System.out.println(contador);
      
    }
    
}
