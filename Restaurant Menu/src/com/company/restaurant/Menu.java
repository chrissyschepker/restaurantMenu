package com.company.restaurant;

import java.util.Date;

public class Menu {
    private String appetizer;
    private String mainCourse;
    private String dessert;
    private Date lastUpdated;

public Menu(String appetizer, String mainCourse,
            String dessert, Date lastUpdated){
    this.appetizer = appetizer;
    this.mainCourse = mainCourse;
    this.dessert = dessert;
    this.lastUpdated = lastUpdated;
}
}
