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
public class Producto extends ObjetoDeDominio{
    
    private String name;
    private String description;
    private Categoria categoria;
    ArrayList <Item> items = new ArrayList <Item>();
    
    public Producto(String id, String name, String description) {
        super(id);
        this.name = name;
        this.description = description;
        switch(Integer.parseInt(id)){
            case 1:
                Item i1 = new Item("1", "Procesador Intel i3", 1500000);
                Item i2 = new Item("2", "Procesador AMD A10", 1600000);
                AgregarItem(i1);
                AgregarItem(i2);
                break;
            case 2:
                Item i3 = new Item("3", "Windows 10", 900000);
                Item i4 = new Item("4", "Android", 1000000);
                AgregarItem(i3);
                AgregarItem(i4);
                break;
            case 3:
                Item i5 = new Item("5", "1 puerta", 1550000);
                Item i6 = new Item("6", "2 puertas", 1650000);
                AgregarItem(i5);
                AgregarItem(i6);
                break;
            case 4:
                Item i7 = new Item("7", "secado rapido", 2000000);
                Item i8 = new Item("8", "ahorro de agua", 2500000);
                AgregarItem(i7);
                AgregarItem(i8);
                break;
        }
    }

    public void AgregarItem(Item item){
        items.add(item);
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
}
