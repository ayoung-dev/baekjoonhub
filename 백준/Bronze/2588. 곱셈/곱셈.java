//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //(1) 숫자 입력 받기
        int num1 = scanner.nextInt();
        
        //(2) 숫자 입력 받기
        int num2 = scanner.nextInt();
        
        //(3) 결과 출력
        System.out.println(num1 * (num2 % 10));
        
        //(4) 결과 출력
		System.out.println(num1 * (num2 % 100 / 10));
        
        //(5) 결과 출력
		System.out.println(num1 * (num2 / 100));
        
        //(6) 결과 출력
        System.out.println(num1 * num2);
        
        //scanner 닫기
        scanner.close();

    }
}