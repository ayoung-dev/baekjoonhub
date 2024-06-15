import java.util.Arrays;

class Solution {
    public String solution(String s) {
        int[] arr = new int[s.length()];
        String[] sArr = s.split("");
        
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.length() - s.replaceAll(sArr[i], "").length();
        }
        
        String answer = "";
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                answer += sArr[i];
        }
        
        String[] ans = answer.split("");
        Arrays.sort(ans);
        
        return String.join("", ans);
        
    }
}