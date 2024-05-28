package com.ansurs.practice4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CoinCase3 {
    static int[] coins = {500,100,50,50,10,5,1};

    static ArrayList<int[]> list = new ArrayList<int[]>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 0;i <6;i++) {
            int count = i+1;
            System.out.println("Please input coin" + count + "!");
            int coin = scanner.nextInt();
            System.out.println("Please input quantity!");
            int q = scanner.nextInt();
            boolean contains = IntStream.of(coins).anyMatch(x -> x == coin);
            if(contains) {
                AddCoins(coin,q);
            }
        }
        for(int j = 0;j < coins.length;j++) {
            var totalC = GetCount(coins[j]);
            System.out.println(coins[j] + "円は" + totalC + "枚");
        }
        int AllTotal = GetAmonut();
        System.out.println("総額は" + AllTotal + "円");
    }
    public static void AddCoins(int coin,int qut) {
        int[] coins = {coin,qut};
        list.add(coins);
    }

    public static int GetCount(int c) {
        int count = 0;
        for(int i =0;i < list.size();i++) {
            int[] arr = list.get(i);
            int coin = arr[0];

            if(coin == c) {
                count += arr[1];
            }
        }
        return count;
    }

    public static int GetAmonut() {
        int count = 0;
        for(int i = 0;i < list.size();i++) {
            int[] arr = list.get(i);
            int c = arr[0];
            int q = arr[1];
            count += c*q;
        }
        return count;
    }
}