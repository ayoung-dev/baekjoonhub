import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int M,  N, K;
    static boolean[][] visited;
    static boolean[][] cabbages;
    static int[][] vector = {{1, 0, -1, 0}, {0, 1, 0, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            visited = new boolean[M][N];
            cabbages = new boolean[M][N];
            int cnt = 0;
            
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int X = Integer.parseInt(st.nextToken());
                int Y = Integer.parseInt(st.nextToken());
                cabbages[X][Y] = true;
            }

            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (cabbages[x][y] && !visited[x][y]) {
                        dfs(x, y);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }

    }

    static void dfs(int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int cx = x + vector[0][i];
            int cy = y + vector[1][i];

            if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                if (!visited[cx][cy] && cabbages[cx][cy]) {
                    dfs(cx, cy);
                }
            }

        }
    }

}