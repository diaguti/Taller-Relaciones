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
public class Vet {
    private ArrayList<Pet> pets = new ArrayList<Pet>();
    
    public Vet() {
        
    }
    
    public void removePet(Pet pet){
        this.pets.remove(pet);
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }
    
    public void mostrarMascotaPorTipo(String tipo){
        System.out.println("\n Mascotas de tipo " + tipo + ": \n");
            for (int i = 0; i < pets.size(); i++) {
                if (pets.get(i).getTipo()==tipo){
                Pet m = pets.get(i);
                
                System.out.println("Id: " + m.getId() + "\n" +
                                    "Nombre: " + m.getName() + "\n" +
                                    "Color: " + m.getHairColor()+"\n"+
                                    "Dueño: " + m.getPerson().getName());
                }
        }
    }
    
    
}
