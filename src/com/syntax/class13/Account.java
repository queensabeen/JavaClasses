package com.syntax.class13;

public class Account {
    String accountId;
    String userName;
    String password;
    double balance;
    String type;
    double limit;

    double amountTransfer(double amountToTransfer){
        if(amountToTransfer<balance){
            return balance=balance-amountToTransfer;
        }else{
            return 0;
        }
    }



    boolean login(String enteredUserName, String enteredPassword){ //how to associate behavior to classes
        if (userName.equals(enteredUserName) && password.equals(enteredPassword)){
            return true;
        }else{
            return false;
        }
    }
}
