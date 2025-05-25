class Solution {
    public int[] solution(int num, int total) {
        int[] result = new int[num];
        int n = (total / num) - (num / 2);
        
        if (total % num != 0) n++;
        
        for (int i = 0; i < num; i++) {
            result[i] = n++;
        }

        return result;
    }
}