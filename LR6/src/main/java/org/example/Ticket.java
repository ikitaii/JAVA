package org.example;
/*8. Класс “Билет” (Ticket): Поля: “event”, “seatNumber”, “price”.
Конструктор. Геттеры. Метод “applyDiscount()”. В “main” создать билет и
применить скидку.*/
public class Ticket {
String event;
int seatNumber;
double price;
Ticket(){}
Ticket(String event, int seatNumber,double price){
    this.event = event;
    this.seatNumber = seatNumber;
    this.price = price;
}
public String getEvent(){return event;}
public void setEvent(String event){this.event=event;}
public int getSeatNumber (){return seatNumber;}
public void setSeatNumber(int seatNumber){this.seatNumber=seatNumber;}
public double getPrice(){return price;}
public void setPrice(double price){this.price=price;}
void infoTicket(){
    System.out.println("Билет : "+ event+" "+ seatNumber+ " "+ price);
}
void applyDiscount(){
    System.out.println("Цена со скидкой : "+(Math.round(price = price*0.8))+" р. ");
}
}

