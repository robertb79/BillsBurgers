package com.robbuican;

public class Burger {

    private String breadRollType;
    private String meat;
    private double baseBurgerPrice;

    private String addOne = "lettuce";
    private String addTwo = "tomato";
    private String addThree = "bacon";
    private String addFour = "cheese";

    private double addOnePrice;
    private double addTwoPrice;
    private double addThreePrice;
    private double addFourPrice;

    public Burger ( String breadRollType , String meat , double baseBurgerPrice ) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.baseBurgerPrice = baseBurgerPrice;
    }

    public String getBreadRollType () {
        return breadRollType;
    }

    public String getMeat () {
        return meat;
    }

    public double getBaseBurgerPrice () {
        return baseBurgerPrice;
    }

    public String getAddOne () {
        return addOne;
    }

    public String getAddTwo () {
        return addTwo;
    }

    public String getAddThree () {
        return addThree;
    }

    public String getAddFour () {
        return addFour;
    }

    public double getAddOnePrice () {
        return addOnePrice;
    }

    public double getAddTwoPrice () {
        return addTwoPrice;
    }

    public double getAddThreePrice () {
        return addThreePrice;
    }

    public double getAddFourPrice () {
        return addFourPrice;
    }
}

