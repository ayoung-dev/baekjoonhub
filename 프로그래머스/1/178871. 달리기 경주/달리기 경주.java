import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> rank = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            rank.put(players[i], i);
        }
    
        for (String over: callings) {
            int num = rank.get(over);
            
            String front = players[num - 1];
            players[num - 1] = over;
            players[num] = front;
            
            rank.put(over, num -1);
            rank.put(front, num);
        }
        
        return players;
    }
}