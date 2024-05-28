package com.ansurs.practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinCase4 {
    private int yen500 = 0;
    private int yen100 = 0;
    private int yen50 = 0;
    private int yen10 = 0;
    private int yen5 = 0;
    private int yen1 = 0;

    public void AddCoins(int kind,int count) {
        switch (kind) {
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
            }
        }
        public int GetCount(int kind) {
            return switch (kind) {
                case 500 -> yen500;
                case 100 -> yen100;
                case 50 -> yen50;
                case 10 -> yen10;
                case 5 -> yen5;
                case 1 -> yen1;
                default -> 0;
            };
        }

        public int GetAmount() {
            return (yen500 * 500) + (yen100 * 100) + (yen50 * 50) + (yen5 * 5) + (yen1);
        }

        public static class Main {
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                CoinCase MyCoinCase = new CoinCase();

                for(int i=0;i < 6;i++) {
                    System.out.println("硬貨の種類はなんですか?");
                    int kind = Integer.parseInt(br.readLine());

                    System.out.println("硬貨の枚数は何枚ですか？");
                    int count = Integer.parseInt(br.readLine());

                    MyCoinCase.AddCoins(kind,count);
                }

                System.out.println("500円は、" + MyCoinCase.GetCount(500) + "枚");
                System.out.println("100円は、" + MyCoinCase.GetCount(100) + "枚");
                System.out.println("50円は、" + MyCoinCase.GetCount(50) + "枚");
                System.out.println("10円は、" + MyCoinCase.GetCount(10) + "枚");
                System.out.println("5円は、" + MyCoinCase.GetCount(5) + "枚");
                System.out.println("1円は、" + MyCoinCase.GetCount(1) + "枚");
                System.out.println("総額は、" + MyCoinCase.GetAmount() + "円です。");
            }
        }
    }

