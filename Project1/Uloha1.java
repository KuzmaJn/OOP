package Project1;
public class Uloha1{
    static int x = 100;
    static double y = 2.0;

    static double equation1(int a, double b) {
        return a-b / (a+b);
    }

    static double equation2(int a, double b) {
        return a-b / a+b;
    }

    static void reportResult(double res) {
        System.out.println(res);
    }
    public static void main(String[] args) {
        double result = equation1(x, y);
        reportResult(result);
        double result2 = equation2(x, y);
        reportResult(result2);
    }
}