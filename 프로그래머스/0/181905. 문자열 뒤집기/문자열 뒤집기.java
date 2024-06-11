class Solution {
    public String solution(String my_string, int s, int e) {
        String slice = my_string.substring(s, e + 1);
        
        StringBuilder sb = new StringBuilder(slice);
        
        return my_string.substring(0, s) + sb.reverse().toString() + my_string.substring(e + 1);
    }
}