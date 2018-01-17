
import java.util.Scanner;

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
public class HealthyHeart {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        int theirAge;
        
        
        System.out.println("Hello There! What is your age ?");
        theirAge = inputReader.nextInt();
        
        int theirHB = (220-theirAge);
        System.out.println("Your max heart rate is : " + theirHB);
        
        
    
}
