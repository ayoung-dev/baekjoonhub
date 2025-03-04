class Solution {
    public String[] solution(String my_str, int n) {
        int length = my_str.length() / n;
        if (my_str.length() % n != 0)
            length++;

        String[] answer = new String[length];
        
        for (int i = 0; i < length; i++) {
            answer[i] = my_str.substring(i * n, Math.min(n * (i + 1), my_str.length()));
        }
        
        return answer;
    }
}