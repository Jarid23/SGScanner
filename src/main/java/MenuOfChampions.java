/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jarid
 */
public class MenuOfChampions {
    
    public static void main(String[] args) {
        //Declare Variables
        String item1, item2, item3;
        int price1, price2, price3;
        
        //Assign some value to those variables
        item1 = "Pizza";
        item2 = "Cheeseburger";
        item3 = "Expensive Salad";
        price1 = 5;
        price2 = 6;
        price3 = 10000;
        
        System.out.println("Welcome to restaraunte De Jaria !");
        System.out.println("Here is tonight's menu (the Menu of Champions : ");
        
        System.out.println(item1 + ": $" + price1);
        System.out.println(item2 + ": $" + price2);
        System.out.println(item3 + ": $" + price3);
    }
}
