class Solution {
    public int[] solution(long n) {
        String str = String.valueOf(n);
        int[] answer = new int[str.length()];
        int idx = str.length() -1;
        
        for (char ch: str.toCharArray()){
            answer[idx--] = Character.getNumericValue(ch);
        }
        
        return answer;
    }
}