package org.example;

class Triangle {
    double sideA;
    double sideB;
    double sideC;

    Triangle() {
    }

    ;

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public Double getSideA(double sideA) {
        return sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public Double getSideB(double sideB) {
        return sideB;
    }

    public void setSideC() {
        this.sideB = sideB;
    }

    public Double getSideC(double sideC) {
        return sideC;
    }

    public void isValid() {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {
            System.out.println("треугольник существует");
        } else {
            System.out.println("треугольник не существует");
        }
    }

    public void perimert() {
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {
            System.out.println("периметр треугольника = " + (sideA + sideB + sideC));
        } else {
            System.out.println("Ошибка, вычисление периметра невозможно");
        }
    }
    @Override
    public String toString() {
        return "Треугольник A=" + sideA + ", B=" + sideB + ", C=" + sideC ;
    }

}
