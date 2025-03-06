class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] str = my_string.toCharArray();
        
        for (int[] rev : queries) {
            int s = rev[0];
            int e = rev[1];
            
            while (s < e) {
                char tmp = str[s];
                str[s] = str[e];
                str[e] = tmp;
                s++;
                e--;
            }
        }
        
        return new String(str);
    }
}