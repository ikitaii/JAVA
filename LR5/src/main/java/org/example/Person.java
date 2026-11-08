package org.example;

class Person {
    String name;
    Gender gender;

    Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public void outputInfo() {
        System.out.println(name + " " + gender);
    }
}
