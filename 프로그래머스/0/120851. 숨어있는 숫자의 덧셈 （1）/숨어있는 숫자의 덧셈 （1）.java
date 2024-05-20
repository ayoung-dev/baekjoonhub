class Solution {
    public int solution(String my_string) {
        
        int answer = 0;
        
        for (int i = 0; i < my_string.length(); i++){
            int num = (int) my_string.charAt(i) - '0';
            if (num < 10) {
                answer += num;
            }
        }
        
        return answer;
    }
}