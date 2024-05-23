class Solution {
    public String solution(String phone_number) {
        /*
         char[] ch = phone_number.toCharArray();
         for(int i = 0; i < ch.length - 4; i ++){
             ch[i] = '*';
        }
        return String.valueOf(ch);
        */
        StringBuilder sb = new StringBuilder();
        int length = phone_number.length();
        
        for (int i = 0; i < length - 4; i++) {
            sb.append("*");
        }
        
        sb.append(phone_number.substring(length - 4));
        
        return sb.toString();
    }
}