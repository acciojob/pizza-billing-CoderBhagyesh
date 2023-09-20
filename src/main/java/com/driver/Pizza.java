package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheese;
    private int topping;
    private int bag;
    private int baseprice;
    private boolean exchesse=false;
    private boolean extopping=false;
    private boolean exbag=false;

    boolean billgenrated=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg) {
            this.price=300;
            this.cheese=80;
            this.topping=70;
            this.baseprice=this.price;
        }else {
            this.price=400;
            this.cheese=80;
            this.topping=120;
            this.baseprice=this.price;
        }
        this.bag=20;

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(exchesse==false) {
            this.exchesse=true;
            this.price+=this.cheese;

        }


    }

    public void addExtraToppings(){
        // your code goes here
        if(extopping ==false ) {
            this.extopping=true;
            this.price+=this.topping;

        }

    }

    public void addTakeaway(){
        // your code goes here
        if(exbag==false){
            exbag=true;
            this.price+=this.bag;
        }
    }

    public String getBill(){
        // your code goes here
        if(billgenrated==false) {
            billgenrated=true;
            bill = "Base Price Of The Pizza: " + baseprice + "\n";
            if (exchesse) {
                bill += "Extra Cheese Added: " + cheese + "\n";
            }
            if (extopping) {
                bill += "Extra Toppings Added: " + topping + "\n";

            }
            if (exbag) {
                bill += "Paperbag Added: " + bag + "\n";
            }
            bill += "Total Price: " + this.price+"\n";
        }
        return this.bill;
    }
}