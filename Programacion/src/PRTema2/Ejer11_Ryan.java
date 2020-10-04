/*
Ejer11:  Repetir el ejercicio 4 de manera que el programa se repita hasta que 
el usuario elija en el menú la opción 4.  Si introduce una opción no válida, 
se mostrará un mensaje de error, mostrará de nuevo el menú y pedirá otra opción.
Nota:  El programa sólo termina cuando se introduce la opción 4.

Ejer4:  Mostrar el siguiente menú:

1.- Saludar con "Buenos días”

2.- Saludar con "Buenas tardes”

3.- Saludar con "Buenas noches”

4.-  Despedirse "Adiós”

Después de mostrar el menú se pedirá un nº por teclado, para cada una de las 
opciones se mostrará el saludo correspondiente, en caso de introducir cualquier 
otro número se mostrará un mensaje de opción incorrecta. 
 */
package PRTema2;

import javax.swing.JOptionPane;

/**
 *
 * @author ryano
 */
public class Ejer11_Ryan {
    public static void main(String[] args) {
        
        int option = 0;
        
        while (option != 4) {            

            System.out.println("1.- Saludar con \"Buenos días”");
            System.out.println("2.- Saludar con \"Buenas tardes”");
            System.out.println("3.- Saludar con \"Buenas noches”");
            System.out.println("4.-  Despedirse \"Adiós”");

            String optionSt = JOptionPane.showInputDialog("elige una opción del 1 al 4");
            option = Integer.parseInt(optionSt);

            switch (option){
                case 1:
                    System.out.println("Good morning");
                    break;
                case 2:
                    System.out.println("Good afternoon");
                    break;
                case 3:
                    System.out.println("Good evening");
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("te has colao, bacalao");
            }
        }
    }
}
