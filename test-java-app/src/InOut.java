public class InOut {
    public static void main(String[] args){
        int cnt = args.length;
        System.out.println("引数の個数: " + cnt);
        for(String arg : args){
            System.out.println(arg);
        }
    }
}
