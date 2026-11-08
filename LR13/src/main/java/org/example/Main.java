package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Restaurant> restaurants = new ArrayList<>();
        try {
            restaurants.add(new Restaurant("gggg", "Белорусская", 5, 2, "ул. Пункина 1", 20));
            restaurants.add(new Restaurant("Ресторан2", "Французская", 4, 3, "пр. Неманская 24", 10));
            restaurants.add(new Restaurant("Ресторан3", "Японская", 3, 1, "ул. Налибоксккая 1", 100));
        } catch (InvalidRestaurantDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
        try {
            restaurants.get(1).bookTable(4);
            restaurants.get(2).bookTable(10);
        } catch (BookingException e) {
            System.out.println("Ошибка бронирования: " + e.getMessage());
        }
        try {
            restaurants.get(0).updateRating(9);
        } catch (InvalidRestaurantDataException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
       for (Restaurant r : restaurants) {
            System.out.println(r);
        }
    }
}