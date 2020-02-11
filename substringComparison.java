

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);
        
        // Complete the function
        for(int i= 0; i < s.length()-k+1; i++){
            String temp = s.substring(i, i + k);
            if(smallest.compareTo(temp) > 0) smallest = temp;
            if(largest.compareTo(temp) < 0) largest = temp;
        }
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

