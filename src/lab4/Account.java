package lab4;

import java.util.ArrayList;

public class Account {
//id, name, balance (số dư).
    int id;
    String name;
    int balance;

    public Account(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }


    public void credit(int amount){
        if (amount>0){
            setBalance(getBalance()+amount);
            return;
        }
        System.out.println("nap tien that bai");

    }

    public void debit(int amount){
        if (amount>getBalance()){
            System.out.println("thanh toan khong thanh cong");
            return;
        }
        this.balance-=amount;

    }

    public boolean transferTo(Account account,int amount){
        if (amount>0&&amount<=getBalance()){
            debit(amount);
            account.credit(amount);
            return true;
        }
        return false;
    }




}
