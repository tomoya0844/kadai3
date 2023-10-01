package org.example;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        Map<String, Integer> nameMap = new HashMap<>();
        nameMap.put("田中", 10);
        nameMap.put("佐藤", 21);
        nameMap.put("中田", 62);
        nameMap.put("久保", 5);
        nameMap.put("波多野", 14);
        nameMap.put("北山", 27);
        nameMap.put("国枝", 19);

        String targetName = "飯田";

        int age = 0;
        if (nameMap.containsKey(targetName)) {
            age = nameMap.get(targetName);
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


