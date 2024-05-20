import java.io.*;

class Solution {
    public int solution(int[] sides) {
        
        int max = 0, sum = 0;
        
        for (int i: sides) {
            if (i > max) max = i;
            sum += i;
        }
        
        return sum - max > max ? 1 : 2;
    }
}