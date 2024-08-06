import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int N, int[][] road, int K) {
        int answer = 1;

        ArrayList<ArrayList<Node>> list = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList());
        }
        
        for (int i = 0; i < road.length; i++) {
            list.get(road[i][0]).add(new Node(road[i][0], road[i][1], road[i][2]));
            list.get(road[i][1]).add(new Node(road[i][1], road[i][0], road[i][2]));
        }
        
        Queue<Node> q = new LinkedList<>();
        int[] visit = new int[N+1];
        for (int i = 2; i < visit.length; i++) {
            visit[i] = Integer.MAX_VALUE;
        }
        q.addAll(list.get(1));
        
        while(!q.isEmpty()) {
            Node n = q.poll();
            if(visit[n.y] <= visit[n.x] + n.v)
                continue;
            visit[n.y] = visit[n.x] + n.v;
            q.addAll(list.get(n.y));
        }
        
        for (int i = 2; i < visit.length; i++) {
            if(visit[i] <= K)
                answer++;
        }
        return answer;
    }
    
    static class Node{
        int x, y, v;
        Node(int x, int y, int v) {
            this.x = x;
            this.y = y;
            this.v = v;
        }
    }
}