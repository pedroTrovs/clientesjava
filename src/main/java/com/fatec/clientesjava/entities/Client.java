package com.fatec.clientesjava.entities;

public class Client {
    private int id;
    private String name;
    private String email;

    public Client(int newId, String newName, String newEmail)
    {
        this.id = newId;
        this.name = newName;
        this.email = newEmail;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
}
