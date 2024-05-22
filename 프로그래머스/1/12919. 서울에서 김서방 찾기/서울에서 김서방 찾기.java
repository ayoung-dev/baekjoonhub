import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(seoul));
        
        return "김서방은 " + arr.indexOf("Kim") + "에 있다";
    }
}