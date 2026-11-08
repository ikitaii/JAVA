package org.example;
public class Account {
    private int number;
    private double balance;
    private String owner;
    Account (int number, double balance, String owner){
        this.number = number;
        this.balance = balance;
        this.owner = owner;
    }
    public int getNumber(){return number;}
    public void setNumber (int number){this.number = number;}
    public double getBalance (){return balance;}
    public void setBalance(double balance){this.balance=balance;}
    public String getOwner(){return owner;}
    public void setOwner(String owner){this.owner=owner;}
    void calculateInterest(){
        System.out.println("Начисленная сумма с процентами по счету : "+ balance);
    }
    void displayInfo() {
        System.out.println("Счет : "+ number);
        System.out.println("Владелец : "+owner);
        System.out.println("Текущая сумма : " + balance);
    }

}
