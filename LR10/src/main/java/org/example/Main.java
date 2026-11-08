package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Growable[] garden = new Growable[5];
        garden[0]= new Tree("Яблоня", 3, 4,false);
        garden[1]=new Tree("Груша", 2.8,4, false);
        garden[2]=new Flower("Роза",9.6,"Красный",false);
        garden[3]=new Flower("Лилия",30,"Белый",true);
        garden[4]=new Flower("Хризантема", 14.9,"Розовый",false);
        System.out.println("САД");
        for(int i=0;i<5;i++){
            garden[i].grow();
            garden[i].getHeightt();
            if(garden[i]instanceof Growable){
                Blooming bloomingPlant = (Blooming) garden[i];
                bloomingPlant.bloom();
                bloomingPlant.getFlowerColor();
            }
            System.out.println("_______________________________");
        }

        Growable.showInfo(5,garden);
    }
}