import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int min = Integer.MAX_VALUE;
    static int N;
    static int[] S;
    static int[] B;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        S = new int[N];
        B = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            S[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
        }
        subset(0, 1, 0, 0);
        System.out.println(min);
    }
    static void subset(int cnt, int mulSour, int sumBitter, int selectCount) {
        if (cnt == N) {
            if (selectCount > 0) {
                min = Math.min(min, Math.abs(mulSour - sumBitter));
            }
            return;
        }
        subset(cnt + 1, mulSour * S[cnt], sumBitter + B[cnt], selectCount+1);
        subset(cnt + 1, mulSour, sumBitter, selectCount);
    }
}
