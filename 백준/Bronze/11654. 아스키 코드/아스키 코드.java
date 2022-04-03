//import
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
        //scanner 선언
		Scanner scanner = new Scanner(System.in);
        
        //입력받은 문자 아스키코드(int)로 바꿔서 입력 받기
		int asc = scanner.next().charAt(0);
        
        //아스키코드 값 출력
		System.out.print(asc);
	}
}