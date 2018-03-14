
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
public class Bank 

{
    
    // data members.
    String Bank_Name ;
    String Bank_ID   ;
    
    
    // member method to get the bank details
    public void get_Bank_Data(String name,String ID)
    {
                this.Bank_ID   = ID;
                this.Bank_Name = name;
    
    }
    
    
}
