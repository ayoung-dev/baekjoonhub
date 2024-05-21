class Solution {
    public int solution(int n) {
        
        int result = 2;
        
        while(true) {
            if(n % result == 1) return result;
            result++;
        }
    }
}