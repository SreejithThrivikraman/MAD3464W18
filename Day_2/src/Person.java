
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sree
 */
public class Person 
{
    String firstName;
    String lastName;
    int age;

    // defalt constructor
    Person() 
    {
        this.firstName = "Default First Name";
        this.lastName  = "Default Last Name";
        this.age       = 1;
    }
    
    // copy constructor
    Person(Person x)
    {
        this.firstName = x.firstName;
        this.lastName  = x.lastName;
        this.age       = x.age;
    }
    
    
    // parameterised constructor.
    Person(String name,String lastName,Integer age)
    {
        this.firstName = name;
        this.lastName  = lastName;
        this.age       = age;
    }
    
    
    void ReadData()
    {
        Scanner input   = new Scanner(System.in);
        System.out.println("Enter the first name :");
        this.firstName  = input.nextLine();
        System.out.println("Enter the last name :");
        this.lastName   = input.nextLine();
        System.out.println("Enter the age :");
        this.age        = input.nextInt();
        
    }
    
    void displayData()
    {
        System.out.println("First Name :" + this.firstName);
        System.out.println("Last Name :" + this.lastName);
        System.out.println("Age :" + this.age);
        
    }        
    
}
