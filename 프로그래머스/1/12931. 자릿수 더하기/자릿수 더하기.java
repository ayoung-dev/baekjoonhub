public class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        int sum = 0;
        
        for (char ch: str.toCharArray()) {
            sum += Character.getNumericValue(ch);
        }
        
        return sum;
    }
}