class Solution {
    public int solution(int[] common) {
        int x = common[1] - common[0];
        int y = common[2] - common[1];
        int last = common[common.length - 1];
        
        if(x == y) {
            return last + x;
        } else {
            return last * (y / x);
        }
    }
}