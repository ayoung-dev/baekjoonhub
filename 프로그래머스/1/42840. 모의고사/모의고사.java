import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 1; i <= answers.length; i++) {
            int answer = answers[i - 1];
            
            if (answer == one[(i - 1) % one.length]) map.put(1, map.getOrDefault(1, 0) + 1);
            if (answer == two[(i - 1) % two.length]) map.put(2, map.getOrDefault(2, 0) + 1);
            if (answer == three[(i - 1) % three.length]) map.put(3, map.getOrDefault(3, 0) + 1);
        }
        
        int max = Collections.max(map.values());
    
        for (int key: map.keySet()) {
            if (map.get(key) == max) result.add(key);
        }
        
        return result.stream().mapToInt(x -> x).toArray();
        
    }
}