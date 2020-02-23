package model;

import javax.swing.*;

public class Person {
    private String name, email;

    public Person() {
    }

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void print() {
        System.out.println("==================\nPERSONAL DATA:" + "\nName: " + getName() + "\ne-mail: " + getEmail());
    }
}