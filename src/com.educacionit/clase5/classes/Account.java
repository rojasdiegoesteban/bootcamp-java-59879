package com.educacionit.clase5.classes;

import java.util.Objects;

public class Account {

    /*
        Attributes (characteristics)
     */

    private String number;
    private Double balance;
    private String customerName;
    private String email;
    private String phone;

    /*
        Constructors
     */

    public Account() {
        this("00000000", "null null"); // 'this' used to call a constructor inside the class
        this.balance = .0d; // 'this' is used to call attributes inside the class
    }

    public Account(String number, String customerName) {
        this.number = number;
        this.customerName = customerName;
    }

    public Account(String number, Double balance, String customerName, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phone = phone;
    }

    /*
        Getters and Setters
     */

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    /*
        Methods (behaviour)
     */

    public void deposit(double amount) {
        this.balance += amount;
        System.out.printf("Deposit of %.2f processed. New balance: %.2f\n", amount, this.balance);
    }

    public void withdrawal(double amount) {
        if ((this.balance - amount) < .0d) {
            System.out.printf("Your withdrawal was not processed. Check your balance: %.2f\n", this.balance);
        } else {
            this.balance -= amount;
            System.out.printf("Withdrawal of %.2f processed. Remaining balance: %.2f\n", amount, this.balance);
        }
    }

    /*
        Common method for all Objects (Override)
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(number, account.number) && Objects.equals(balance, account.balance) && Objects.equals(customerName, account.customerName) && Objects.equals(email, account.email) && Objects.equals(phone, account.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, balance, customerName, email, phone);
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
