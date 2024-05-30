import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        List<Integer> list = new ArrayList<>();
        
        if (direction.equals("left")){
            for (int i = 1; i < numbers.length; i++) {
                list.add(numbers[i]);
            }
            list.add(Integer.valueOf(numbers[0]));
        } else {
            list.add(Integer.valueOf(numbers[numbers.length-1]));
            for (int i = 0; i < numbers.length -1; i++) {
                list.add(Integer.valueOf(numbers[i]));
            }
        }
        
        int[] arr = list.stream().mapToInt(x->x).toArray();
        
        return arr;
    }
}