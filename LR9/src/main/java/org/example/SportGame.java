package org.example;

public abstract class SportGame {
    /*8. Спортивные игры
    Абстрактный класс: “SportGame”
            - Поля: “name” (название), “players” (игроки), “duration” (длительность)
            - Абстрактные методы: “getRules()” (правила), “getScore()” (способ подсчета
    очков)
            - Конкретный метод: “displayInfo()”
    Конкретные классы:
            1. “Football” – добавляет поле “goals” (голы)
            - “getRules()” → "2 тайма по 45 минут"
            - “getScore()” → "Гол = 1 очко"
            2. “Basketball” – добавляет поле “quarters” (четверти)
            - “getRules()” → "4 четверти по 10 минут"
            - “getScore()” → "Бросок = 2 или 3 очка"
    Задание: Создайте 3 футбольных и 2 баскетбольных матча, выведите правила.*/
    private String name;
    private int players;
    private int duration;
    SportGame(String name, int players, int duration){
        this.name = name;
        this.players = players;
        this.duration = duration;
    }
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public int getPlayers(){return players;}
    public void setPlayers(int players){this.players=players;}
    public int getDuration (){return duration;}
    public void setDuration(int duration){this.duration = duration;}
    public abstract String getRules();
    public abstract String getScore();
    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Игроков: " + players);
        System.out.println("Длительность: " + duration + " мин");
    }
}
