//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //첫 번째 숫자 입력 받기
        int A = scanner.nextInt();
        
        //두 번째 숫자 입력 받기
        int B = scanner.nextInt();
        
        //A > B인 경우
        if (A > B)
            System.out.println(">");
        
        //A < B인 경우
		if (A < B)
            System.out.println("<");
        
        //A = B인 경우
		if (A == B)
            System.out.println("==");

        
        //scanner 닫기
        scanner.close();

    }
}