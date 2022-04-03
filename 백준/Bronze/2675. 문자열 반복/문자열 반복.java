//import
import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
 
        //scanner 선언
		Scanner scanner = new Scanner(System.in);
        
        //T 입력 받기 
        int T = scanner.nextInt();
        
        //T만큼 반복
        for (int i = 0; i < T; i++){
            //반복 횟수 R 입력 받기
            int R = scanner.nextInt();
            
            //문자열 입력 받기
            String S = scanner.next();
            
            //S 문자열 하나씩 잘라서 반복
            for(int j = 0; j < S.length(); j++) {    
                //R만큼씩 반복해서 출력
				for(int k = 0; k < R; k++) 
					System.out.print(S.charAt(j));
			}
            //한 문자 끝나면 줄바꿈
            System.out.println();
        }
        
        //scanner 닫기
        scanner.close();
	}
}