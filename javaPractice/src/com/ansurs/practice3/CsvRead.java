package com.ansurs.practice3;

import java.io.*;
import java.nio.charset.Charset;

public class CsvRead {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("" +
                "./javaPractice/src/test.csv"), Charset.forName("Shift-JIS")))) {
            String line;
            int index = 0;
            while ((line = reader.readLine())!= null) {
                if(index > 0) {
                    String[] data = line.split(",");
                    if(data.length > 2) {
                        System.out.println("名前 : " + data[0]);
                        System.out.println("年齢 : " + data[1]);
                        System.out.println("性別 : " + data[2]);
                        System.out.println("");
                    }
                }
                index++;
            }
        } catch (IOException e) {
            System.out.println("ファイルの読み込みに失敗");
            System.out.println(e);
        }
    }
}
