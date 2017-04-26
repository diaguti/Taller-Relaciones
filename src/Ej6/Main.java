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
public class Main {

    
    public static void readPets(Vet v){
        System.out.println("Estas mascotas se encuentran en la veterinaria actualmente\n");
        for (int i = 0; i < v.getPets().size(); i++) {
            Pet m = v.getPets().get(i);
            
            System.out.println("Id mascota: " + m.getId() + " es un " + m.getTipo() + " con nombre " + m.getName() + 
                    ", color " + m.getHairColor() + " y su dueño es " + m.getPerson().getName());                             
        }
    }
        
    
    public static void main(String[] args) {
        
        Dog p1 = new Dog("Schnauzer","1","Toby", "Gris");
        Dog p2 = new Dog("Husky","2","Cany", "Negro");
        Cat g1 = new Cat("4","Moon", "Negro");
        Cat g2 = new Cat("5","Luna", "Blanco");
        Hamster h1 = new Hamster(200,"6","Bruno", "cafe con negro");
        Hamster h2 = new Hamster(150,"7","Puplin", "blanco");
        
        Person per1 = new Person("Diego","1032490151");
        Person per2 = new Person("Julian","1000157150");
        
        p1.setPerson(per1);
        p1.setTipo("perro");
        g1.setPerson(per1);
        g1.setTipo("gato");
        h1.setPerson(per1);
        h1.setTipo("hamster");
        p2.setPerson(per2);
        p2.setTipo("perro");
        g2.setPerson(per2);
        g2.setTipo("gato");
        h2.setPerson(per2);
        h2.setTipo("hasmter");
        
        Vet v = new Vet();
        v.addPet(p1);
        v.addPet(p2);
        v.addPet(g1);
        v.addPet(g2);
        v.addPet(h1);
        v.addPet(h2);
        
        readPets(v);
        v.mostrarMascotaPorTipo("perro");
        
    }
    
}
