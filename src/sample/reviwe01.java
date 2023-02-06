package sample;

public class reviwe01 {

    public static void main(String[] args) {
        // int num1=商品価格、it num2=消費税率
        int num1 = 1500;
        int num2 = 10;
        int result;
        result = tax(num1, num2);
        System.out.println("1500円の商品の税込価格は" + (num1 + result) + "（消費税は" + result + "円）です。");
        }

    // 下記メソッドで消費税額を計算
    public static int tax(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
        
    }
