class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            answer[i] = calc(quiz[i]);
        }
        return answer;
    }
    
    String calc (String str) {
        String[] arr = str.split(" ");
        int result = 0;
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[2]);
        
        if (arr[1].equals("+")) {
            result = x + y;
        } else {
            result = x - y;
        }
        
        return result == Integer.parseInt(arr[4]) ? "O" : "X";
    }
}