class Solution {
    public String solution(int age) {
        String str = String.valueOf(age);
        String answer = "";
        
        for (char ch: str.toCharArray()) {
            answer += (char) (ch - '0' + 'a');
        }
        
        return answer;
    }
}