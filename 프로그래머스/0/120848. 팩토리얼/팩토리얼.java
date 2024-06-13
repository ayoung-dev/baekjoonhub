class Solution {
    public int solution(int n) {
        int num = 1, k = 0;
        
        while(n >= num) {
            num *= ++k;
        }
        
        return k - 1;
    }
}