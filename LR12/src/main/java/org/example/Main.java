package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    private static void add(Map<String, Building> map, Building b) {
        map.put(b.getName(), b);
    }

    public static void main(String[] args) {
        Map<String, Building> buildings = new LinkedHashMap<>();

            add(buildings, new Residential("Название 3", 1, 16, 120));
            add(buildings, new Residential("Название 1", 2, 9, 54));
            add(buildings, new Residential("Название 3", 3, 12, 88));

            add(buildings, new Office("Название 1", 4, 20, "компания 1"));
            add(buildings, new Office("Название 2", 5, 14, "компания 1"));
            add(buildings, new Office("Название 2", 6, 8, "компания 1"));

            add(buildings, new Hospital("Название 4", 7, 6, "Название депортамента 1"));
            add(buildings, new Hospital("Название 5", 8, 5, "Название депортамента 3"));

            System.out.println("Ключи : ");
            for (String key : buildings.keySet()) {
                System.out.println(key);
            }

            System.out.println("Значения : ");
            for (Building b : buildings.values()) {
                System.out.println(b);
            }

            System.out.println("Ключ - Значение : ");
            for (Map.Entry<String, Building> e : buildings.entrySet()) {
                System.out.println(e.getKey() + " : " + e.getValue());
            }
    }
}