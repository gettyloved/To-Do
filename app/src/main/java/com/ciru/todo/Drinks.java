package com.ciru.todo;

class Drinks {
    private String drink;
    private String desc;
    private int drinkID;


    public static final Drinks[] drinks = {
        new Drinks("Latte", "this is s description for Latte", R.drawable.latte),
        new Drinks("Cream", "this is a descrition for Cream", R.drawable.cream),
        new Drinks("Cappuccino", "this is a description for cappuccino", R.drawable.cap)
    };

    public Drinks(String drink, String desc, int drinkID) {
        this.drink = drink;
        this.desc = desc;
        this.drinkID = drinkID;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getDrinkID() {
        return drinkID;
    }

    public void setDrinkID(int drinkID) {
        this.drinkID = drinkID;
    }
}
