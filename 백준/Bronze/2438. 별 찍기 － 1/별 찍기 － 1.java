import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < N + 1; i++) {
            for (int j = 0; j < i; j++)
                sb.append("*");
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        
        br.close();
        bw.flush();
        bw.close();
    }
}