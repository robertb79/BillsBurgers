package com.robbuican;

public class DeluxeBurger extends Burger {
    private String chips;
    private String drink;
    private double deluxeBurgerPrice;

    public DeluxeBurger ( String breadRollType , String meat , double baseBurgerPrice , String chips , String drink , double deluxeBurgerPrice ) {
        super(breadRollType , meat , baseBurgerPrice);
        this.chips = chips;
        this.drink = drink;
        this.deluxeBurgerPrice = deluxeBurgerPrice;
    }

    public double getDeluxeBurgerPrice () {
        return deluxeBurgerPrice;
    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }
}
