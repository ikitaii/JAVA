package org.example;

public class Building {
    /*8. Здания
    Базовый класс: “Building”
            - Поля: “name”, “id”, “floors”
    Наследники:
            1. “Residential” – поле: “apartments”
            2. “Office” – поле: “companies”
            3. “Hospital” – поле: “departments”
Задание: Создайте “Map<String, Building>“ с названием как ключом, добавьте
3 Residential, 3 Office, 2 Hospital, выведите все ключи и значения.*/
    private String name;
    private int id;
    private int floors;
    Building(String name, int id, int floors){
        this.name=name;
        this.id= id;
        this.floors = floors;
    }
    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
    public int getFloors(){return floors;}
    public void setFloors(int floors){this.floors=floors;}
    @Override
    public String toString(){
        return getClass().getSimpleName()+ " : " + "name='" + name + "', id=" + id + ", floors=" + floors;   }
}
