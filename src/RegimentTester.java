/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class RegimentTester extends IOException 
{
   public static void main (String [] args) throws FileNotFoundException
   { 
        Army stalin = new Army();
        Scanner data = new Scanner(new File("src/regiments.txt"));
        Regiment current;
        
        ArrayList<String> words = new ArrayList<String>();
        // name index
        int b = 1;
        while(data.hasNext())
        {
            words.add(data.next());
        }
        int strength = 1000;
        
        for (int i = 0; i < words.size(); i += 2)
        {
        current = new Regiment(words.get(i), words.get(b), strength);
        b += 2; 
        strength -= 50;
        stalin.addRegiment(current);	
        } 
        
        for(int weeks = 1; weeks <= 20; weeks++)
        {
            System.out.println("Status Report for Week " + weeks + "!\n");
            stalin.addMenRegiment(100);
            
          if(weeks >= 2 )
          {
                stalin.removeRegiment(stalin.findLargestRegiment());
          }
          Regiment name = (Regiment)stalin.getPos(stalin.findLargestRegiment());
          
          if(weeks == 20)
            {
               System.out.println("After 20 weeks, the Elephants Regiment will "
                + "finally go to the frontline at the end of the week." + "\n");
            }
            else
            System.out.println("Regiment " + name.getName() + " will go to the "
                                 + "frontline at the end of the week." + "\n");
            stalin.printReport();
            
        System.out.println("The week ended. \n--------------------------"
                           + "---------------------");
        }
        System.out.println("\nAll Regiments have successfully gone to "
                          + "battlefield.");
   }
}