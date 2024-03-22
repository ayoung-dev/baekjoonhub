import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        sb.append(br.readLine());
        
        System.out.println(sb.toString().equals(sb.reverse().toString()) ? 1 : 0);

        br.close();
    }
}