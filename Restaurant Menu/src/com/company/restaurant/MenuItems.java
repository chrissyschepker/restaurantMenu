package com.company.restaurant;

import java.util.Objects;

public class MenuItems {

    //fields
    private String name;
    private String description;
    private String category;
    private Double price;
    private boolean isNew;

    //constructors
    public MenuItems(String name, Double price, String description, String category, boolean aIsNew) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.isNew = true;
    }


    //getters and setters
    public String getName() { return this.name; }

    public void setName(String aName) { this.name = aName; }

    public String getDescription() { return this.description; }

    public void setDescription(String aDescription) { this.description = aDescription; }

    public String getCategory() { return this.category; }

    public void setCategory(String aCategory) { this.category = aCategory; }

    public double getPrice() { return this.price; }

    public void setPrice(double aPrice) { this.price = aPrice; }

    public boolean getIsNew() { return this.isNew; }

    public void setIsNew(boolean aIsNew) { this.isNew = aIsNew; }


    //toString

    public String toString() {
        if (isNew = true) {


           return "Hot NEW Item!" + "\n" + category + "\n" + name + "\t" + "$" + price + "\n" + description + "\n";

        } else {

            return "\n" + category + "\n" + name + "\t" + "$" + price + "\n" + description + "\n";
        }
    }


    //add method to add menu item to array list
    public static void addItem(String name, Double price, String description, String category, boolean aIsNew){
        //MenuItems +=

    }

    //add method to remove menu item from list
    public static void removeItem(String aItemName){

    }

    //add method to determine if two menu items are equal
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItems menuItems = (MenuItems) o;
        return Objects.equals(getName(), menuItems.getName());
    }


    //add method to tell if item is new, maybe:
    public void newItem() {
        if (this.isNew == true) {
           System.out.println("Hot NEW Item!");
        }


    }
}