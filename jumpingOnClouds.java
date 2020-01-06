import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] clouds) {
        int goodCloud = 0;
        int minJumps = 0;
        int currentCloud = 0;

        while(currentCloud < clouds.length - 1){
            System.out.println("currentCloud: " + currentCloud);
            System.out.println("----------------------");

            if(currentCloud + 2 < clouds.length && clouds[currentCloud+2] == goodCloud) {
               currentCloud += 2;
                minJumps++;
            } else {
                currentCloud++;
                minJumps++;
            }
        }
        System.out.println("minJumps: " + minJumps);

        return minJumps;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
