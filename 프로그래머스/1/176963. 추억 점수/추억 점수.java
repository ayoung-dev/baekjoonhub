import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int idx = 0;
        
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            if (i >= yearning.length) map.put(name[i], 0);
            else map.put(name[i], yearning[i]);
        }
        
        for (String[] member : photo) {
            int sum = 0;
            for (String person : member) {
                sum += map.getOrDefault(person, 0);
            }
            answer[idx] = sum;
            idx++;
        }
        
        return answer;
    }
}