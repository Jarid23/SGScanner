
import com.sun.org.apache.xpath.internal.operations.Bool;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jarid
 */
public class AllAboutMe {
    
    public static void main(String[] args) {
        //These variables should have data that stores your name, your favorite food, 
        //how many pets you have, if you have ever eaten gnocchi, and the age when you learned to whistle.
        
        //DECALRE
        String myname;
        String favoriteFood;
        int pets;
        Boolean eatGnocchi;
        int whistleAge;
        
        //GIVE VALUES
        myname = "Jarid Wagner";
        favoriteFood = "Steak";
        pets = 0;
        eatGnocchi = false;
        whistleAge = 100;
        
        System.out.println("My name is : " + myname);
        System.out.println("My favorite food is : " + favoriteFood);
        System.out.println("I got this many pets : " + pets);
        System.out.println("Is it true or false that I've eaten Gnocchi : " + eatGnocchi);
        System.out.println(whistleAge + " That's how old I was when I learned to whistle");
    }
}
