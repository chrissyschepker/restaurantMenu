package com.company;

import com.company.restaurant.Menu;
import com.company.restaurant.MenuItems;

public class Restaurant {

    public static void main(String[] args) {

        Menu menu = new Menu();

        //prints one particular menu item
        MenuItems myApp = menu.getMenuItem(1);
        System.out.println(myApp);

        //prints entire menu
        System.out.println(menu.toString());


    }
}





