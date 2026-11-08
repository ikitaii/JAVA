package org.example;
        public class Main {
            public static void main(String[] args) {
                Account[] accounts = new Account[5];

                accounts[0] = new SavingsAccount(1001, 10000, "Иванов", 5);
                accounts[1] = new SavingsAccount(1002, 25000, "Петров", 10);
                accounts[2] = new SavingsAccount(1003, 5000,  "Сидоров", 7);
                accounts[3] = new CheckingAccount(2001, 3000, "Козлов", 1000);
                accounts[4] = new CheckingAccount(2002, 8000, "Сергеев", 2000);
                for (int i = 0; i < accounts.length; i++) {
                    accounts[i].displayInfo();
                    accounts[i].calculateInterest();
                    System.out.println();
                }

                System.out.println("Методы");

                for (int i = 0; i < accounts.length; i++) {
                    if (accounts[i] instanceof SavingsAccount) {
                        ((SavingsAccount) accounts[i]).deposit(500);
                    }
                }

                for (int i = 0; i < accounts.length; i++) {
                    if (accounts[i] instanceof CheckingAccount) {
                        ((CheckingAccount) accounts[i]).withdraw(4000);
                    }
                }
            }
        }