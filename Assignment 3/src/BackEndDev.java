/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
class BackEndDev extends DBA {
     //taking input
    public String working_since;

    public String project_name;

    public int team_members;

    public Boolean scrum_master;

    public BackEndDev(String name,int id,String email,String working_since,String project_name,Boolean scrum_master,int team_members) { //passing constructor

        //Using super keywork for name,salry,id from DBA class

        super(name,id,email,working_since,project_name,team_members);

        this.scrum_master = scrum_master;
        this.project_name=project_name;
        this.working_since=working_since;
    }

    public void printEmplomentYears(String working_since) { //printing working since

        System.out.println("working_since: " +this.working_since);

    }

    @Override
    public void assignProject(String project_name,int team_members,String server_side_framework) { //printing server_side_framework
                   System.out.println("server_side_framework: " +server_side_framework);
                       

    }

    @Override
    public void printAssignedProject() {

        System.out.println("project Assigned: " +this.project_name); //printing assigned project

    }

}

    

