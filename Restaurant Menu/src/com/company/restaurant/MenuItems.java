package com.company.restaurant;


public class MenuItems {
    private Double price;
    private String description;
    private String category;
    private boolean isNew;

public MenuItems(Double price, String description, String category, boolean isNew){
    this.price = price;
    this.description = description;
    this.category = category;
    if (isNew) this.isNew = true;
    else this.isNew = false;
}

}
