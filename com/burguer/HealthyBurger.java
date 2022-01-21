package com.burguer;

public class HealthyBurger extends Hamburguer {
    public HealthyBurger(String name, String breadRollType, String meat) {
        super(name, "Brown rye bread", meat);
        //this.addIngredient(ingredient);
        setMaxIngredients(6);
        setTotalPrice(8);
    }    

    @Override
    public void setMaxIngredients(int maxIngredients) {
        this.maxIngredients = maxIngredients;
    }

    @Override
    public void setTotalPrice(int totalPrice) {
        super.setTotalPrice(totalPrice);
    }
}
