import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;
        int counter = 1;
        while (sc.hasNext()){
            line = sc.nextLine();
            System.out.println(counter +" "+line);
            counter++;
        }
        sc.close();
    }
}
