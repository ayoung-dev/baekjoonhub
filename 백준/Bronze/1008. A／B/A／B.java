//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //첫 번재 숫자 입력 받기
        double num1 = scanner.nextDouble();
        
        //두 번째 숫자 입력 받기
        double num2 = scanner.nextDouble();
        
        //결과 출력
        System.out.println(num1 / num2);
        
        //scanner 닫기
        scanner.close();
    }
}