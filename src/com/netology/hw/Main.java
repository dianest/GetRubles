package com.netology.hw;

public class Main {

    public static void main(String[] args) {
        int currentBalance = 100;
        int transferMoney = 15001;
        int bonusMoney = 0;
        if (transferMoney > 1000) {
            bonusMoney = transferMoney / 100;
        }
        System.out.println(bonusMoney);
    }
}
