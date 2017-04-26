/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6;

import java.util.ArrayList;

/**
 *
 * @author Diego
 */
public class Person {
    private String name;
    private String id;
    private ArrayList<Pet> pets = new ArrayList<Pet>(); 

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void addMascota(Pet mascota) {
        this.pets.add(mascota);
    }
    
    public void mostrarMascotas(){
        for (int i = 0; i < pets.size(); i++) {
            Pet m = pets.get(i);
            
            System.out.println("Mascotas:" + "\n" + "********** \n" );
            System.out.println("Mascota " + (i+1) + "\n" +
                               "Id " + m.getId() + "\n" + 
                               "Nombre " + m.getName() + "\n" + 
                               "Color " + m.getHairColor() + "\n");
        }
    }
}
