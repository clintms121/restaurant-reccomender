package com.restaurantfinder.restaurant_reccomender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




import java.util.Scanner;

//backend logic for taking in userinput and fetching data from an API to find a restaurant
@SpringBootApplication
public class RestaurantReccomenderApplication {

	//test API
	public static void main(String[] args) {
		SpringApplication.run(RestaurantReccomenderApplication.class, args);

		Scanner sc = new Scanner(System.in);
		String state = sc.nextLine();
		String city = sc.nextLine();
		String food = sc.nextLine();
		Restaurant restaurant = new Restaurant(state, city, food);
		System.out.println(restaurant);

	}

}
