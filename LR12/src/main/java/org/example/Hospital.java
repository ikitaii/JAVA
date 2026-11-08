package org.example;

public class Hospital extends Building {
    private String departments;
    Hospital(String name, int id, int floors, String departments){
        super(name, id, floors);
        this.departments = departments;
    }
    public String getDepartments(){return departments;}
    public void setDepartments(String departments){this.departments= departments;}
    @Override
    public String toString() {
        return super.toString() + ", departments=" + departments ;
    }
    /*8. Здания
    Базовый класс: “Building”
            - Поля: “name”, “id”, “floors”
    Наследники:
            1. “Residential” – поле: “apartments”
            2. “Office” – поле: “companies”
            3. “Hospital” – поле: “departments”
Задание: Создайте “Map<String, Building>“ с названием как ключом, добавьте
3 Residential, 3 Office, 2 Hospital, выведите все ключи и значения.*/
}
