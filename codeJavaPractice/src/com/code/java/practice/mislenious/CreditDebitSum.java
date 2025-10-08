package com.code.java.practice.mislenious;

import com.code.java.practice.mislenious.bean.Transactions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class CreditDebitSum {
    public static void main(String[] args) {
        List<Transactions> transactions = Arrays.asList(new Transactions("Credit", "2000"),
                new Transactions("Credit", "1000"),
                new Transactions("Debit", "250"));
        double credit = transactions.stream()
                .mapToDouble(t -> t.getType().equalsIgnoreCase("Credit") ? Integer.valueOf(t.getAmount()) : -Integer.valueOf(t.getAmount())).sum();

        System.out.println(credit);
    }
}
