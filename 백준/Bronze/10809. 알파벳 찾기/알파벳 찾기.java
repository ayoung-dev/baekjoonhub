import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String S = br.readLine();
        
        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(S.indexOf(ch) + " ");
        }
        
        System.out.println(sb);
        
        br.close();       
    }
}