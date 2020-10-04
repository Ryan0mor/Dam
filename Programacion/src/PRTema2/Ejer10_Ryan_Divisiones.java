/*
Ejer10: Pedir por teclado el importe de una compra y la cantidad entregada para
pagar dicha compra, después mostrar, en monedas, cuántas había que entregar para
devolver el cambio.  Solo disponemos de monedas para dar el cambio (no billetes)
y también tenemos que indicar si el importe es suficiente.
 */
package PRTema2;

import java.util.Scanner;

/**
 *
 * @author ryano
 */
public class Ejer10_Ryan_Divisiones {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final double UNEUR = 1;
        final double DOSEUR = 2;
        final double CINCUENTACENT = 0.5;
        final double VEINTECENT = 0.2;
        final double DIEZCENT = 0.1;
        final double CINCOCENT = 0.05;
        final double DOSCENT = 0.02;
        final double UNCENT = 0.01;
        
        int monUno;
        int monDos;
        int monCincuent;
        int monVeint;
        int monDiez;
        int monCinc;
        int monDosC;
        int monUnC;
        
        System.out.print("Importe de la compra: ");
        double compra = sc.nextDouble();
        System.out.print("Cantidad entregada: ");
        double cantEntregada = sc.nextDouble();
        double cambioTotal = cantEntregada - compra;
        double resto = cambioTotal;
        
        if (cambioTotal < 0) {
            System.out.println("Me debes pasta madafaca");
        } else{
            
            monDos = (int) (resto/DOSEUR);
            resto = resto%DOSEUR;
            System.out.println(monDos+" Monedas de "+ DOSEUR + " Euros");

            monUno = (int) (resto/UNEUR);
            resto = resto%UNEUR;
            System.out.println(monUno+" Monedas de "+ UNEUR + " Euros");

            monCincuent = (int) (resto/CINCUENTACENT);
            resto = resto%CINCUENTACENT;
            System.out.println(monCincuent+" Monedas de "+ CINCUENTACENT + " Euros");

            monVeint = (int) (resto/VEINTECENT);
            resto = resto%VEINTECENT;
            System.out.println(monVeint+" Monedas de "+ VEINTECENT + " Euros");

            monDiez = (int) (resto/DIEZCENT);
            resto = resto%DIEZCENT;
            System.out.println(monDiez+" Monedas de "+ DIEZCENT + " Euros");

            monCinc = (int) (resto/CINCOCENT);
            resto = resto%CINCOCENT;
            System.out.println(monCinc+" Monedas de "+ CINCOCENT + " Euros");

            monDosC = (int) (resto/DOSCENT);
            resto = resto%DOSCENT;
            System.out.println(monDosC+" Monedas de "+ DOSCENT + " Euros");

            monUnC = (int) (resto/UNCENT);
            resto = resto%UNCENT;
            System.out.println(monUno+" Monedas de "+ UNCENT + " Euros");
            System.out.println("El error final es " + resto);

        }
        
        
    }
    
}
