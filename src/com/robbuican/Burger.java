package com.robbuican;

public class Burger {

    private String breadRollType;
    private String meat;
    private double baseBurgerPrice;

    private String lettuce;
    private String tomato;
    private String bacon;
    private String chesse;

    private double lettucePrice = 0.5;
    private double tomatoPrice = 0.5;
    private double baconPrice = 1;
    private double chessePrice = 1;

    public Burger(String breadRollType, String meat, double baseBurgerPrice) {
    }


    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBaseBurgerPrice() {
        return baseBurgerPrice;
    }

    public String getLettuce() {
        return lettuce;
    }

    public String getTomato() {
        return tomato;
    }

    public String getBacon() {
        return bacon;
    }

    public String getChesse() {
        return chesse;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getBaconPrice() {
        return baconPrice;
    }

    public double getChessePrice() {
        return chessePrice;
    }
}
