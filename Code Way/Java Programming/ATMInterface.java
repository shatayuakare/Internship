import java.util.Scanner;
import java.lang.Math;

class BankAccount  {
    String name;
    int accountNumber;
    double balance;


    public BankAccount(String name){
        this.name = name;
        accountNumber = (int) (Math.random() * 100000000);
        balance = 25000.00;
    }
}

class ATMMachine extends BankAccount{

    public void accountDetails (){
        System.out.println("Account Holder Name : " + name);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance Amount : " + balance);
    }

    public double checkBalance(){
        return balance;
    }

    public void withdrawal(float amount){
        if(balance < amount){
            System.out.println("Your balance not sufficient for Withdrawal");
            return;
        }
        balance -= amount;

        System.out.println("Withdrawal Amount : " + amount);
        System.out.println("Current balance : " + balance);
    }
    
    public void deposite(float amount){
        balance += amount;

        System.out.println("Deposite Amount : " + amount);
        System.out.println("Current balance : " + balance);
    }
}



class ATMInterface{

    public static void main(String args[]){

        BankAccount act = new BankAccount("Shatayu");

        
    }
    
}