/*
Kiosk.java
Entity for Kiosk
Author: Brandon Lee Kruger (216049245)
Date: 10 April 2022
** */
package za.ac.cput.entity;

public class Kiosk {

    private String addonCode;
    private String drink;
    private String snack;
    private String food;
    private double drinkPrice;
    private double SnackPrice;
    private double FoodPrice;
    private int addonQuantity;

    private Kiosk(Builder builder){
        this.addonCode= builder.addonCode;
        this.drink= builder.drink;
        this.snack= builder.snack;
        this.food= builder.food;
        this.drinkPrice = builder.drinkPrice;
        this.SnackPrice = builder.SnackPrice;
        this.FoodPrice = builder.FoodPrice;
        this.addonQuantity = builder.addonQuantity;
    }

    public String getAddonCode() {
        return addonCode;
    }

    public void setAddonCode(String addonCode) {
        this.addonCode = addonCode;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }

    public void setDrinkPrice(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    public double getSnackPrice() {
        return SnackPrice;
    }

    public void setSnackPrice(double snackPrice) {
        SnackPrice = snackPrice;
    }

    public double getFoodPrice() {
        return FoodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        FoodPrice = foodPrice;
    }

    public int getAddonQuantity() {
        return addonQuantity;
    }

    public void setAddonQuantity(int addonQuantity) {
        this.addonQuantity = addonQuantity;
    }

    @Override
    public String toString() {
        return "Kiosk{" +
                "addonCode='" + addonCode + '\'' +
                ", drink='" + drink + '\'' +
                ", snack='" + snack + '\'' +
                ", food='" + food + '\'' +
                ", drinkPrice=" + drinkPrice +
                ", SnackPrice=" + SnackPrice +
                ", FoodPrice=" + FoodPrice +
                ", addonQuantity=" + addonQuantity +
                '}';
    }
    public static class Builder {

        private String addonCode;
        private String drink;
        private String snack;
        private String food;
        private double drinkPrice;
        private double SnackPrice;
        private double FoodPrice;
        private int addonQuantity;

        public Builder setAddonCode(String addonCode) {
            this.addonCode = addonCode;
            return this;
        }

        public Builder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Builder setSnack(String snack) {
            this.snack = snack;
            return this;
        }

        public Builder setFood(String food) {
            this.food = food;
            return this;
        }

        public Builder setDrinkPrice(double drinkPrice) {
            this.drinkPrice = drinkPrice;
            return this;
        }

        public Builder setSnackPrice(double snackPrice) {
            SnackPrice = snackPrice;
            return this;
        }

        public Builder setFoodPrice(double foodPrice) {
            FoodPrice = foodPrice;
            return this;
        }

        public Builder setAddonQuantity(int addonQuantity) {
            this.addonQuantity = addonQuantity;
            return this;
        }

        public Kiosk build(){return new Kiosk(this);}

    }
}


