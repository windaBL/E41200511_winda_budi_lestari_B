/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author winda
 */
public class Person {
   String fname;
   String iname;
   String stuid;
   String stustatus;
   
   public Person(String fname, String iname, String stuid, String stustatus) {
   this.fname=fname;
   this.iname=iname;
   this.stuid=stuid;
   this.stustatus=stustatus;
   
   
   }
       
    public static void main(String[] args) {
        Person student=new Person("Winda", "Lestari", "E41200511", "Active");
        
        System.out.println("Student Name : " + student.fname+" "+student.iname);
        System.out.println("Student ID: "+student.stuid);
        System.out.println("Student status: " +student.stustatus);
          
    }
    
}
