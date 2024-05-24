class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for (char ch: s.toCharArray()) {
            if (ch == '(') count++;
            else if (count > 0) count--;
            else return false;
        }
        
        return count == 0 ? true : false;
    }
}