/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej6;

/**
 *
 * @author Diego
 */
public class Cat extends Pet{
    
    private boolean isHunter;

    public Cat(String id, String name, String hairColor) {
        super(id, name, hairColor);
    }
    

    
   

    public boolean isIsHunter() {
        return isHunter;
    }

    public void setIsHunter(boolean isHunter) {
        this.isHunter = isHunter;
    }
    
    @Override
    public void Sound(){
        System.out.println("Miau");
    }
    
    
}
