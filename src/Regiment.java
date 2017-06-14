/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Regiment 
{   
    String number;      //The number for Regiment
    String name;        //The name of the Regiment
    int strength;       //The number of soldiers
    
    
    /**
     * A constructor for the Regiment
     * @param number The Regiment Number
     * @param name  The name of the Regiment
     * @param strength The amount of soldiers in a Regiment
     */
    public Regiment(String number, String name, int strength)
    {
        this.number = number;
        this.name = name;
        this.strength = strength;
    }
    
    /**
     * Gets the amount of soldiers in a Regiment
     * @return the number of soldiers
     */
    public int getSoldiers()
    {
        return strength;
    }
    
    /**
     * Gets the name of the Regiment
     * @return the name of the Regiment 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Adds soldiers to a Regiment
     * @param amount 
     */
    public void addMen(int amount)
    {
        this.strength += amount;    //adds amount entered to the soldier count
    }
}

