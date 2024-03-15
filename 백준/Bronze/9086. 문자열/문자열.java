import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            String S = br.readLine();
            
            //char + 연산자 사용하면 아스키코드값이 더해짐!
            System.out.print(S.charAt(0));
            System.out.println(S.charAt(S.length() - 1));
        }
        
        br.close();
    }
}