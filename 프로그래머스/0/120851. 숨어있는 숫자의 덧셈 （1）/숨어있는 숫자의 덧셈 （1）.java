class Solution {
    public int solution(String my_string) {
        
        int answer = 0;
        
        for (char ch: my_string.toCharArray()) {
            int num = (int) ch - '0';
            if (num < 10) {
                answer += num;
            }
        }
        
        return answer;
    }
}