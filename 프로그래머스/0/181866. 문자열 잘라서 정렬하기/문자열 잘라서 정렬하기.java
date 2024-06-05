import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] str = myString.split("x");
        
        List<String> list = new ArrayList<>();
        
        for (String st: str) {
            if (!st.isEmpty())
                list.add(st);
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        Arrays.sort(answer);
        
        return answer;
    }
}