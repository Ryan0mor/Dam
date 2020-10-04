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
public class Ejer10_Ryan_Arrays {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final double valorMon[] = {2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
        final double valorMon100[] = {200, 100, 50, 20, 10, 5, 2, 1};
        
        int cantidadMon[] = {0, 0, 0, 0, 0, 0, 0, 0};
        
        System.out.print("Introduce la compra: ");
        double compra = sc.nextDouble();
        
        System.out.print("Introduce importe pagado: ");
        double pagado = sc.nextDouble();
        
        double cambio = pagado - compra;
        
        double resto100 =  cambio*100;
        
        if (pagado>compra) {
        
            for (int i = 0; i < 8; i++) {
                cantidadMon [i] = (int)(resto100/(valorMon100[i]));
                resto100 = (resto100 % valorMon100[i]);

                if (cantidadMon [i] > 0) {
                    System.out.println("la candidad de monedas de " + valorMon[i] + 
                        "€, es: " + cantidadMon[i]);    
                }
            }
        } else{
            System.out.println("me debes dinero");
        }    
    }  
}
