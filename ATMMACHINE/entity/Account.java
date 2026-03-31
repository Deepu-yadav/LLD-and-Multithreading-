package ATMMACHINE.entity;

import java.util.UUID;

public class Account {

    private UUID id;
    private String accountNumber;
    private double totalBalance;

    public Account(String accountNumber, double totalBalance) {
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
        this.id=UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }
}
