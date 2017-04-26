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
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    private int nd=0, nm=0;
    private String[] nombresDia = new String[7];
    private String[] nombresMes = new String[12];

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void agregarDia(String dia){
        nombresDia[nd] = dia;
        nd++;
    }
    
    public void agregarMes(String mes){
        nombresMes[nm] = mes;
        nm++;
    }
    
    
    public void añoBisiesto(int año){
        if((año%4) == 0){
            System.out.print("fue bisiesto\n");
        }else{
            System.out.print("no fue bisiesto\n");
        }         
    }
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String[] getNombresDia() {
        return nombresDia;
    }

    public void setNombresDia(String[] nombresDia) {
        this.nombresDia = nombresDia;
    }

    public String[] getNombresMes() {
        return nombresMes;
    }

    public void setNombresMes(String[] nombresMes) {
        this.nombresMes = nombresMes;
    }
    
    
}
