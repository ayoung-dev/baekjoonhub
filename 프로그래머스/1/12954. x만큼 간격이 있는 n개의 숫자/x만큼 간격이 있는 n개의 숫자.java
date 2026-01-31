class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for (int i = 0; n > 0;  i++) {
            answer[i] = (long) x * (i + 1);
            n--;
        }
        
        return answer;
    }
}