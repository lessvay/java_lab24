package org;

import java.util.*;


public class Person {
    private int id;
    private String name;
    private String company;
    private String username;
    private String email;
    private String address;
    private String zip;
    private String state;
    private String country;
    private String phone;


    @Override
    public String toString() {
        String s = "";
        return "Person\n"
                + "id: " + this.id
                + "\nname: " + this.name
                + "\nusername: " + this.username
                + "\ncompany: " + this.company
                + "\nemail: " + this.email
                + "\naddress: " + this.address
                + "\nzip: " + this.zip
                + "\nstate: " + this.state
                + "\ncountry: " + this.country
                + "\nphone: " + this.phone;


    }


}
