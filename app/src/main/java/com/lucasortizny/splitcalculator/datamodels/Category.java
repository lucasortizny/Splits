package com.lucasortizny.splitcalculator.datamodels;

/**
 *  This class is going to represent a category from an individual game.
 */
public class Category extends Game {
    public String categoryName = "DNE";
    public String categoryDescription = ""; //optional

    public Category(){}

    public Category(String categoryName, String categoryDescription) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public Category(String gameName, String platform, String categoryName, String categoryDescription) {
        super(gameName, platform);
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public Category(String gameName, String categoryName, String categoryDescription) {
        super(gameName);
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
}
