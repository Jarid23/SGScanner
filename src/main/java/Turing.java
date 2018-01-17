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
public class Turing {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        //Declare some variables and assign some
        String userName, userColor, userFruit;
        int userNumber;
        String botName = "Jaridius";
        String botColor ="Violet Red";
        String botFruit = "Robot Cat";
        int botNumber = -69;
        
        
        //Now the conversation
        System.out.println("Hello There!");
        System.out.println("What's your name ?");
        userName = inputReader.next();
        
        System.out.println("Hi, " + userName + " What's your favorite color ?" );
        userColor = inputReader.next();
        
        System.out.println("Huh, " + userColor + " My favorite color is " + botColor);
        
        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's your favoirte fruit," + userName + "?");
        userFruit = inputReader.next();
        
        System.out.println("Really? " + userFruit +"? That's wild");
        System.out.println("Speaking of favorites, what's your favorite number ? ");
        userNumber = inputReader.nextInt();
        
        int total = (userNumber*botNumber);
        System.out.println(userNumber + " is a cool number. My favorite number is " + botNumber);
        System.out.println("Did you know that " + userNumber + " times" + botNumber + " is " + (total));
        
        System.out.println("Well, thanks for talking to me "+ userName);
    }
}
