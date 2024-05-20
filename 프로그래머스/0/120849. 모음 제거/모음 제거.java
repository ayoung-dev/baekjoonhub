import java.util.*;

class Solution {
    public String solution(String my_string) {
        //return my_string.replaceAll("[aeiou]", "");
        
        String answer = "";
        
        ArrayList<Character> aeiou = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (!aeiou.contains(c))
                answer += c;
        }
        
        return answer;
    }
}