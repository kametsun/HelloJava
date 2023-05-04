import java.util.Scanner;

public class Calc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        int ans = 0;
        if(op.equals("+")){
            ans = a + b;
        }else if(op.equals("-")){
            ans = a - b;
        }else if(op.equals("*")){
            ans = a * b;
        }else if(op.equals("/")){
            ans = a / b;
            int remainder = a % b;
            System.out.println(ans + "..." + remainder);
            sc.close();
            return;
        }else{
            System.out.println("0で割ることはできません。");
            sc.close();
            return;
        }
        System.out.println(ans);
        sc.close();
    }
}
