class Solution {
    public int solution(int n) {
        
        String s = Integer.toString(n);
        
        int answer = 0;
        
        for (char c: s.toCharArray()) {
            answer += (int) c - '0';
        }
        
        return answer;
    }
}