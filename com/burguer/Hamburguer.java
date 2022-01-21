package com.burguer;

public class Hamburguer {
    private String name;
    private String breadRollType;
    private String meat;
    private int totalPrice;
    protected int maxIngredients;
    private int currentIngredients = 0;

    public Hamburguer(String name, String breadRollType, String meat) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.totalPrice = 5;
        this.maxIngredients = 4;
    }

    public void addIngredient(Ingredient ingredient) {
        if (this.currentIngredients < this.maxIngredients) {
            this.totalPrice = totalPrice + ingredient.getPrice();
            System.out.println("Added new ingredient for " + ingredient.getPrice() + ". Total: " + totalPrice);
            this.currentIngredients++;
        } else {
            System.out.println("Cannot add more ingredients. Total: " + totalPrice);
        }
    }

    public int getMaxIngredients() {
        return this.maxIngredients;
    }

    public void setMaxIngredients(int maxIngredients) {
        this.maxIngredients = maxIngredients;
    }

    public int getCurrentIngredients() {
        return this.currentIngredients;
    }

    public void setCurrentIngredients(int currentIngredients) {
        this.currentIngredients = currentIngredients;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreadRollType() {
        return this.breadRollType;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public String getMeat() {
        return this.meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public int getTotalPrice() {
        return this.totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

}
