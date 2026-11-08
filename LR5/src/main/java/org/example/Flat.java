package org.example;

/*8. Класс "Квартира" (address: String, rooms: int, price: double). Создать
массив из 6 квартир. Найти квартиру с максимальным количеством комнат и
самую дорогую квартиру.*/
class Flat {
    String adress = new String();
    int rooms;
    double price;

    Flat() {
    }

    public Flat(String address, int rooms, double price) {
        this.adress = address;
        this.rooms = rooms;
        this.price = price;
    }

    public String GetAdress() {
        return adress;
    }

    public void SetAdress(String adress) {
        this.adress = adress;
    }

    public int GetRooms() {
        return rooms;
    }

    public void SetRooms(int rooms) {
        this.rooms = rooms;
    }

    public Double GetPrice() {
        return price;
    }

    public void SetPrice(double price) {
        this.price = price;
    }

    public void outputInfo() {
        System.out.println(adress + " " + rooms + " " + price);
    }
}
