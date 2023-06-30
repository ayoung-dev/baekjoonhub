//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //첫 번재 숫자 입력 받기
        int num1 = scanner.nextInt();
        
        //두 번째 숫자 입력 받기
        int num2 = scanner.nextInt();
        
        //결과 출력
        System.out.println(num1 - num2);
        
        //scanner 닫기
        scanner.close();
    }
}