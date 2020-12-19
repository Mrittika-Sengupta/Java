/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class User {
    //tsking input
     private String name; 
    private int id; 
    private String email; 

    //getter setter method to return name, id , email
    

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public boolean verifyEmail(String email){ // for verify email, it's return true
        return true; 
    }

    
    
    

}
