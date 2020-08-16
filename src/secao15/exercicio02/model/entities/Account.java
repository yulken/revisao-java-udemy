package secao15.exercicio02.model.entities;

import secao15.exercicio02.model.exception.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Double getWithdrawLimit() {
        return this.withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        this.balance = getBalance() + amount;
    }

    public void withdraw(Double amount){
        if (getWithdrawLimit() < amount){
            throw new DomainException("The amount exceeds withdraw limit");
        }
        if (getBalance() < amount){
            throw new DomainException("Not enough balance");
        }
        this.balance = getBalance() - amount;
    }
}