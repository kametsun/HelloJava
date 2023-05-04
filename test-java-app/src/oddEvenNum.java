import java.util.Scanner;

public class oddEvenNum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number;
        String choice;

        do{
            System.out.print("整数を入力してください。: ");
            number = scanner.nextInt();
            if(number % 2 == 0){
                System.out.println(number + "は偶数です。");
            }else{
                System.out.println(number + "は奇数です。");
            }

            System.out.print("もう一度入力しますか？(yes/no): ");
            choice = scanner.next();
        }while(choice.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
