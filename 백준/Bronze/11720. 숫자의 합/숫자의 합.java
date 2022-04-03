//import
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
        //scanner 선언
		Scanner scanner = new Scanner(System.in);
        
        //숫자 갯수 입력받기
		int n = scanner.nextInt();
        
        //공백없이 입력된 숫자 문자로 받기
        String s = scanner.next();
        
        //더한 값 선언
        int sum = 0;
        
        //한글자씩 잘라서 string --> int 값으로 바꿔서 더하기
        for(int i = 0; i < n; i++) {
			sum += s.charAt(i)-'0';
		}
        
        //결과 출력
		System.out.print(sum);
        
        //scanner 닫기
        scanner.close();
	}
}