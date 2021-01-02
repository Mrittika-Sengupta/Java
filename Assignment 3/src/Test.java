/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mrittika
 */
public class Test {
    public static void main(String args[]) {

        Employees e=new Employees("Rio",47593729,"rio@gmail.com"); //taking input from employees class
        e.printStatus();
        DBA d=new DBA("Hemsworth",30432344, "hemsworth@yahoo.com","2003"," Library Management",20);
        d.assignProject("Library Management",20,"SQL");
        d.printStatus();
        d.printEmployeeYears("2020");
        d.printAssignedProject();
        BackEndDev b= new BackEndDev("Jackson", 20180542, "jackson@gmail.com","20106", "Japps", true,40);
        b.assignProject("Japs", 40, "Django");
        b.printStatus();
        b.printEmplomentYears("2020");
        FrontEndDev f= new FrontEndDev("Sam",32632,"sam@xyz.com","2000",true,"Exam System",100,"false");
        f.assignProject("Exam System", 100, "Bootstrap");
        f.printStatus();
        f.printAssignedProject();
        f.printEmplomentYears("2000");

    }

}


