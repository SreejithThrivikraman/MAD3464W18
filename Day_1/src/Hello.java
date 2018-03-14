/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sree
 */

public class Hello                                   // class name should start with an upper case letter

{
    public static void main(String[] args) 
    {
        
        int a = 10;        // integer occupies 4 bytes .Every variable will be started with _ , small case.
        System.out.println("value of a is = " + a);     // system is the class that is used      
        System.out.print("value of a is = " + a);
        
        
        float percentage ;
        char vowel = 'a' ;
        String firstName = "ST" ;
        
        percentage = 78.6f;
        System.out.println("Value of percentage :" + percentage);
        
//        a = 12.20;       integer cannot be assigned to a float value.


        System.out.println("Addition result = " + 10 + 10);   // work as a concatenation for a string. ie execution from left to right
         System.out.println(10 + 10 + "Addition result = ");  // work as a math operation at left and concatenate with string at end.
                
        
         //switch case
         switch (10 + 20)                                    // it won't take a float value.
         {
            case 10 : System.out.println("Value = 10");
                       break;
             
            case 20 : System.out.println("Value = 20");
                       break;  
            case 30 : System.out.println("Value = 30");
                       break;    
            default : System.out.println("Error !!");
                       break;
         }
                
         
        
        char sample = 'a';
        //float sample = 11.11        
        //switch case
         switch (sample)                                    // it won't take a float value.
         {
            case 'a' : System.out.println("Value = A");
                       break;
             
            case 'b' : System.out.println("Value = B");
                       break;  
            case 'c' : System.out.println("Value = C");
                       break;    
            default : System.out.println("Error !!");
                       break;
         }
        
         
         
         String string_sample = "Logo";
        //float sample = 11.11        
        //switch case
         switch (string_sample)                                    // it won't take a float value.
         {
            case "Llogo" : System.out.println("Value = A");
                       break;
             
            case "Pogo" : System.out.println("Value = B");
                       break;  
            case "Logo" : System.out.println("Value = Logo");
                       break;    
            default : System.out.println("Error !!");
                       break;
         }
         
         
         char string_sample2 = 'i';
         System.out.println("Hello.main()");
         //float sample = 11.11        
        //switch case
         switch (string_sample2)                                    // it won't take a float value.
         {
            case ('a' | 'e' | 'i') : System.out.println("Value = A");
                       break;
             
            case 'e' : System.out.println("Value = B");
                       break;  
            case 'd' : System.out.println("Value = Logo");
                       break;    
            default : System.out.println("Error !!");
                       break;
         }
         
         
        // array declaration 
       int numbers[] = new int[5];
       int i;
       
        for ( i = 0; i < 5; i++) 
        {
           numbers[i] = i;
           System.out.println("Array element a[" + i + "] = " + numbers[i]);
           
        }
               
      i = 0;   
     int Random_no;
     int sample_array[] =  new int[10];
     int sorted_array[] =  new int[10];
        for (int j = 0; j < 10; j++) 
        {
            Random_no = (int)(Math.random() * 10);
            System.out.println("no " +i + 1+ "=" + Random_no );
            sample_array[j] = Random_no;
            
            
        }
         
        
        // sorting
        int min,temp ;
        for (int j = 0; j < 10; j++) 
        {
            min = sample_array[j];
            for (int k = j+1 ; k < 10; k++) 
            {
                if (min > sample_array[k]) 
                {
                    temp = sample_array[k];
                    sample_array[k] = min;
                    min = temp;
                }
            }
            
            sorted_array[j] = min;
        }
        
        System.out.println("The array is : >>>>)");
        for (int j = 0; j < 10; j++) 
        {
            System.out.println(sorted_array[j]);
        }
        
        
        
        for (i = 1; i <= 5; i++) 
        {
            if (i == 1 || i == 5)
            {
                for (int j = 1; j <= 5; j++) 
                {
                    System.out.print("*");
                }
                
            }
            else
            {
                for (int k = 1; k <=5; k++) 
                {
                    if( k == 1 || k == 5)
                    {
                    System.out.print("*");
                    }
                    
                    else
                    {
                        System.out.print(" ");

                    }
                }
            }
            System.out.print("\n");
                    
        }
        
        
        
//        System.out.println("1 2 3 4 5 4 3 2 1");
//        System.out.println("1 2 3 4   4 3 2 1");
//        System.out.println("1 2 3       3 2 1");
//        System.out.println("1 2           2 1");
//        System.out.println("1               1");   
//        System.out.println("1 2           2 1"); 
//        System.out.println("1 2 3       3 2 1"); 
//        System.out.println("1 2 3 4   4 3 2 1"); 
//        System.out.println("1 2 3 4 5 4 3 2 1"); 
    }
}


