class Solution {
    public int solution(int a, int b) {
        
        StringBuilder sum = new StringBuilder();
        
        sum.append(a);
        sum.append(b);
        
        if (2 * a * b > Integer.parseInt(sum.toString()))
            return 2 * a * b;
        return Integer.parseInt(sum.toString());
    }
}