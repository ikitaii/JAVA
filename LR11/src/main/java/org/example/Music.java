package org.example;

public class Music {
    /*8. Музыка
    Базовый класс: “Music”
            - Поля: “title”, “artist”, “duration”
            - Перегруженные методы:
            - “play()” → "Играет музыка"
            - “play(int repeat)” → "Играет " + repeat + " раз"
            - “play(double speed)” → "Играет со скоростью " + speed
- Метод для переопределения: “getGenre()” → "Неизвестный жанр"
    Производные классы:
            1. “RockMusic” – переопределяет “getGenre()” → "Рок"
            2. “ClassicalMusic” – переопределяет “getGenre()” → "Классика"
    Задание: Создайте музыкальные композиции, продемонстрируйте перегрузку.
*/
    private String title;
    private String artist;
    private double duration;
    Music(String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public String getTitle (){return title;}
    public void setTitle(String title){this.title = title;}
    public String getArtist(){return artist;}
    public void setArtist(String artist){this.artist = artist;}
    public double getDuration(){return duration;}
    public void setDuration(double duration){this.duration=duration;}
    public void play(){
        System.out.println("Музыка играет");
        System.out.println("Название : "+getTitle()+" Исполнитель : "+getArtist()+" Длительность : "+ getDuration());

    }
    public void play (int repeat){
        if(repeat ==1||repeat >4){
            System.out.println("Музыка играет "+repeat+" раз");
        }
        else {
            System.out.println("Музыка играет "+repeat+" разa");
        }
    }
    public void play (double speed){
        System.out.println("Музыка играет на скорости "+speed+" x");
    }
    public void getGenrE(){
        System.out.println("Жанр неизвестен");
    }
}