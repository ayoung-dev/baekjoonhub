import java.util.*;

class Solution {
    public String solution(String letter) {
        List<String> morse = new ArrayList<>(Arrays.asList(".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                                                           "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."));
        
        String[] arr = letter.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (String s: arr) {
            sb.append((char) (morse.indexOf(s) + 'a'));
        }
        
        return sb.toString();
    }
}