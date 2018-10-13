package com.robbuican;

public class DeluxeBurger extends Burger {
    private String extraOne = "chips";
    private String extraTwo = "drink";
    private double deluxeBurgerPrice;

    public DeluxeBurger ( String breadRollType , String meat , double baseBurgerPrice , String extraOne , String extraTwo , double deluxeBurgerPrice ) {
        super(breadRollType , meat , baseBurgerPrice);
        this.extraOne = extraOne;
        this.extraTwo = extraTwo;
        this.deluxeBurgerPrice = deluxeBurgerPrice;
    }

    public String getExtraOne () {
        return extraOne;
    }

    public String getExtraTwo () {
        return extraTwo;
    }

    public double getDeluxeBurgerPrice () {
        return deluxeBurgerPrice;
    }
}
