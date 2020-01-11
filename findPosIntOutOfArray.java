

import java.util.*;

class Solution {

    public int solution(int[] A) {
        int n = A.length;
        int smallestPostInt = 0;
        int value = 0;
        int nextValue = 0;

       

        for(int i = 0; i < n; i++){
            // if value neg or greater than arrary size then move on
            if (A[i] <= 0 || A[i] > n){
            continue;

            }

            value = A[i];

            while(A[value - 1] != value){
                nextValue = A[value - 1];
                A[value - 1] = value;
                value = nextValue;
                if (value <= 0 || value > n){
                    break;
                }
            }
        }

           

            for (int i = 0; i < n; i++){
                if(A[i] != i + 1){
                return smallestPostInt = i + 1;
                }
        }

        return smallestPostInt = n + 1;

    }

}
