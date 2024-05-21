class Solution {
    boolean solution(String s) {
        int countP = 0, countY = 0; 
        s = s.toLowerCase();
        
        for (char ch: s.toCharArray()) {
            if (ch == 'p') countP++;
            else if (ch == 'y') countY++;
        }
        
        return countP == countY;
    }
}