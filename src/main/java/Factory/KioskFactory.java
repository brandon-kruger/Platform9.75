/*
Kiosk.java
Entity for Cinema
Author: Brandon Lee Kruger (216049245)
Date: 10 April 2022
* */
package Factory;

import za.ac.cput.entity.Kiosk;

public class KioskFactory {

        public static Kiosk createKiosk(String addonCode,String snack, String drink, String food, double SnackPrice, double drinkPrice, double FoodPrice, int addonQuantity)
        {
            return new Kiosk.Builder().setAddonCode(addonCode)
                    .setSnack(snack)
                    .setDrink(drink)
                    .setFood(food)
                    .setSnackPrice(SnackPrice)
                    .setDrinkPrice(drinkPrice)
                    .setFoodPrice(FoodPrice)
                    .setAddonQuantity(addonQuantity)
                    .build();

        }
    }
