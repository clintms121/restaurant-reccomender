package com.restaurantfinder.restaurant_reccomender;

public class Restaurant {

    String state;
    String city;
    String food;

    //Create Restaurant Entity
    public Restaurant (String state, String city, String food) {
        this.state = state;
        this.city = city;
        this.food = food;
    }
}
