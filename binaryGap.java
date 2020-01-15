import java.util.*;
import java.util.*;

class Solution {
    public int solution(int N) {
        int binGap = 0;
        int gapCount = 0;
        String binary = Integer.toBinaryString(N);
        char[] arr = binary.toCharArray();
        
        for(char ch : arr){
            if(ch == '0'){
                gapCount++;
            } else {
                if(gapCount > binGap){
                    binGap = gapCount;
                }
                gapCount = 0;
            }
        }
    
        return binGap;
    }
}
