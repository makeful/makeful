package com.example.android.makeful;

/**
 * Created by ashley on 5/30/15.
 */
public class Ingredient extends Node {
    public String name;
    public double amount;
    public String unit;
    public String specialState;

    public Ingredient(String n, double amt, String unitType){
        name = n;
        amount = amt;
        unit = unitType;
        specialState = "";
    }

    public Ingredient(String n, double amt, String unitType, String state){
        name = n;
        amount = amt;
        unit = unitType;
        specialState = state;
    }
}
