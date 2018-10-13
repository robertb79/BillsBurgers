package com.robbuican;

public class HealthyBurger extends Burger {

    private String spinach;
    private String quinoa;

    private double spinachPrice = 0.5;
    private double quinoaPrice = 1;

    public HealthyBurger ( String meat , long baseBurgerPrice , String spinach , String quinoa , double spinachPrice , double quinoaPrice ) {
        super("brown rye roll" , meat , baseBurgerPrice);
        this.spinach = spinach;
        this.quinoa = quinoa;
        this.spinachPrice = spinachPrice;
        this.quinoaPrice = quinoaPrice;
    }

    public String getSpinach() {
        return spinach;
    }

    public String getQuinoa () {
        return quinoa;
    }

    public double getSpinachPrice() {
        return spinachPrice;
    }

    public double getChinoaPrice() {
        return quinoaPrice;
    }


}
