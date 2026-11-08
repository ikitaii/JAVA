package org.example;

public class Tree implements Growable, Blooming {
    private String name;
    private double height;
    private double crownDiametr;
    private boolean isBlooming;
    Tree(String name, double height, double crownDiametr, boolean isBlooming){
        this.name = name;
        this.height = height;
        this.crownDiametr = crownDiametr;
        this.isBlooming = isBlooming;
    }
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public Double getHeight(){return height;}
    public void setHeight(double height){this.height = height;}
    public Double getCrownDiametr (){return crownDiametr;}
    public void setCrownDiametr(double crownDiametr){this.crownDiametr = crownDiametr;}
    public boolean getIsBlooming (){return isBlooming;}
    public void setIsBlooming(boolean isBlooming){this.isBlooming=isBlooming;}
    @Override
    public void grow() {
        height += 1.5;
        crownDiametr += 0.5;
        if(crownDiametr>3){
            isBlooming = true;
        }
        System.out.println("Дерево '" + name + "' подросло. Высота: " + height + "м, диаметр кроны: " + crownDiametr + "м.");
    }
    @Override
    public double getHeightt() {
        return this.height;
    }
    @Override
    public void bloom() {
        if(this.isBlooming = true) {
            System.out.println("Дерево '" + name + "' расцвело");
        }
        else {
            System.out.println("Дерево еще недостаточно подросло");
        }
    }

    @Override
    public String getFlowerColor() {
        if (isBlooming == true) {
            return "Белый";
        } else {
            return "Дерево не цветет";
        }
    }
}
