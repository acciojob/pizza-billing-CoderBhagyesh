package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extraCheese;
    private Boolean extraTopping;
    private Boolean takeAway;
    private Boolean isBill = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.bill = "";
        this.extraTopping = false;
        this.extraCheese = false;
        this.takeAway = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (extraCheese==false) price += 80;
        this.extraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(extraTopping==false) price += isVeg==true? 70:120;
        this.extraTopping = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAway==false) price += 20;
        this.takeAway = true;
    }

    public String getBill(){
        // your code goes
        if(isBill==true) return "";

        bill += "Base Price of the Pizza: ";
        bill += isVeg? Integer.toString(300): Integer.toString(400);
        bill += "\n";
        bill += extraCheese?  "Extra Cheese Added: " + Integer.toString(80) : bill;
        bill += "\n";
        if(extraTopping) {
            bill += "Extra Toppings Added: ";
            if(isVeg) {
                bill += Integer.toString(70);
            } else {
                bill += Integer.toString(120);
            }
        }
        bill += "\n";
        bill += takeAway? "Paperbag Added: " + Integer.toString(20): bill;
        bill += "\n";
        bill += "Total Price: " + Integer.toString(price);
        isBill = true;
        return bill;
    }
}
