import java.util.Arrays;

public class Uloha2{
    static final int CAPACITY = 10;
    
    public static void printArrays(int[] n, String[] s){
         System.out.println(Arrays.toString(n));
         System.out.println(Arrays.toString(s));
    }
    
    public static void initArrays(int[] n, String[] s){ // assigning values to Arrays
        for(int i = 0; i < n.length; i++) {
                n[i] = i+1;
                s[i] = "*";
        }
    }
    
    public static void changeOdd(int[] n, String[] s){
        for(int i = 0; i < n.length; i++){
            if(n[i] > 5 && n[i] % 2 == 1){
                s[i] = "odd";
            }
        }
    }
    
    public static void changeEven(int[] n, String[] s){
        for(int i = 0; i < n.length; i++){
            if(n[i] < 5 && n[i] % 2 == 0){
                s[i] = "even";
            }
        }
    }
    
    public static int sum(String[] in, StringBuilder out){
        int sum = 0;
        for(int i=0; i < in.length; i++) {
            if(in[i] == "odd") {
                sum++;
                out.append("+1");
            }
            else if(in[i] == "even") {
                sum +=2;
                out.append("+2");
            }
            else {
                sum--;
                out.append("-1");
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[CAPACITY];              // initialized int Array of size CAPACITY=10
        String[] strings = new String[CAPACITY];        // initialized String Array of size CAPACITY=10
        
        printArrays(numbers, strings);
        initArrays(numbers, strings);
        printArrays(numbers, strings);
        changeOdd(numbers, strings);
        changeEven(numbers, strings);
        printArrays(numbers, strings);

        StringBuilder sb = new StringBuilder();         // this is StringBuilder instance
        System.out.println(sum(strings, sb));
        System.out.println(sb);
    }
}