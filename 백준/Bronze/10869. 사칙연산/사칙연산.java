import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        
        //더하기
        System.out.println(n1 + n2);
        
        //빼기
        System.out.println(n1 - n2);
        
        //곱하기
        System.out.println(n1 * n2);
        
        //나누기 - 몫
        System.out.println(n1 / n2);
        
        //나누기 - 나머지
        System.out.println(n1 % n2);
        
        br.close();
    }
}