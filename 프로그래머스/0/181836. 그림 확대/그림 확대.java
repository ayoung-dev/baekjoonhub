import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        StringBuilder sb;
        ArrayList<String> array = new ArrayList<>();
        
        for (String pixel: picture) {
            sb = new StringBuilder();
            for (char ch: pixel.toCharArray()) {
                for(int i = 0; i < k; i++) {
                    sb.append(ch);
                }
            }
            for (int i = 0; i < k; i++) {
                array.add(sb.toString());
            }
        }
        
        return array.toArray(new String[array.size()]);
    }
}