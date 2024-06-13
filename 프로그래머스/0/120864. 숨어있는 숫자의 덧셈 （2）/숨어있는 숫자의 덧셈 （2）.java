class Solution {
    public int solution(String my_string) {
        String[] arr = my_string.split("[^0-9]");
        int answer = 0;
        
        for (String s: arr) {
            if (!s.trim().isEmpty())
                answer += Integer.parseInt(s);
        }
        
        return answer;
    }
}