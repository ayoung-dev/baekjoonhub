class Solution {
    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        
        while (k > 0) {
            answer.append(my_string);
            k--;
        }
        
        return answer.toString();
        
        //return my_string.repeat(k);
    }
}