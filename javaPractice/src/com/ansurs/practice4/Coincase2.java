package com.ansurs.practice4;

import java.util.Scanner;

public class Coincase2 {
    private int yen500 = 0;
    private int yen100 = 0;
    private int yen50 = 0;
    private int yen10 = 0;
    private int yen5 = 0;
    private int yen1 = 0;

    public void AddCoins(int coinType,int count) {
        switch (coinType) {
            case 500:
                yen500 += count;
                break;
            case 100:
                yen100 += count;
                break;
            case 50:
                yen50 += count;
                break;
            case 10:
                yen10 += count;
                break;
            case 5:
                yen5 += count;
                break;
            case 1:
                yen1 += count;
                break;
            default:
                break;
        }
    }
    public int GetAmount() {
        return (yen500*500) + (yen100*100) + (yen50*50) + (yen10*10) + (yen5*5) + (yen1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoinCase coinCase = new CoinCase();

        for(int i = 0;i < 6;i++) {
            System.out.println("硬貨の種類を入力して下さい(500,100,50,10,5,1)");
            int coinType = scanner.nextInt();
            System.out.println("硬貨の枚数を入力して下さい");
            int count = scanner.nextInt();
            coinCase.AddCoins(coinType,count);
        }

        System.out.println("500円は" + coinCase.GetCount(500) + "枚");
        System.out.println("100円は" + coinCase.GetCount(100) + "枚");
        System.out.println("50円は" + coinCase.GetCount(50) + "枚");
        System.out.println("10円は" + coinCase.GetCount(10) + "枚");
        System.out.println("5円は" + coinCase.GetCount(5) + "枚");
        System.out.println("1円は" + coinCase.GetCount(1) + "枚");

        System.out.println("総額は"+coinCase.GetAmount() + "円");
        scanner.close();
    }
}
