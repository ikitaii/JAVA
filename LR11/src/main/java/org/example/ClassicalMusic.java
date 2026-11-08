package org.example;

public class ClassicalMusic extends Music{
    private String genre;
    ClassicalMusic(String title, String artist, double duration){
        super(title, artist, duration);
        this.genre = "Классическая";
    }
    public String getGenre (){return genre;}
    public void setGenre(String genre){this.genre=genre;}
    @Override
    public void getGenrE(){
        System.out.println("Жанр : "+ genre);
    }
    @Override
    public void play(){
        System.out.println("Музыка играет(Классика)");
        System.out.println("Название : "+getTitle()+" Исполнитель : "+getArtist()+" Длительность : "+ getDuration());
    }
    @Override
    public void play(int repeat){
        if(repeat ==1||repeat >4){
            System.out.println("Музыка играет "+repeat+" раз");
        }
        else {
            System.out.println("Музыка играет "+repeat+" разa");
        }
    }
    @Override
    public void play (double speed){
        System.out.println("Музыка играет на скорости "+speed+" x");
    }
}
