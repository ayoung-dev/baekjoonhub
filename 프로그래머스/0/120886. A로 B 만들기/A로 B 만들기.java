import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        char[] befArr = before.toCharArray();
        char[] aftArr = after.toCharArray();
        
        Arrays.sort(befArr);
        Arrays.sort(aftArr);
        
        if (String.valueOf(befArr).equals(String.valueOf(aftArr)))
            return 1;
        else
            return 0;
    }
}