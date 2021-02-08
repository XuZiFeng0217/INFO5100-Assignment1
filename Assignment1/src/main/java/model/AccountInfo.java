/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author zzz
 */
public class AccountInfo {
    private String bankName;
    private String bankRoutingNumber;
    private String bankAccountNumber;
    private double accountBalance;
    private String accountType;

    public String getBankName() {
        return bankName;
    }

    public String getBankRoutingNumber() {
        return bankRoutingNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankRoutingNumber(String bankRoutingNumber) {
        this.bankRoutingNumber = bankRoutingNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    
    
    
}
