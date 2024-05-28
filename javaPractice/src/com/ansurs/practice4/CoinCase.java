package com.ansurs.practice4;

import java.util.Scanner;

public class CoinCase {
    //定数
    private static final int YEN_500 = 500; //500yen
    private static final int YEN_100 = 100; ///100yen
    private static final int YEN_50 = 50; //50yen
    private static final int YEN_10 = 10; //10yen
    private static final int YEN_5 = 5; //5yen
    private static final int YEN_1 = 1; //1yen

    private static final int LOOP_CNT = 6; //ループ回数

    private int yen500Cnt; //500円の所持枚数
    private int yen100Cnt; //100円の所持枚数
    private int yen50Cnt; //50円の所持枚数
    private int yen10Cnt; //10円の所持枚数
    private int yen5Cnt; //5円の所持枚数
    private int yen1Cnt; //1円の所持枚数

    public CoinCase() {
        this.yen500Cnt = 0;
        this.yen100Cnt = 0;
        this.yen50Cnt = 0;
        this.yen10Cnt = 0;
        this.yen5Cnt = 0;
        this.yen1Cnt = 0;
    }

    public static void main(String[] args) {
        CoinCase coinCase = new CoinCase();
        Scanner sc = new Scanner(System.in, "Shift-JIS");

        for (int i = 0; i < LOOP_CNT; i++) {
            System.out.println("追加する硬貨の種類と枚数を入力して下さい。");
            System.out.println("(例)500円を3枚追加する場合=>「500 3」と入力して下さい");

            try {
                String input = sc.nextLine();

                String[] val = input.split(" ");

                if (val.length == 2) {
                    int coinType = Integer.parseInt(val[0]);
                    int coinNum = Integer.parseInt(val[1]);

                    coinCase.AddCoins(coinType, coinNum);
                }
            } catch (Exception e) {
                continue;
            }
        }
        int total = coinCase.GetAmount();
        coinCase.ShowResult(total);
        sc.close();
    }
    public void AddCoins(int coinType, int coinNum) {
        switch (coinType) {
            //500円
            case YEN_500:
                this.yen500Cnt += coinNum;
                break;

            //100円
            case YEN_100:
                this.yen100Cnt += coinNum;
                break;

           //50円
            case YEN_50:
                this.yen50Cnt += coinNum;
                break;

            //10円
            case YEN_10:
                this.yen10Cnt += coinNum;
                break;

            //5円
            case YEN_5:
                this.yen5Cnt += coinNum;
                break;

            case YEN_1:
                this.yen1Cnt += coinNum;
                break;

            default:
                break;
        }
    }

    /*所持枚数の取得
      引数:coinType
      戻り値:yenXXXcnt
     */

    public int GetCount(int coinType) {
        switch (coinType) {
            //500円
            case YEN_500:
                return this.yen500Cnt;

            //100円
            case YEN_100:
                return this.yen100Cnt;

            //50円
            case YEN_50:
                return this.yen50Cnt;

             //10円
            case YEN_10:
                return this.yen10Cnt;

            //5円
            case YEN_5:
                return this.yen5Cnt;

            //1円
            case YEN_1:
                return this.yen1Cnt;

            default:
                return 0;
        }
    }

    /*
    * 引数:なし
    * 戻り値:total
    */
    public int GetAmount() {
        int yen500Total= 0; //500円の総額
        int yen100Total = 0; //100円の総額
        int yen50Total = 0; //50円の総額
        int yen10Total = 0; //10円の総額
        int yen5Total = 0; //５円の総額
        int yen1Total = 0; //1円の総額

        int total;

        yen500Total = this.yen500Cnt * YEN_500;
        yen100Total = this.yen500Cnt * YEN_100;
        yen50Total = this.yen500Cnt * YEN_50;
        yen10Total = this.yen500Cnt * YEN_10;
        yen5Total = this.yen500Cnt * YEN_5;
        yen1Total = this.yen500Cnt * YEN_1;

        total = yen500Total + yen100Total + yen50Total + yen10Total + yen5Total + yen1Total;
        return total;
    }

    /*結果を表示
    引数:total
    戻り値:なし
     */

    public void ShowResult(int total) {
        final String typeNumMsg = "%d円は%d枚\n";
        final String resultMsg = "総額は%d円\n";

        //各硬貨と枚数
        System.out.printf(typeNumMsg,YEN_500,this.yen500Cnt);
        System.out.printf(typeNumMsg,YEN_100,this.yen100Cnt);
        System.out.printf(typeNumMsg,YEN_50,this.yen50Cnt);
        System.out.printf(typeNumMsg,YEN_10,this.yen10Cnt);
        System.out.printf(typeNumMsg,YEN_5,this.yen5Cnt);
        System.out.printf(typeNumMsg,YEN_1,this.yen1Cnt);

        System.out.printf(resultMsg,total);

    }
}
