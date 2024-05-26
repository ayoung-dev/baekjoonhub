import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        
        for (int i: arr) { 
            for (int j: delete_list){
                if (i == j){
                    list.remove((Integer) i);
                    break;
                }

            }
        }
        
        int[] answer = list.stream().mapToInt(x->x).toArray();
        
        return answer;
    }
}