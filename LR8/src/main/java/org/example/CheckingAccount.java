package org.example;

public class CheckingAccount extends Account{
    private double overdraftLimit;
    CheckingAccount(int number, double balance, String owner, double overdraftLimit){
        super(number, balance, owner);
        this.overdraftLimit = overdraftLimit;
    }
    public double getOverdraftLimit(){return overdraftLimit;}
    public void setOverdraftLimit(double overdraftLimit){this.overdraftLimit=overdraftLimit;}
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Снято " + amount + ". Новый баланс: " + getBalance());
        } else {
            System.out.println("Превышен лимит");
        }
    }
    @Override
    void calculateInterest(){
        System.out.println("Проценты не начисляются");
    }

    @Override
    void displayInfo(){
        super.displayInfo();
        System.out.println("Кредитный лимит : "+overdraftLimit );
    }
}
