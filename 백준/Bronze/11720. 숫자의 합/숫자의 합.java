import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //쓰지 않아서 변수로 안 받음
        br.readLine();

        int sum = 0;
        
        //getBytes() : 문자열을 byte 배열로 변환
        for (byte value : br.readLine().getBytes()) {
            sum += value - '0';
        }
        
        System.out.println(sum);
        
        br.close();
    }
}