/*
Ejer2. - Tipos de variables
 */
package PRTema1;

/**
 *
 * @author ryano
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Crea un programa con el tipo de datos correcto para guardar los siguientes datos 
        y utiliza el operador de asignación para inicializar las variables a los valores que correspondan:*/
        
        boolean estadoCivil = true;
        boolean generoUsuario = true;
    
        int CONSTANTE9 = 999999;
        byte diaSemana = 1;
        short diaAnio = 300;
        long msTiempo = 1298332800000l;
        long poblacionTierra = 7594000000l; 
        
        double valorFactura = 10350.678;

            
        /*OPCIONALMENTE asigno reglas lógicas para cambiar un tipo de variable a otro tipo*/
        
        String generoUsuarioString = "V";
        
        if (generoUsuario) {
            generoUsuarioString = "M";
        }
               
        /*Mostrar el siguiente resultado con lo hecho anteriormente:*/
        
        System.out.println("El valor de la variable casado es "+ estadoCivil);
        System.out.println("El valor de la variable MAXIMO es "+ CONSTANTE9);
        System.out.println("El valor de la variable diasem es "+ diaSemana);
        System.out.println("El valor de la variable miliseg es "+ msTiempo);
        System.out.println("El valor de la variable totalfactura es "+ valorFactura);
        System.out.println("El valor de la variable población es "+ poblacionTierra);
        System.out.println("El valor de la variable sexo es "+ generoUsuarioString);
        
    
        
        
        
        
        
    }
    
}
