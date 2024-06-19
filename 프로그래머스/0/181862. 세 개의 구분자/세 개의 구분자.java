import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] arr = myStr.replaceAll("[a-c]", " ").split(" ");
        
        List<String> list = new ArrayList<>();
        
        for (String s: arr) {
            if (!s.isEmpty())
                list.add(s);
        }
        
        if (list.size() < 1)
            list.add("EMPTY");
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}