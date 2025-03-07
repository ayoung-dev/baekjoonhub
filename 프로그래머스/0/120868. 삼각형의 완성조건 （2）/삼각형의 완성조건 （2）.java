class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max = Math.max(sides[0], sides[1]);
        int sum = sides[0] + sides[1];
        
        for (int i = Math.abs(sides[0] - sides[1]) + 1; i <= max; i++) {
            answer++;
        }
        
        for (int i = sum - 1; i > max; i--) {
            answer++;
        }
        
        return answer;
    }
}