import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            for (int j = N - i - 1; j > 0; j--) {
                sb.append(" ");  
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                sb.append(" ");
            }
            for (int k = 2 * (N - i - 1) -1; k > 0; k--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        System.out.println(sb);
    }
}