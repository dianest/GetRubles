package com.netology.hw;

public class Main {

    public static void main(String[] args) {
        int currentBalance = 100;
        int transferMoney = 1001;
        int bonusMoney = 0;
        if (transferMoney > 1000) {
            bonusMoney = transferMoney / 100;
        }
        int finalBalance = currentBalance + transferMoney + bonusMoney;
        System.out.println(finalBalance);
    }
}
