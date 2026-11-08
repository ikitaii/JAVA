package org.example;

public class Main {
    public static void main(String[] args) {
        SportGame[] games = new SportGame[6];
        games[0] = new Football("Матч 1", 22, 90, 3);
        games[1] = new Football("Матч 2", 22, 90, 1);
        games[2] = new Football("Матч 3", 22, 90, 5);
        games[3] = new Basketball("Матч 4", 10, 40, 4);
        games[4] = new Basketball("Матч 5", 10, 40, 4);
        games[5] = new Basketball("Матч", 11, 40, 7);
        SportGame s1 = new Football("Футбол", 22, 90, 0);
        for (int i = 0; i < games.length; i++) {
            games[i].displayInfo();
            System.out.println();
        }
    }
}