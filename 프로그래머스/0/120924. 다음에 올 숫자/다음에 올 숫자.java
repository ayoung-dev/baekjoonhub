class Solution {
    public int solution(int[] common) {
        int x1 = common[0];
        int x2 = common[1];
        int x3 = common[2];
        int last = common[common.length - 1];
        
        if(x3 - x2 == x2 - x1) {
            return last + (x3 - x2);
        } else {
            return last * (x3 / x2);
        }
    }
}