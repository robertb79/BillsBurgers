package com.robbuican;

public class HealthyBurger extends Burger {

    private String addFive = "spinach";
    private String addSix = "quinoa";

    private double spinachPrice;
    private double quinoaPrice;

    public HealthyBurger ( String breadRollType , String meat , double baseBurgerPrice , String addFive , String addSix , double spinachPrice , double quinoaPrice ) {
        super(breadRollType , meat , baseBurgerPrice);
        this.addFive = addFive;
        this.addSix = addSix;
        this.spinachPrice = spinachPrice;
        this.quinoaPrice = quinoaPrice;
    }

    public String getAddFive () {
        return addFive;
    }

    public String getAddSix () {
        return addSix;
    }

    public double getSpinachPrice () {
        return spinachPrice;
    }

    public double getQuinoaPrice () {
        return quinoaPrice;
    }
}
