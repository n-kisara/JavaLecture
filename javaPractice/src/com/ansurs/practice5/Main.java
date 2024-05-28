package com.ansurs.practice5;

import javax.lang.model.element.Name;

public class Main {
    public static void ShowProfile(String Name, int Age) {
        System.out.println("名前は" + Name + "、" + Age + "歳です。");
    }
    public static void main(String[] args) {
        Cat cat = new Cat();
        Main.ShowProfile("pochi",10);
        cat.Sleep();
    }
}
