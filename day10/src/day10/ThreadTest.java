/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day10;

/**
 *
 * @author Sree
 */
public class ThreadTest 
{
    public static void main(String[] args) throws InterruptedException
    {
        System.out.println(Thread.currentThread().getName());
        
        for (int i = 0; i < 5; i++) 
        {
            Mymessage m1 = new Mymessage();
            m1.start();
            m1.sleep(2000);
            
            Thread t1 = new Thread ( new Day10());
            t1.start();
   
        }
        
        
        
        
        
    }
   
}
