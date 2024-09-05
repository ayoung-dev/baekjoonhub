class Solution {
    public int solution(String[] babbling) {
        
        String[] newBabbling = new String[babbling.length];
        for (int i = 0; i < newBabbling.length; i++){
            newBabbling[i] = babbling[i].replace("aya", "A").replace("ye","Y").replace("woo","W").replace("ma","M");
        }
  
        int answer = 0;
        
        for (String s: newBabbling) {
            if(s.toUpperCase().equals(s)){
                answer++;
            }
        }
        return answer;
    }
}