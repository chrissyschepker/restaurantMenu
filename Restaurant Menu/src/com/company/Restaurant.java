package com.company;

import com.company.restaurant.MenuItems;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String answer;
        String aName;

        System.out.println("What would you like to do? Type add, remove, or view menu as a response.");
        answer = input.nextLine();

        if (answer.toLowerCase().equals("add")) {
            System.out.println("What is the name of the Item you would like to add?");
            aName = input.nextLine();
            MenuItems.addItem(aName);
            //add item to array
        } else if (answer.toLowerCase().equals("remove")) {
            System.out.println("Which item would you like to remove?");
            aName = input.nextLine();
            MenuItems.removeItem(aName);
        } else {
            System.out.println("Would you like to view the full menu or single item?");
            answer = input.nextLine();

            if (answer.toLowerCase().equals("full menu")) {
                //print full menu;
            }
            else if (answer.toLowerCase().equals("single item")) {
                System.out.println("Which item would you like to view?");
                answer = input.nextLine();
                
            }
        }

        //some menu items
        MenuItems pizza = new MenuItems("Pizza", 14.99,
                "14' Pepperoni Pizza", "Main Course", false);

        MenuItems nachos = new MenuItems("Nachos", 8.99,
                "Chicken or Beef Nachos", "Appetizer", true);

        MenuItems iceCream = new MenuItems("Ice Cream", 3.99,
                "Large Chocolate or Vanilla Sundae", "Dessert", false);

        MenuItems hamburger = new MenuItems("Hamburger", 10.99,
                "Delicious Hamburger, you can add cheese for $1", "Main Course", true);

        MenuItems pretzel = new MenuItems("Pretzel", 7.99,
                "Large Pretzel with Warm Beer Cheese", "Appetizer", false);

        MenuItems applePie = new MenuItems("Apple Pie", 2.99,
                "Large Slice Warm Apple Pie",  "Dessert", true);
    }


        }



