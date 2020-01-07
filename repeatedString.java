import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        String[] arr = s.split("");
        int stringLength = s.length();
        long numOfChar = 0;
        int countOfA = 0;

        System.out.println(stringLength);

        if(stringLength > 0){
            for(int i= 0; i < arr.length; i++){
                if(s.charAt(i)=='a'){
                    countOfA++;
                } 
            }
        }

        long division = n/stringLength;
        long mod = n % stringLength;
        numOfChar = division * countOfA;

        for(int i=0;i<mod;i++){
           if(s.charAt(i)=='a'){
               numOfChar++;
           }
       }

        return numOfChar;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
