/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jarid
 */
import java.util.Scanner;
public class MadLibs {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        String noun1, adjective1, noun2, adjective2, pluralnoun1, pluralnoun2, pluralnoun3, presentverb, pastverb;
        int number1;
        
        System.out.println("Please Enter a noun : ");
        noun1 = inputReader.next();
        
        System.out.println("Please Enter an adjective : ");
        adjective1 = inputReader.next();
        
        System.out.println("Please Enter a noun : ");
        noun2 = inputReader.next();
        
        System.out.println("Please Enter a number : ");
        number1 = inputReader.nextInt();
        
        System.out.println("Please Enter a adjective : ");
        adjective2 = inputReader.next();
        
        System.out.println("Please Enter a plural noun : ");
        pluralnoun1 = inputReader.next();
        
        System.out.println("Please Enter a plural noun : ");
        pluralnoun2 = inputReader.next();
        
        System.out.println("Please Enter a plural noun : ");
        pluralnoun3 = inputReader.next();
        
        System.out.println("Please Enter a present verb : ");
        presentverb = inputReader.next();
        
        System.out.println("Please Enter the same verb but past tense : ");
        pastverb = inputReader.next();
        
        System.out.println("Now let's go Mad Libs");
        
        System.out.println(noun1 + ": the " + adjective1 +" frontier. These are the voyages of the starship " + noun2 + ". ");
        System.out.println("Its " + number1 + "-year mission: to explore strange " + adjective2 + " " + pluralnoun1 + ", to seek out " + adjective2 + " " + pluralnoun2);
        System.out.println("and " + adjective2 + " " + pluralnoun3 +", to boldly " + presentverb + " where no one has " + pastverb + " before.");

    }
}
