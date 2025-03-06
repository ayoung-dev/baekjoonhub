class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        int answer = Integer.parseInt(str[0]);
        
        for (int i = 1; i < str.length; i += 2) {
            int num = Integer.parseInt(str[i + 1]);
                
            if (str[i].equals("+")) {
                answer += num;
            } else {
                answer -= num;
            }
        }
        
        return answer;
    }
}