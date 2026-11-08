package org.example;
/*Структура каждого задания:
        1. Интерфейсы (2-3 интерфейса) с:
        - 2-3 абстрактными методами
- 1 статическим методом (опционально)
2. Классы-реализации (2-3 класса), которые:
        - реализуют все интерфейсы
- имеют собственные поля
- реализуют все абстрактные методы
3. класс:
        - массив/список интерфейсного типа
- объекты разных классов
Интерфейсы:
        1. “Growable” — методы: “grow()”, “getHeight()”
        2. “Blooming” — методы: “bloom()”, “getFlowerColor()”*/
public interface Growable {
    void grow();
    double getHeightt();
    static void showInfo(int size, Growable[]garden){
        int countTree =0;
        int countFlowers = 0;
        for(int i=0; i<size; i++){
            if(garden[i]instanceof Tree){
                countTree ++;
            }
            else {
                countFlowers ++;
            }
        }
        if(countTree==1){
            System.out.println("В саду растет "+countTree+" дерево");
        }
        else if(countTree>1&&countTree<5){
            System.out.println("В саду растет "+countTree+" дерева");
        }
        else{
            System.out.println("В саду растет "+countTree+" деревьев");
        }
        if(countFlowers==1){
            System.out.println("В саду растет "+countFlowers+" цветок");
        }
        else if(countFlowers>1&&countFlowers<5){
            System.out.println("В саду растет "+countFlowers+" цветка");
        }
        else{
            System.out.println("В саду растет "+countFlowers+" цветов");
        }
    }
}
