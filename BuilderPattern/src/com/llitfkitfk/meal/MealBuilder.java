package com.llitfkitfk.meal;

import com.llitfkitfk.burger.ChickenBurger;
import com.llitfkitfk.burger.VegBurger;
import com.llitfkitfk.drink.Coke;
import com.llitfkitfk.drink.Pepsi;

public class MealBuilder {
	
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		
		return meal;
	}
	
	public Meal prepareChickenMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		
		return meal;
	}
}
