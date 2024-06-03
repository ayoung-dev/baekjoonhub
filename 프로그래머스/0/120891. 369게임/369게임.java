class Solution {
    public int solution(int order) {
        String str = String.valueOf(order);
        int count = 0;
        
        for (char ch: str.toCharArray()) {
            if (ch - '0' == 3 || ch - '0' == 6 || ch - '0' == 9) 
                count++;
        }
        
        return count;
    }
}