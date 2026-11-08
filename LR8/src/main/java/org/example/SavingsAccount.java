package org.example;

import java.sql.SQLOutput;

public class SavingsAccount extends Account{
    private int rate;
    SavingsAccount(int number, double balance, String owner, int rate){
        super(number, balance, owner);
        this.rate = rate;
    }
    public int getRate (){return rate;}
    public void setRate(int rate){this.rate=rate;}
    @Override
    void calculateInterest(){
        double interest = getBalance() * rate / 100;
        setBalance(getBalance() + interest);
        System.out.println("Начислены проценты: " + interest + ". Текущий баланс: " + getBalance());
    }
    void deposit(double amaunt){
        setBalance(getBalance()+amaunt);
        System.out.println("Актуальный баланс счета : "+ getBalance()+" Счет пополнен на : "+ amaunt);
    }
    @Override
    void displayInfo() {
        System.out.println("Счет : "+ getNumber());
        System.out.println("Владелец : "+getOwner());
        System.out.println("Текущая сумма : " + getBalance());

    }
}
