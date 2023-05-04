public class Error {
    public static void main(String[] args){
        //Null参照によるNullPointerExceptionを発生させる
        String str = null;
        try{
            str.length();
        }catch(NullPointerException e){
            System.out.println("例外が発生しました: " + e);
        }

        // 配列の範囲外参照によるArrayIndexOutOfBoundsExceptionを発生させる
        int[] arr = {1, 2, 3};
        try{
            int num = arr[3];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("例外が発生しました: " + e);
        }

        // 互換性の無いオブジェクト型の変換によるClassCastExceptionを発生させる
        Object obj = new Object();
        try{
            String str2 = (String) obj;
        }catch(ClassCastException e){
            System.out.println("例外が発生しました: " + e);
        }
    }
}
