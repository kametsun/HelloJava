import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("１つ目の数字を入力してください: ");
            double num1 = scanner.nextDouble();

            System.out.println("２つ目の数字を入力してください: ");
            double num2 = scanner.nextDouble();

            /*System.out.println("入力した数字は" + num1 + "と" + num2);*/

            System.out.println("演算方法を選んでください。");
            System.out.println("1. 足し算");
            System.out.println("2. 引き算");
            System.out.println("3. 掛け算");
            System.out.println("4. 割り算");

            int operation = scanner.nextInt();

            /*System.out.println("選んだ演算方法は" + operation);*/

            double result;
            if(operation == 1){
                result = num1 + num2;
            }else if(operation == 2){
                result = num1 - num2;
            }else if(operation == 3){
                result = num1 * num2;
            }else if(operation == 4){
                result = num1 / num2;
            }else{
                System.out.println("選択した操作が無効です。");
                return;
            }

            System.out.println("答えは" + result);
        }
    }
}
