import java.util.Arrays;

public class Uloha3 {
    public static int[][] multiplyHelp(int[][] A, int[][] B){
        int[][] C = new int[A.length][B[0].length];

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B[0].length; j++){
                for(int k = 0; k < A[i].length; k++){
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    
    public static int[][] matrixMultiply(int[][] m1, int[][] m2){
        if(m1[0].length == m2.length){
            int[][] m3 = multiplyHelp(m1, m2);
            return m3;
        }
        else if(m1.length == m2[0].length){
            int[][] m3 = multiplyHelp(m2, m1);
            return m3;
        } 
        else {return null;}
    }

    public static boolean identicalColumns(int[][] matrix, int c1, int c2){
        if(Arrays.equals(matrix[c1], matrix[c2])){
            return true;
        }
        return false;
    }

    public static String onlyUpper(String word){
        StringBuilder upperCase = new StringBuilder();      //vytvorenie instancie
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                upperCase.append(word.charAt(i));
            }
        }
        return upperCase.toString();                        //pretypovanie zo StringBuilder na String
    }
    
    public static String encryptCeasar(String text, int k){
        text = text.toUpperCase();
        StringBuilder newWord = new StringBuilder();
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) < 65 || text.charAt(i) > 90){
                newWord.append(text.charAt(i));
            }
            else{
                int currentChar = (int)text.charAt(i) - 65 + k;
                currentChar = (currentChar % 26) + 65;
                char newChar = (char) currentChar;
                newWord.append(newChar);
            }
        }
        
        return newWord.toString();
    }
    public static void main(String[] args) {
        int[][] A = {{1, 2},{1, 1},{3, 1}};
        int[][] B = {{1,2,3}};
        int[][] multiplied = matrixMultiply(A, B);

        System.out.println(Arrays.deepToString(multiplied));
        System.out.println(identicalColumns(A, 1, 0));
        System.out.println(onlyUpper("STU je Univerzita"));

        if(args.length > 0) {
            System.out.println(onlyUpper(Arrays.toString(args)));           //kontrola ci bolo nieco napisane pri spusteni 
        }                                                                   //programu aby program neskoncil chybou
        else{
            System.err.println("No input provided");
        }
        
        String cypher = encryptCeasar("abeceda", 7);
        System.out.println(cypher);

        String encrypted = encryptCeasar(cypher, -7);
        System.out.println(encrypted);
    }
}