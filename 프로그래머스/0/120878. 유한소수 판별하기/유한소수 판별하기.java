class Solution {
    public int solution(int a, int b) {
        int max = 1;
        
        for (int i = 2; i <= a; i++) {
            if (a % i == 0 && b % i == 0) max = i;
        }
        
        b /= max;
        
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;
        
        return b == 1 ? 1 : 2;
    }
}