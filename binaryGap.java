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
            }
            
            if(ch == '1'){
                if(gapCount > binGap){
                    binGap = gapCount;
                }
                gapCount = 0;
            }
            
        }
    
        return binGap;
    }
}
