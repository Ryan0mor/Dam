/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRTema1;

/**
 *
 * @author ryano
 */
public class Ejer15 {
    public static void main (String[] args){
        
        int dia =3;
        String resultado;
        
        switch (dia) {
            case 1:
                resultado = "lunes";
                break;
            case 2:
                resultado = "martes";
                break;
            case 3:
                resultado = "miercoles";
                break;
            case 4:
                resultado = "jueves";
                break;
            case 5:
                resultado = "viernes";
                break;
            case 6:
                resultado = "sabado";
                break;
            case 7:
                resultado = "domingo";
                break;
            default:
                resultado = "mal";
                throw new AssertionError();
        }
        
        System.out.println("dia");
    }
}
