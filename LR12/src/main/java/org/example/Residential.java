package org.example;

public class Residential extends Building {
    /*8. Здания
    Базовый класс: “Building”
            - Поля: “name”, “id”, “floors”
    Наследники:
            1. “Residential” – поле: “apartments”
            2. “Office” – поле: “companies”
            3. “Hospital” – поле: “departments”
Задание: Создайте “Map<String, Building>“ с названием как ключом, добавьте
3 Residential, 3 Office, 2 Hospital, выведите все ключи и значения.*/
    private int apartments;
    Residential(String name, int id, int floors, int apartments){
        super(name, id, floors);
        this.apartments = apartments;
    }
    public int getApartments(){return apartments;}
    public void setApartments(int apartments){this.apartments = apartments;}
    @Override
    public String toString() {
        return super.toString() + ", apartments=" + apartments ;
    }
}
