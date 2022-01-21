package com.burguer;

public class Main {
    public static void main(String[] args) {
        Hamburguer burguer = new Hamburguer("Big Mac", "Normal", "Vegan");
        HealthyBurger healthyBurger = new HealthyBurger("Big Mac", "Normal", "Vegan");
        Ingredient lettuce = new Ingredient("Lettuce", 2);
        Ingredient tomato = new Ingredient("Tomato", 2);
        Ingredient cheese = new Ingredient("Cheese", 2);
        Ingredient onion = new Ingredient("Onion", 2);


        healthyBurger.addIngredient(lettuce);
        healthyBurger.addIngredient(tomato);
        healthyBurger.addIngredient(cheese);
        healthyBurger.addIngredient(onion);
        healthyBurger.addIngredient(onion);
        healthyBurger.addIngredient(onion);
        healthyBurger.addIngredient(onion);
        
        System.out.println(healthyBurger.getTotalPrice());

        //System.out.println(burguer.getTotalPrice());
        //System.out.println(healthyBurger.getTotalPrice());
        // System.out.println(burguer.addIngredient(lettuce));
    }
}
