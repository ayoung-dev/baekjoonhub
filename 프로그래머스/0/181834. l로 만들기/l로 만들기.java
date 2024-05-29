class Solution {
    public String solution(String myString) {
        for(char ch: myString.toCharArray()) {
            if ('l' > ch) {
                myString = myString.replace(ch, 'l');
            }
}
        return myString;
    }
}