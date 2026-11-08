package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        Triangle t1 = new Triangle();
        t1.sideA = 12;
        t1.sideB = 10;
        t1.sideC = 5;
        t1.isValid();
        t1.perimert();
      //  t1.toString();
        System.out.println(t1);
        System.out.println("task2");
        Flat[] arr = new Flat[6];
        arr[0] = new Flat("qwertyu", 3, 120000);
        arr[1] = new Flat("qwertyu", 1, 12000);
        arr[2] = new Flat("qwertyu", 5, 124000);
        arr[3] = new Flat("qwertyu", 2, 120230);
        arr[4] = new Flat("qwertyu", 1, 155550);
        arr[5] = new Flat("qwertyu", 4, 200000);
        Flat MaxRom = arr[0];
        Flat MaxPrice = arr[0];
        int rmInd = 0;
        int prInd = 0;
        for (int i = 0; i < 6; i++) {
            if (MaxRom.rooms < arr[i].rooms) {
                MaxRom.rooms = arr[i].rooms;
                rmInd = i;
            }
            if (MaxPrice.price < arr[i].price) {
                MaxPrice.price = arr[i].price;
                prInd = i;
            }
        }
        System.out.println("Больше всего комнат");
        arr[rmInd].outputInfo();
        System.out.println("Самая дорогая кв");
        arr[prInd].outputInfo();
        System.out.println("task3 ");
        Person[] arr2 = new Person[5];
        arr2[0] = new Person("Иван", Gender.MALE);
        arr2[1] = new Person("Петр", Gender.MALE);
        arr2[2] = new Person("Алексей", Gender.MALE);
        arr2[3] = new Person("Анна", Gender.FEMALE);
        arr2[4] = new Person("Мария", Gender.FEMALE);
        for (int i = 0; i < 5; i++) {
            if (arr2[i].gender == Gender.FEMALE) {
                arr2[i].outputInfo();
            }
        }
    }
}