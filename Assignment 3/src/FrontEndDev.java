/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
class FrontEndDev extends BackEndDev {
     //taking input
    public String working_since;

    public String name;

    public int team_members;

    public String team_leader;

    //passing constructor

    public FrontEndDev(String name, int id, String email, String working_since, Boolean scrum_master, String project_name, int team_members,String team_leader) {

        super(name,id,email,working_since,project_name,scrum_master,team_members);

        this.team_leader= team_leader;
        this.project_name=project_name;
        this.working_since= working_since;
    }

    @Override
    public void printEmplomentYears(String working_since) { //printing working since

         System.out.println("working_since: " +this.working_since);

    }

    @Override
    public void assignProject(String project_name,int team_members,String front_end_framework) { //printing front_end_framework

         System.out.println("front_end_framework: " +front_end_framework);

    }

    @Override
    public void printAssignedProject(){

        System.out.println("Project assigned: " +this.project_name); //printing assigned project name

    }

}
