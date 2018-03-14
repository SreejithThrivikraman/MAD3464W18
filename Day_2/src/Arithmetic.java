/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sree
 */
public class Arithmetic 
        
{
    int addition (int a, int b)
    {
       System.out.println("additon inside integer method");
       return a + b;
    }
    
    int sub (int a, int b)
    {
       return a - b;
    }
    
    float addition (float a, float b)
    {
       System.out.println("additon inside float method");
       return a + b;
    }
    
    
    int sample_array(int ... num)
    {   //int sum =0;                           // code optimisation.
        int i,sum;
        
        for( i=0,sum =0; i < num.length; sum  += num[i],i++)
        {
            
        }
        
        return sum;
    }
    
    
    static int multiplication (int ... num)
    {
        int i, answer = 1;
        
        for (i = 0; i < num.length; i++) 
        {
            
        }
        return 0;
    }
    
    
}
