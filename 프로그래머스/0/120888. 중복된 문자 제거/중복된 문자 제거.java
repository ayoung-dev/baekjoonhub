class Solution {
    public String solution(String my_string) {
        
        String[] str = my_string.split("");
        String answer = "";
        
        for (String st: str) {
            if (!answer.contains(st))
                answer += st;
        }
        
        return answer;
    }
}