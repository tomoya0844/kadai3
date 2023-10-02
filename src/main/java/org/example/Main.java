package org.example;

import java.util.*;

import java.util.Scanner;

public class Main {
    //public static void main(String[] args) {
    //class JSample1_1 {
    public static void main(String[] args) {

        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("田中", 10);
        nameToAge.put("佐藤", 21);
        nameToAge.put("中田", 62);
        nameToAge.put("久保", 5);
        nameToAge.put("波多野", 14);
        nameToAge.put("北山", 27);
        nameToAge.put("国枝", 19);
        //String targetName = "飯田";
        Scanner scanner = new Scanner(System.in);

        System.out.println("名前を入力してください");
        String targetName = scanner.nextLine();

        System.out.println("名前は" + targetName + "です");


        int age = 0;
        if (nameToAge.containsKey(targetName)) {
            age = nameToAge.get(targetName);
            if (age < 30) {
                System.out.println(targetName + "は30歳未満です。");
                if (age == 10) {
                    System.out.println("正しくは" + targetName + "は10歳です。");
                }
                if (age == 19) {
                    System.out.println("正しくは" + targetName + "は19歳です。");
                }
                if (age == 5) {
                    System.out.println("正しくは" + targetName + "は5歳です。");
                }
                if (age == 27) {
                    System.out.println("正しくは" + targetName + "は27歳です。");
                }
                if (age == 21) {
                    System.out.println("正しくは" + targetName + "は21歳です。");
                }

                if (age == 14) {
                    System.out.println("正しくは" + targetName + "は14歳です。");
                }

            } else {
                System.out.println(targetName + "は30歳以上です。");

                if (age == 62) {
                    System.out.println("正しくは" + targetName + "は62歳です。");
                }
            }
        } else {
            System.out.println("-" + targetName + "様というお探しの人物は見つかりませんでした。-");
        }
    }
}



