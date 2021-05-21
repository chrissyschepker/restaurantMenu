package com.company.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //fields
    private Date lastUpdated;
    private ArrayList<MenuItems> menuItems = new ArrayList<MenuItems>();

    //constructors
    public Menu() {
        populateMenu();
    }

    //getters and setters
    //returns a specific item
    public MenuItems getMenuItem(int index) {
        return menuItems.get(index);
    }

    public String getAllMenuItems(){

        String aMenu = " ";

        for (int i = 0; i < menuItems.size(); i++){
                MenuItems a = menuItems.get(i);
                //add name des price
                aMenu += "\n" + " " + a.toString() + "\n";
            }
            return aMenu;
        }

        //returns a specific appetizer

    /*
    public MenuItems getAppetizer(int index){
        return appetizers.get(index);
    }

    //returns all appetizers as a String
    public String getAllAppetizers(){
        String aMenu = " ";

        for (int i = 0; i < appetizers.size(); i++){
            MenuItems a = appetizers.get(i);
            //add name des price
            aMenu += "\n" + "A" + (i+1) + " " + a.toString() + "\n";
        }
        return aMenu;
    }

    //returns a specific main course
    public MenuItems getMainCourse(int index){
        return mainCourse.get(index);
    }

    //returns all main courses as a String
    public String getAllMainCourses(){
        String aMenu = " ";

        for (int i = 0; i < mainCourse.size(); i++){
            MenuItems a = mainCourse.get(i);
            //add name des price
            aMenu += "\n" + "M" + (i+1) + " " + a.toString() + "\n";
        }
        return aMenu;
    }

    //returns a specific dessert
    public MenuItems getDessert(int index){
        return dessert.get(index);
    }

    //returns all main courses as a String
    public String getAllDesserts(){
        String aMenu = " ";

        for (int i = 0; i < dessert.size(); i++){
            MenuItems a = dessert.get(i);
            //add name des price
            aMenu += "\n" + "D" + (i+1) + " " + a.toString() + "\n";
        }
        return aMenu;

*/

    //methods
    public void populateMenu(){

    //appetizers
    menuItems.add(new MenuItems("Nachos", 8.99, "Chicken or Beef Nachos", "Appetizer", true));
    menuItems.add(new MenuItems("Pretzel", 7.99, "Large Pretzel with Warm Beer Cheese", "Appetizer", false));
    menuItems.add(new MenuItems("Hot Wings", 9.99, "BBQ, Mild, Garlic Habanero", "Appetizer", false));

    //mainCourse
    menuItems.add(new MenuItems("Pizza", 14.99, "14' Pepperoni Pizza", "Main Course", false));
    menuItems.add(new MenuItems("Hamburger", 10.99, "Delicious Hamburger, you can add cheese for $1", "Main Course", true));
    menuItems.add(new MenuItems("Smoked Beef Brisket", 10.99, "On Bun with provel cheese. Served with Fries and BBQ Sauce", "Main Course", true));

    //dessert
    menuItems.add(new MenuItems("Ice Cream", 3.99, "Large Chocolate or Vanilla Sundae", "Dessert", false));
    menuItems.add(new MenuItems("Apple Pie", 2.99, "Large Slice Warm Apple Pie",  "Dessert", true));
    menuItems.add(new MenuItems("Chocolate Forest Cake", 3.99, "Large Slice Chocolate Cake with Chocolate Icing and " + "Chocolate Chunks", "Dessert", false));
    }


    //toString
    //prints out full menu in one string
    public String toString(){
        String menu = " ";
        menu += "CHRISSY'S BAR AND GRILL MENU\n" +
        "------------------------------------------- \n";
        menu += getAllMenuItems() + "\n";

        return menu;
    }

    public void addItem(MenuItems name) {

        for (int i = 0; i < menuItems.size(); i++) {
            menuItems.add(name);
            //add name des price
            //aMenu += "\n" + " " + a.toString() + "\n";
        }


        populateMenu();
    }

//dateUpdated

}






