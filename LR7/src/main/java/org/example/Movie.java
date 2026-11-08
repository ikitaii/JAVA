package org.example;

public class Movie {
    /*Создайте класс “org.example.Movie”:
    Нестатические: “title”, “director”, “duration” (в минутах)
    Статические: “totalMovies”, “totalDuration”
    Статический метод “getAverageDuration()”
    В “main” создайте 4 фильма и выведите среднюю длительность*/
    String title;
    String director;
    int duration;
    static int totalMovie=0;
    static double totalDuration=0;
    Movie(){}
    Movie(String title, String director,int duration){
        this.title = title;
        this.director = director;
        this.duration = duration;
    }
    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}
    public String getDirector (){return director;}
    public void setDirector(String director){this.director = director;}
    public int getDuration(){return duration;}
    public void setDuration(int duration){this.duration=duration;}
    public void infoOut(){
        System.out.println(title+" "+director+" "+duration);
    }
    public static void getAverageDuration(int duration, int size) {
        totalMovie++;
        totalDuration += duration / size;
        if(totalMovie==size){
        System.out.println("Общее количество фильмов : " + totalMovie + " Средняя длительность : " + totalDuration);
        }
    }
}
