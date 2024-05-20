class Solution {
    public String solution(String my_string) {
        
        String answer = "";
        
        for (char ch: my_string.toCharArray()) {
            if (ch >= 'a') answer += Character.toUpperCase(ch); 
            else answer += Character.toLowerCase(ch); 
        }
        
        return answer;
    }
}