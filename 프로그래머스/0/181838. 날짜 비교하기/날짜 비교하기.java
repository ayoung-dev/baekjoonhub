class Solution {
    public int solution(int[] date1, int[] date2) {
        String d1 = "", d2 = "";
        
        for (int i = 0; i < 3; i++) {
            d1 += String.valueOf(date1[i]);
            d2 += String.valueOf(date2[i]);
        }
        
        if (Integer.parseInt(d1) < Integer.parseInt(d2)) return 1;
        else return 0;
    }
}