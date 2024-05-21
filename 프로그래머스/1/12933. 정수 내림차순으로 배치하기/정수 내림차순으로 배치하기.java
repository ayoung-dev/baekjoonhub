import java.util.*;

class Solution {
    public long solution(long n) {
        int length = (int) (Math.log10(n) + 1);
        long[] arr = new long[length];
        
        for (int i = 0; i < length; i++) {
            arr[i] = n % 10;
            n /= 10;
        }
        
       Arrays.sort(arr);    
        
        StringBuilder sb = new StringBuilder();
        for (long l: arr){
            sb.append(String.valueOf(l));
        }

        long answer = Long.parseLong(sb.reverse().toString());
        
        return answer;
    }
}