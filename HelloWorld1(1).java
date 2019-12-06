/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld1;

import java.util.*;/**
 *
 * @author Comlab
 */
public class HelloWorld1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scn = new Scanner (System.in);
     System.out.println("==================================");
      System.out.println(">>>Hello World!<<<");
      System.out.println(" ");
      System.out.println("What's your name? ");
       String name = scn.nextLine();
      System.out.println("How old are you? ");
       int num = scn.nextInt();
      System.out.println("What's your Address? ");
       String address = scn.nextLine();
       address = scn.nextLine();
      System.out.println("=================================="); 
       System.out.println("Hi "+name+"!");
       System.out.println("You are "+name); 
       System.out.println("You are "+ num +"Yrs Old");
       System.out.println("You live at "+address);
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(">>>Thank you for your cooperation!<<<");
    }
}
