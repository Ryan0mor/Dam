/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRTema2;

/**
 *
 * @author Ryan
 */
public class EjerPrintf {
    public static void main(String[] args) {
        int nl = 135634;
        double n2 = 5345346456.235346346;
        int n3 = 2400000;
        
        //numero entero con separador de  miles
        
        //System.out.printf("el numero es: %,20.2%n", n2);
        
        System.out.printf("con menos %+d%n", -25);
        //System.out.printf("con menos %-d%n", 25);
        System.out.printf("con menos % d%n", 25);
        System.out.printf("con menos % d%% %n", n3);
    }
    
}
