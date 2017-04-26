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
public class Customer extends ObjetoDeDominio{
    
    private String firstName;
    private String lastName;
    private String Telephone;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipcode;
    private String country;

    public Customer(String firstName, String lastName, String Telephone, String street1, String street2, String city, String state, String zipcode, String country, String id) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.Telephone = Telephone;
        this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }
    
    
    
}
