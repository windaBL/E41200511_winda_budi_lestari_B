/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person2;

/**
 *
 * @author winda
 */
public class managingpeopel {
    public static void main(String[] args) {
        person p1= new person("Arial", 37);
        person p2= new person("Joseph", 15);
        
        if (p1.getAge()==p2.getAge()) {
            System.out.println(p1.getAge()+" is the same age as "+p2.getAge());
            } 
        else {
            System.out.println(p1.getAge()+" is NOT the same age as "+p2.getAge());
        }
    }
}
