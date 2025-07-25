class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 1;
        int start = section[0];
        
        for (int i = 1; i < section.length; i++) {
            if (start + m - 1 < section[i]) {
                start = section[i];
                count++;
            } 
        }
        return count;
    }
}