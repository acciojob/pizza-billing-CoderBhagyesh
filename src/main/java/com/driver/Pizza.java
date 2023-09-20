package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean extraCheese;
    private Boolean extraTopping;
    private Boolean takeAway;
    private Boolean pizza = false;

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
        if(pizza==true) return "";

        this.bill += "Base Price of the Pizza: ";
        this.bill += isVeg? Integer.toString(300): Integer.toString(400);
        this.bill += "\n";
        this.bill += extraCheese?  "Extra Cheese Added: " + Integer.toString(80) : bill;
        this.bill += "\n";
        if(extraTopping) {
            this.bill += "Extra Toppings Added: ";
            if(isVeg) {
                this.bill += Integer.toString(70);
            } else {
                this.bill += Integer.toString(120);
            }
        }
        this.bill += "\n";
        this.bill += takeAway? "Paperbag Added: " + Integer.toString(20): bill;
        this.bill += "\n";
        this.bill += "Total Price: " + Integer.toString(price);
        return this.bill;
    }
}
