package org.example;

public class Flower implements Blooming, Growable {
    private String name;
    private double height;
    private String color;
    private boolean isBlooming = false;
    Flower(String name, double height, String color, boolean isBlooming){
        this.name = name;
        this.height = height;
        this.color = color;
        this.isBlooming = isBlooming;
    }
    public String getName(){return name;}
    public void setName (String name ){this.name = name;}
    public double getHeight(){return height;}
    public void setHeight(double height){this.height = height;}
    public String getColor (){return color;}
    public void setColor(String color){this.color = color;}
    public boolean getIsBlooming(){return isBlooming;}
    public void setIsBlooming (boolean isBlooming){this.isBlooming = isBlooming;}
    @Override
    public void grow(){
        height += 0.5;
        if(height>15){
            isBlooming = true;
        }
        System.out.println("Цветок "+ name+ " подрос. Нынешняя длина : "+ height+" см.");
    }
    @Override
    public double getHeightt(){
        return this.height;
    }
    @Override
    public void bloom(){
        if (isBlooming == true ){
            System.out.println("Цветок расцвел");
        }
        else{
            System.out.println("Цветок еще недостаточно подрос");
        }
    }
    @Override
    public String getFlowerColor(){
        System.out.println("Цвет: " + this.getColor());
        return this.getColor();
    }
}
