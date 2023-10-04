package org.example;

import java.util.HashMap;
import java.util.Map;
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

        while (true) {
            System.out.println("1. 名前を入力して年齢を取得");
            System.out.println("2. 年齢を入力して名前を取得");
            System.out.println("3. 終了");
            System.out.print("選択肢を入力してください: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // 改行を消費

            switch (choice) {
                case 1:
                    System.out.print("名前を入力してください: ");
                    String name = scanner.nextLine();
                    if (nameToAge.containsKey(name)) {
                        int age = nameToAge.get(name);
                        System.out.println(name + "さんは" + age + "歳です。");
                    } else {
                        System.out.println("申し訳ありません。" + name + "さんの情報はありません。");
                    }
                    break;
                case 2:
                    System.out.print("年齢を入力してください: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // 改行を消費
                    String foundName = findNameByAge(nameToAge, age);
                    if (foundName != null) {
                        System.out.println(age + "歳の方の名前は" + foundName + "さんです。");
                    } else {
                        System.out.println("申し訳ありません。" + age + "歳の方の情報はありません。");
                    }
                    break;
                case 3:
                    System.out.println("プログラムを終了します。");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("無効な選択肢です。再試行してください。");
            }
        }
    }

    private static String findNameByAge(Map<String, Integer> map, int targetAge) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == targetAge) {
                return entry.getKey();
            }
        }
        return null;
    }
}
