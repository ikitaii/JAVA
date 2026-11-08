package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    Movie[] arr = new Movie[4];
    String title;
    String director;
    int duration;
    for(int i=0; i<arr.length;i++){
        System.out.println("Заполните название фильма "+(i+1)+" : ");
        title = scan.nextLine();
        System.out.println("Напишите имя режисера фильма "+(i+1)+" : ");
        director = scan.nextLine();
        System.out.println("Напишите продолжительность фильма "+(i+1)+" : ");
        duration = scan.nextInt();
        scan.nextLine();
        arr[i] = new Movie(title,director,duration);
        Movie.getAverageDuration(arr[i].duration, arr.length);
        }
        System.out.println("Фильмы : ");
    for (int i=0; i<arr.length; i++){
        System.out.print("Фильм "+(i+1)+" ");
        arr[i].infoOut();
    }
    }
}