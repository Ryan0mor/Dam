/*
Analizar un método para comprobar si un password es aceptable, el password se 
le pasará como parámetro.   Un password es aceptable si su tamaño es mayor que 
2 y menor que 10.  Además no puede contener ningún espacio en blanco, y uno de 
los caracteres tiene que ser obligatoriamente uno de estos: #@$%&. 
·El método devolverá un byte con la siguiente codificación
0.- si es correcto
1.- si es menor de dos caracteres.
2.-  si es mayor de 10 caracteres.
3.-  si contiene espacios en blanco.
4.- si no contiene uno de los caracteres especiales.
 */
package PRTema3;

import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Ejer17 {
    public static byte passCheck (String passInput){
        byte resultado = 0;
        char caracter;
        int contadorCadena = passInput.length();
        if (contadorCadena<2) {
            resultado = 1;
        } else{
            if (contadorCadena>10) {
                resultado = 2;
            } else{
                for (int i = 0; i < contadorCadena; i++) {
                    caracter = passInput.charAt(i);
                    if (caracter == ' ') {
                        resultado = 3;
                        contadorCadena = 0;
                    }
                }
                for (int i = 0; i < contadorCadena; i++) {
                    caracter = passInput.charAt(i);
                    switch (caracter){
                        case '#':
                        case '@':
                        case '$':
                        case '%':
                        case '&':
                            resultado = 0;
                        break;
                        default:
                            resultado = 4;
                    }
                } 
            }
        }
        return resultado;
    }
    public static void main(String[] args) {
        String contrasenia = JOptionPane.showInputDialog("tu contraseña porfa");
        byte prueba = passCheck(contrasenia);
        System.out.println(prueba);
    }
}
