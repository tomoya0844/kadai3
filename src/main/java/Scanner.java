import java.util.Scanner;

class JSample1_1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("年齢を入力してください");
        String old = scanner.next();

        System.out.println("年齢は" + old + "です");
    }
}