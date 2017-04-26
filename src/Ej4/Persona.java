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
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha cumpleaños;
    
    public Persona(String nombre, String apellido, Fecha cumpleaños){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cumpleaños = cumpleaños;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(Fecha cumpleaños) {
        this.cumpleaños = cumpleaños;
    }
    
    
}
