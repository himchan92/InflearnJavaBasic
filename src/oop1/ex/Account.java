package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount) {
        this.balance += amount;
    }

    void withdraw(int amount) {
        if(balance >= amount) {
            this.balance -= amount;
        }
        else {
            System.out.println("잔고부족");
        }
    }
}
