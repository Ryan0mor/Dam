/*
Realiza un ejercicio en Java que pida el día, el mes y el año de nacimiento de una persona, y te  diga cuántos años tiene y en qué día de la semana nació.
 */
package PRTema3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Ryan
 */
public class Ejer18_Ryan {
    public static void main(String[] args) {
        String diaSt = JOptionPane.showInputDialog("dime el dia");
        String mesSt = JOptionPane.showInputDialog("mes");
        String anioSt = JOptionPane.showInputDialog("año");
        int dia = Integer.parseInt(diaSt);
        int mes = Integer.parseInt(mesSt);
        int anio = Integer.parseInt(anioSt);
        
        
        
        LocalDate hoy = LocalDate.now();
        int resultadoAnio = (anio - hoy.getYear());
        int resultadoMes = (mes - hoy.getMonthValue());
        int resultadoDia = (dia - hoy.getDayOfMonth());
        
        
        /*
        //Declaro
        LocalDate hoy;
        //Inicializo
        hoy = LocalDate.now();
        
        int mes = hoy.getDayOfMonth();
        DayOfWeek diaSemana = hoy.getDayOfWeek();
        */
        
        

    }
    
}
