package org.example;

import java.util.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("田中", 10);
        nameToAge.put("佐藤", 21);
        nameToAge.put("中田", 62);
        nameToAge.put("久保", 5);
        nameToAge.put("波多野", 14);
        nameToAge.put("北山", 27);
        nameToAge.put("国枝", 19);

        Scanner scanner = new Scanner(System.in);
 
        System.out.println("-文字を入力してください-");
        String input = scanner.nextLine();

        Integer targetAge = null;
        String targetName = null;
        if (isInteger(input)) {
            targetName = input;
            System.out.println(targetAge + "歳の方を検索します");
        } else {
            System.out.println(input + "様を検索します");
            try {
                Integer.parseInt(input);
            } catch (NumberFormatException e) {
                return;
                Map<String, Integer> nameToAge = new HashMap<>();
                nameToAge.put("田中", 10);
                nameToAge.put("佐藤", 21);
                nameToAge.put("中田", 62);
                nameToAge.put("久保", 5);
                nameToAge.put("波多野", 14);
                nameToAge.put("北山", 27);
                nameToAge.put("国枝", 19);
                int age;
                if (nameToAge.containsKey(input)) {
                    age = nameToAge.get(input);
                    if (age < 30) {
                        System.out.println(input + "様は30歳未満です。");
                        if (age == 10) {
                            System.out.println("正しくは" + input + "様は10歳です。");
                        }
                        if (age == 19) {
                            System.out.println("正しくは" + input + "様は19歳です。");
                        }
                        if (age == 5) {
                            System.out.println("正しくは" + input + "様は5歳です。");
                        }
                        if (age == 27) {
                            System.out.println("正しくは" + input + "様は27歳です。");
                        }
                        if (age == 21) {
                            System.out.println("正しくは" + input + "様は21歳です。");
                        }

                        if (age == 14) {
                            System.out.println("正しくは" + input + "様は14歳です。");
                        }

                    } else {
                        System.out.println(input + "様は30歳以上です。");

                        if (age == 62) {
                            System.out.println("正しくは" + input + "様は62歳です。");
                        }
                    }
                } else {
                    System.out.println("-お探しの人物は見つかりませんでした。-");
                }


                //      private static boolean equals (Integer targetAge){
                //          return false;
                // return false;
            }
        }
    }

    private static boolean isInteger(String input) {
        return false;
    }
}










