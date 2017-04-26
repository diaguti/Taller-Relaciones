/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej4;

/**
 *
 * @author intel
 */
public class Main {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(21, 1, 2001);
        Fecha fecha2 = new Fecha(11, 4, 2001);
        Fecha fecha3 = new Fecha(17, 06, 2006);
        fecha1.agregarDia("lunes");
        fecha1.agregarDia("martes");
        fecha1.agregarDia("miercoles");
        fecha1.agregarDia("jueves");
        fecha1.agregarDia("viernes");
        fecha1.agregarDia("sabado");
        fecha1.agregarDia("domingo");
        fecha2.agregarDia("lunes");
        fecha2.agregarDia("martes");
        fecha2.agregarDia("miercoles");
        fecha2.agregarDia("jueves");
        fecha2.agregarDia("viernes");
        fecha2.agregarDia("sabado");
        fecha2.agregarDia("domingo");
        fecha3.agregarDia("lunes");
        fecha3.agregarDia("martes");
        fecha3.agregarDia("miercoles");
        fecha3.agregarDia("jueves");
        fecha3.agregarDia("viernes");
        fecha3.agregarDia("sabado");
        fecha3.agregarDia("domingo");
        fecha1.agregarMes("Enero");
        fecha1.agregarMes("Febrero");
        fecha1.agregarMes("Marzo");
        fecha1.agregarMes("Abril");
        fecha1.agregarMes("Mayo");
        fecha1.agregarMes("Junio");
        fecha1.agregarMes("Julio");
        fecha1.agregarMes("Agosto");
        fecha1.agregarMes("Septiembre");
        fecha1.agregarMes("Octubre");
        fecha1.agregarMes("Noviembre");
        fecha1.agregarMes("Diciembre");
        fecha2.agregarMes("Enero");
        fecha2.agregarMes("Febrero");
        fecha2.agregarMes("Marzo");
        fecha2.agregarMes("Abril");
        fecha2.agregarMes("Mayo");
        fecha2.agregarMes("Junio");
        fecha2.agregarMes("Julio");
        fecha2.agregarMes("Agosto");
        fecha2.agregarMes("Septiembre");
        fecha2.agregarMes("Octubre");
        fecha2.agregarMes("Noviembre");
        fecha2.agregarMes("Diciembre");
        fecha3.agregarMes("Enero");
        fecha3.agregarMes("Febrero");
        fecha3.agregarMes("Marzo");
        fecha3.agregarMes("Abril");
        fecha3.agregarMes("Mayo");
        fecha3.agregarMes("Junio");
        fecha3.agregarMes("Julio");
        fecha3.agregarMes("Agosto");
        fecha3.agregarMes("Septiembre");
        fecha3.agregarMes("Octubre");
        fecha3.agregarMes("Noviembre");
        fecha3.agregarMes("Diciembre");                         
        Persona p1 = new Persona("Diego", "Gutierrez", fecha2);
        System.out.print("El fecha de nacimiento de " + p1.getNombre() + " " + p1.getApellido() + " "
                + "fue el dia " + p1.getCumpleaños().getNombresDia()[(p1.getCumpleaños().getDia())%7] + " "
                + p1.getCumpleaños().getDia() + " de " + p1.getCumpleaños().getNombresMes()[(p1.getCumpleaños().getMes())-1] + 
                " del año " + p1.getCumpleaños().getAño() + "\nEse año ");
         p1.getCumpleaños().añoBisiesto(p1.getCumpleaños().getAño());         
    }
}
