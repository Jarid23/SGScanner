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
public class BestAdderEver {
    
    public static void main(String[] args) {
    int firstnumber ;
    int secondnumber ;
    int thirdnumber ;
    
    Scanner inputReader = new Scanner(System.in);
    
    System.out.println("Give me that first number : ");
    firstnumber = inputReader.nextInt();
    
    System.out.println("Give me that second number: ");
    secondnumber = inputReader.nextInt();
    
    System.out.println("Give me that third number : ");
    thirdnumber = inputReader.nextInt();
    
    System.out.println("The first number is : " + (firstnumber));
    System.out.println("The second number is : " + (secondnumber));
    System.out.println("The third number is : " + (thirdnumber));
    System.out.println("The total is : " + (firstnumber + secondnumber + thirdnumber));
    System.out.println("Let's print that a 2nd time : " + (firstnumber + secondnumber + thirdnumber));
    
}
}