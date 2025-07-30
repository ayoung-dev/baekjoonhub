import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int len = targets.length;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            String target = targets[i];
            String[] array = target.split("");
                 
            for (int j = 0; j < target.length(); j++) {
                String str = array[j];
                ArrayList<Integer> indexs = new ArrayList<>();
                
                for (int k = 0; k < keymap.length; k++) {
                    if (keymap[k].contains(str))
                        indexs.add(keymap[k].indexOf(str));
                }

                Collections.sort(indexs);
                if (indexs.size() > 0) {
                    answer[i] += indexs.get(0) + 1;
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}
