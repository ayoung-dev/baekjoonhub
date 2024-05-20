import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        
        Arrays.sort(sides);
        
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
        
        
        /*
        int max = 0, sum = 0;
        
        for (int i: sides) {
            if (i > max) max = i;
            sum += i;
        }
        
        return sum - max > max ? 1 : 2;
        */
    }
}