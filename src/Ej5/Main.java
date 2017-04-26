/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej5;

/**
 *
 * @author intel
 */
public class Main {
    public static void main(String[] args) {
        Categoria c1 = new Categoria("1", "Tecnologia", "Productos tecnologicos");
        Categoria c2 = new Categoria("2", "Hogar", "Electrodomesticos para el hogar");        
        c1.listar();
        c2.listar();
        
    }
}
