//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //첫 번째 숫자 입력 받기
        long num1 = scanner.nextLong();
        
        //두 번째 숫자 입력 받기
        long num2 = scanner.nextLong();
        
        //세 번째 숫자 입력 받기
        long num3 = scanner.nextLong();
        
        //계산하기
        long result = num1 + num2 + num3;
        
        //결과 출력
        System.out.println(result);

    }
}