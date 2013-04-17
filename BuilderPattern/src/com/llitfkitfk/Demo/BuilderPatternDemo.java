package com.llitfkitfk.Demo;

import com.llitfkitfk.meal.Meal;
import com.llitfkitfk.meal.MealBuilder;

public class BuilderPatternDemo {
	public static void main (String[] args) {
		
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal meal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal: ");
		meal.showItems();
		System.out.println("Total cost: " + meal.getCost());
		
		Meal meal1 = mealBuilder.prepareChickenMeal();
		System.out.println("Chicken Meal: ");
		meal1.showItems();
		System.out.println("Total cost: " + meal1.getCost());
		
		
	}
}
