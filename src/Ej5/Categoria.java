/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej5;

import java.util.ArrayList;

/**
 *
 * @author intel
 */
public class Categoria extends ObjetoDeDominio{
    
    private String name;
    private String description; 
    ArrayList <Producto> products = new ArrayList <Producto>();
    public Categoria(String id, String name, String description) {
        super(id);
        this.name = name;
        this.description = description;
        switch(Integer.parseInt(id)){
            case 1:
                Producto p1 = new Producto("1", "Computadores", "ASUS");
                Producto p2 = new Producto("2", "Tablets", "HP");
                agregarProducto(p1);
                agregarProducto(p2);
                break;
            case 2:
                Producto p3 = new Producto("3", "Neveras", "Samsung");
                Producto p4 = new Producto("4", "Lavadoras", "LG");
                agregarProducto(p3);
                agregarProducto(p4);
                break;                
        }
    }

    public void agregarProducto(Producto producto){
        products.add(producto);
    }
    public void listar(){
        System.out.println("La categoria de " + getName() + " ofrece productos como: " );
        for (int i = 0; i < products.size(); i++) {
            System.out.println("\t" + (i+1) + ". " + products.get(i).getName() + " marca " + products.get(i).getDescription()
            + " con: ");
            for (int j = 0; j < products.get(i).getItems().size(); j++) {
                System.out.println("\t \t" + (j+1) + ". " + products.get(i).getItems().get(j).getName() + " a un precio"
                        + " de " + products.get(i).getItems().get(j).getUnitCost());
            }
        }
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Producto> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Producto> products) {
        this.products = products;
    }
    
    
}
