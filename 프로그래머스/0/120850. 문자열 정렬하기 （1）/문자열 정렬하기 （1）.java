import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();
        
        for (char ch: my_string.toCharArray()) {
            if (ch - '0' <= 9)
                list.add(ch - '0');
        }
        
        int[] arr = list.stream().mapToInt(x->x).toArray();
        Arrays.sort(arr);
        
        return arr;
    }
}