//import
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

    //scanner 선언
	Scanner scanner = new Scanner(System.in);
    
	//숫자 2개 입력 받기 
	int A = scanner.nextInt();
	int B = scanner.nextInt();
    
	//scanner 닫기 
    scanner.close();
    
    //int 값 --> StringBuilder를 통해 reverse 함수를 사용하여 뒤집기
    //뒤집은 값 --> String --> int
	A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
	B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
	
	//둘 중 큰 값 출력  
	System.out.print(A > B ? A : B);
	
	}
}