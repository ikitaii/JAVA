package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Music [] songs = new Music[6];
        songs[0]= new RockMusic("LIMIT","The Oral Cigarettes", 4.30);
        songs[1]= new RockMusic("In my room", "Julia Wolf", 2.43);
        songs[2]= new RockMusic("Скованные одной цепью","Nautilus Pompilius",4.17);
        songs[3]= new ClassicalMusic("Les rois du monde","Damien Sargue",3.25);
        songs[4]= new ClassicalMusic("The World We Knew","Frank Sinatra",2.47);
        songs[5]= new ClassicalMusic("Somebody That I Used To Know","Gotye",4.04);
        for (int i=0; i<6;i++){
            songs[i].play();
            songs[i].play(3);
            songs[i].play(songs[i].getDuration());
            System.out.println("__________________________");
        }

    }
     /*  Структура каждого задания:
            1. Базовый класс с:
            - 2-3 полями
- Конструктором
- Перегруженными методами (2-3 версии с разными параметрами)
- Методами, которые будут переопределены в наследниках
2. 2-3 производных класса с:
            - Дополнительными полями
- Переопределением методов родителя
- Собственными перегруженными методами
3. Тестовый класс с:
            - Демонстрацией перегрузки (вызов разных версий методов)
- Демонстрацией переопределения (полиморфные вызовы)
- Сравнением статического и динамического полиморфизма*/
}