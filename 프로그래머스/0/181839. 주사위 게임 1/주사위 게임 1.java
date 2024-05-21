class Solution {
    public int solution(int a, int b) {
        if ((a + b) % 2 != 0) return 2*(a+b);
        else if (a % 2 != 0) return a*a + b*b;
        else return (int) Math.sqrt(Math.pow(a-b,2));
    }
}