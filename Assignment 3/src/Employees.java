/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
 public class Employees {
     String name;

    int id;

     String email;

    

    

    public Employees(String name,int id, String email) { //passing constructor
        super();
        this.name = name;

        this.id=id;

        this.email= email;

    }

    //getter setter method

    public String getName() {

        return name;

    }

   

    public void setName(String name) {

        this.name = name;

    }

    //method to return id

    public int getId(){

        return id;

    }

    //method to set id

    public void setId(int id){

        this.id = id;

    }

    //method to return email

    public String getEmail() {

        return email;

    }

    //method to set email

    public void setEmail(String email) {

        this.email = email;

    }

    //verigying email 

    public Boolean verifyEmail(String email) {

        return this.getEmail().equals(email);

    }

    //Printing name,id

    public void printStatus() {

        System.out.println(this.getName() +" "+ this.getId() +" "+ this.getName());

    }

}

