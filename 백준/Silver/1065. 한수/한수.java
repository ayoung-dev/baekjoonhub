//import
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
        //scanner 선언
	Scanner scanner = new Scanner(System.in);
		
        //결과 출력
	System.out.print(sequence(scanner.nextInt()));
        
        //scanner 닫기
	scanner.close();
 
		
	}
 
    	//등차수열 함수
	public static int sequence(int num) {
        //한수 개수 count
	int cnt = 0; 
 
        //두자리수 숫자까지는 모두 한수
	if (num < 100) {
		return num;
	}
 
        //100이상이라면
	else {
		//1~99까지의 한수 더해주기
		cnt = 99;
            
            	//반드시 예외로 따로 해줘야함!!!!!
            	//만약 입력값이 1000이라면 --> 세자리수 만들어주기
            	//어차피 1000은 한수가 아님
		if (num == 1000) {
			num = 999;
		}
 
            	//한수인지 계산
		for (int i = 100; i <= num; i++) {
                	//100의 자리
			int hun = i / 100;
                	//10의 자리
			int ten = (i / 10) % 10;
                	//1의 자리
			int one = i % 10;
 
                	//만약 100의 자리 - 10의 자리 == 10의 자리 - 1의 자리
                	//즉, 수열을 이룬다면
			if ((hun - ten) == (ten - one)) { 
                    		//count + 1
				cnt++;
			}
		}
	}
	//한수 count 반환
	return cnt;
	}
 
}
