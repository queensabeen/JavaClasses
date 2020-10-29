package com.syntax.class13;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Account burju=new Account();

        burju.accountId="1234";
        burju.userName="Burju";
        burju.password="Pass123";
        burju.balance=1000000;
        burju.type="checking";
        burju.limit=125;
        boolean  isLoggedIn=burju.login("abc123","abcdef");
        if (isLoggedIn){
            System.out.println("Welcome to Syntax Bank");
        }else{
            System.out.println("Invalid user name or password");
        }

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter amount you want to transfer");
        int amount=scan.nextInt();

        if (amount< burju.limit){
            System.out.println(burju.balance-amount);
        }else{
            System.out.println(0);
        }

        double amountToTransfer=burju.amountTransfer(10);
        if (amountToTransfer==0){
            System.out.println("insufficient funds");
        }else{
            System.out.println("Transfer complete");
        }


        Account elias=new Account();

        elias.accountId="125";
        elias.userName="Elias";
        elias.password="Pass123";
        elias.balance=15000;
        elias.type="saving";
        elias.limit=100;


    }
}
