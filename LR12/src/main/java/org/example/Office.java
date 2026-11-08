package org.example;

public class Office extends Building{
    private String companies;
    Office(String name, int id, int floors, String companies){
        super(name, id, floors);
            this.companies = companies;
        }
    public String getCompanies(){return companies;}
    public void setCompanies(String companies){this.companies= companies;}
    @Override
    public String toString() {
        return super.toString() + ", companies=" + companies ;
    }
    /*8. Здания
Задание: Создайте “Map<String, Building>“ с названием как ключом, добавьте
3 Residential, 3 Office, 2 Hospital, выведите все ключи и значения.*/
}
