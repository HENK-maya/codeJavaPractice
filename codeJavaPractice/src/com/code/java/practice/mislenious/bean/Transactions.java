package com.code.java.practice.mislenious.bean;

public class Transactions {
    private String type;
    private String amount;

    public Transactions(String type, String amount) {
        this.type = type;
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "type='" + type + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
