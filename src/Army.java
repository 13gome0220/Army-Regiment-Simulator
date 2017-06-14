/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose
 */
import java.util.ArrayList;

public class Army 
{
    private ArrayList general;     //declares Array List
    
    /**
     * Creates an Array List to use when a "Army" object is created
     */
    public Army()
    {
        //Makes general bounded only to Regiment objects
        general = new ArrayList<Regiment>();  
    }
    
    /**
     * Add Regiment to the Array List
     * @param chosen Picks a Regiment 
     */
    public void addRegiment(Regiment chosen)
    {
        general.add(chosen);  //adds regiment chosen to list
    }
    
    /**
     * Removes a Regiment at the index in the Array List 
     * @param gomez118 is the index specified
     */
    public void removeRegiment(int gomez118) 
    {
        general.remove(gomez118);    // removes the Regiment
    }
    
    /**
     * Adds soldiers to every Regiment
     * @param amount the amount of men added
     */
    public void addMenRegiment(int amount)
    {
        //Moves through the Array List
        for(int i=0; i < general.size(); i++)
        {
           //get the Regiment at index
           Regiment position = (Regiment)general.get(i); 
           
           //Exception: Regiment Elephants gets 30 soldiers only
           if(position.getName().equalsIgnoreCase("Elephants"))
           {
               position.addMen(30);
           }
           else 
           //All Regiments get the amount of soldiers specified
           position.addMen(amount); 
        }
    }
    
    /**
     * Get a Regiment at a position
     * @param position selects the position in the Army
     * @return 
     */
    public Regiment getPos(int position)
    {
      //returns Regiment at position
      return (Regiment)general.get(position);
    }
    
    /**
     * Finds the position of the Regiment with the most soldiers
     * @return the position of the largest Regiment
     */
    public int findLargestRegiment()
    {
        //Gets the Regiment at the first position
        Regiment largestRegiment = (Regiment)general.get(0);
        int pos=0;      //Initializes the position of the largest Regiment
        
        //Moves through the Array List
        for(int i = 1 ; i < general.size() ; i++)
        {
            //current gets the Regiment at index in the Array List
            Regiment current = (Regiment)general.get(i);
        //Checks if the Regiment at current index is larger than the first index
            if(largestRegiment.getSoldiers() < current.getSoldiers() )
            {
                largestRegiment = current; 
                pos = i;
            }
        }
        //returns the position of the largest Regiment in the Arry List   
        return pos;   
    }
    
    /**
     * Prints out the report for every Regiment
     * It includes the number, name, and amount of soldiers in all the Regiments
     */
    public void printReport()
    {
        //Moves through the Array List
        for(int i = 0 ; i < general.size() ; i++)
        {
            Regiment current = (Regiment)general.get(i);
      
            System.out.println("Regiment number: " + current.number);
            System.out.println("Regiment Name: " + current.getName());
            System.out.println("Number of Soldiers: " + current.getSoldiers());
            System.out.println("");
        }
    }
} 

   

