package org.example;

public class Restaurant {
    /* 8. Ресторан
        Сущность: “Restaurant”
        - Поля: “name”, “cuisine”, “rating”, “priceLevel”, “address”
        - Конструктор с проверкой: рейтинг 1-5, уровень цен 1-3
        Исключения:
        - “InvalidRestaurantDataException” – неверные данные
        - “RestaurantNotFoundException” – ресторан не найден
                - “BookingException” – ошибка бронирования
        Методы:
        - “bookTable(int persons)” – бронирование столика
        - “updateRating(int newRating)” – обновление рейтинга
        Задание: Создайте список ресторанов, выполните операции бронирования.    */
    private String name;
    private String cuisine;
    private int rating;
    private int priceLevel;
    private String address;
    private int seats;
    public Restaurant(String name, String cuisine, int rating, int priceLevel, String address, int seats)
         throws InvalidRestaurantDataException {
            setName(name);
            setCuisine(cuisine);
            setRating(rating);
            setPriceLevel(priceLevel);
            setAddress(address);
            setSeets(seats);
    }
    public String getName (){return name;}
    public void setName(String name){
        if (name == null || name.isBlank()) {
            throw new InvalidRestaurantDataException("Название не может быть пустым");
        }
        this.name = name;}
    public String getCuisine(){return cuisine;}
    public void setCuisine(String cuisine){this.cuisine = cuisine;}
    public int getRating (){return rating;}
    public void setRating(int rating){
        if (rating < 1 || rating > 5) {
            throw new InvalidRestaurantDataException(
                    "Рейтинг должен быть от 1 до 5, получено: " + rating);
        }
        this.rating=rating; }
    public int getPriceLevel(){return priceLevel;}
    public void setPriceLevel(int priceLevel){
        if (priceLevel < 1 || priceLevel > 3) {
            throw new InvalidRestaurantDataException(
                    "Уровень цен должен быть от 1 до 3, получено: " + priceLevel);
        }
        this.priceLevel = priceLevel;}
    public String getAddress(){return address;}
    public void  setAddress(String address){this.address = address;}
    public int getSeets(){return seats;}
    public void setSeets(int seets){
        if (seats < 0) {
            throw new InvalidRestaurantDataException("Количество мест не может быть < 0");
        }
        this.seats=seets;}
    public void bookTable(int person){
        if(this.seats - person <=0){
            throw new BookingException("Бронирование невозможно из за нехватки мест",person,seats);
        }
        else {
            System.out.println("Бронирование успешно оформлено");
        }
    }
    public void updateRating(int newRating){
        if(newRating>=1&&newRating<=5) {
            this.rating = newRating;
            System.out.println("Рейтинг заведения обновлен, новый рейтинг : " + rating);
        }
        else{
            throw new InvalidRestaurantDataException("Рейтиг должен быть от 1 до 5");
        }
    }
    @Override
    public String toString() {
        return name + " (" + cuisine + "), рейтинг: " + rating
                + ", цены: " + priceLevel + ", мест: " + seats
                + ", адрес: " + address;
    }
}
