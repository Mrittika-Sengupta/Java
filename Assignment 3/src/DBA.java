
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
class DBA extends Employees { 
    
    //taking input

    public String working_since;

    public String project_name;

    public int team_members;

    //Constructor for DBA class.

    public DBA(String name,int id,String email,String work_since,String project_name,int team_members) {

        super(name,id,email);

       this.working_since = work_since;
       this.project_name= project_name;
       this.team_members=team_members;
    }

    

    
    //printing employee years.

    public void printEmployeeYears(String work_since) {

        int year=Calendar.getInstance().get(Calendar.YEAR);
        int ws= Integer.parseInt(working_since);
        System.out.println("Employent Years: " +(year-ws));
    }

    

    public void assignProject(String project_name,int team_members,String query_language) { //passing constructor

       System.out.println("Query Language:  " +query_language); //printing language

    }

    public void printAssignedProject() { //printing assigned project

        System.out.println("project Assigned:  " +this.project_name);

    }

}

