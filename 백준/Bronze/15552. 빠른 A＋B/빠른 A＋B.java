//import
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    //Exception 꼭 잡아주기
    public static void main(String[] args) throws IOException{
        
        //BufferReader 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //BufferWriter 선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //T 입력 받기
        //readLine은 string 타입이라 형변환!!
        int T = Integer.parseInt(br.readLine());
        
        //stringtokenizer --> 문자 분리
        StringTokenizer st;
        
        //덧셈 계산
        for (int i = 0; i < T; i++) {
		//각 줄 문자 공백으로 분리!!
		st = new StringTokenizer(br.readLine()," ");
		//출력
		bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+ "\n");
	}
	    
        //BufferReader 닫기
	br.close();
        
        //Buffer 비우기
	bw.flush();
        //BufferWriter 닫기
	bw.close();

    }
}
