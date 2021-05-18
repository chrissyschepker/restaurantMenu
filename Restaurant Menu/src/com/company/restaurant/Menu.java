package com.company.restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItems> itemList;

    public Menu(Date lastUpdated, ArrayList<MenuItems> itemList) {
        this.lastUpdated = lastUpdated;
        this.itemList = itemList;
    }

    //getters and setters
    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public void setLastUpdated(Date aLastUpdated) {
        this.lastUpdated = aLastUpdated;
    }

    public ArrayList<MenuItems> getItemList() {
        return this.itemList;
    }

    public void setItemList(ArrayList<MenuItems> aItemList) {
        this.itemList = aItemList;
    }

}

//add method to print full menu

//add method to print single item




