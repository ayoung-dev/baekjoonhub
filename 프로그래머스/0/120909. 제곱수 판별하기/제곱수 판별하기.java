class Solution {
    public int solution(int n) {
        return Math.sqrt(n) == (int) Math.sqrt(n) ? 1 : 2;
        //return Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}