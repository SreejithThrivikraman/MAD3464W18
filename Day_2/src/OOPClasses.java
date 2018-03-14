
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
public class OOPClasses 
{
    public static void main(String[] args) 
    {
//        Bank myBank = new Bank();
//        
//        Scanner input = new Scanner(System.in);          // System.in will get the input from the keyboard.
//        String name,ID;
//       
//        System.out.println("Enter the bank name:");
//        name = input.nextLine();
//       
//        System.out.println("Enter the bank ID:");
//        ID = input.nextLine();
//        
//        
//        myBank.get_Bank_Data(name, ID);
//        System.out.println("Bank ID :" + myBank.Bank_ID);
//        System.out.println("Bank Name :" + myBank.Bank_Name);
//        
//        // creating new object.
//        Bank YourBank = new Bank();
//        
//        
//        System.out.println("Enter the bank name:");
//        name = input.nextLine();
//       
//        System.out.println("Enter the bank ID:");
//        ID = input.nextLine();
//        YourBank.get_Bank_Data(name, ID);
//        System.out.println("Your Bank ID :"   + YourBank.Bank_ID);
//        System.out.println("Your Bank Name :" + YourBank.Bank_Name); 
        
        
        Arithmetic mathObject = new Arithmetic();
        int y = mathObject.addition(10, 20); 
        System.out.println("Printing the result of integer object :"+ y);
        
        y = mathObject.sub(20, 10); 
        System.out.println("Printing the sub result of integer object :"+ y);
        
        float z = mathObject.addition(10.5f, 10.50f); 
        System.out.println("Printing the sub result of float object :"+ z );
        
        //Person object = new Person("Sreejith","Thrivikraman",24);
        Person object = new Person();
        object.ReadData();
        object.displayData();
        
        
        
    }
}
