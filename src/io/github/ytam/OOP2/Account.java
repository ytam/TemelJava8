package io.github.ytam.OOP2;

/**
 * Created by brusk on 12/9/16.
 */
public class Account {

    private String number;
    private String customerName;
    private double balance;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public void deposit(double depositAmount){

        this.balance += depositAmount;
        System.out.println("Deposit of: "+depositAmount +" made. New balance is "+this.balance);
    }

    public void withdrawal(double withdrawalAmount){

       if(this.balance-withdrawalAmount <=0){
           System.out.println("Only "+ this.balance+"aviable. Withdrawal not prosessed.");
       }
       else{
            balance-=withdrawalAmount;
           System.out.println("Withdrawal of "+withdrawalAmount+ " prosessed. Remaining balance ="+this.balance);

       }

    }




    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }


}
