//Scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //첫 번째 숫자 입력 받기
        int A = scanner.nextInt();
        
        //두 번째 숫자 입력 받기
        int B = scanner.nextInt();
        
        //세 번째 숫자 입력 받기
        int C = scanner.nextInt();
        
        //(A+B)%C 결과 출력하기
        System.out.println((A + B) % C);
        
        //((A%C) + (B%C))%C 결과 출력하기
        System.out.println(((A % C) + (B % C)) % C);
        
        //(A×B)%C 결과 출력하기
        System.out.println((A * B) % C);
        
        //((A%C) × (B%C))%C 결과 출력하기
        System.out.println(((A % C) * (B % C)) % C);
        
        //scanner 닫기
        scanner.close();
    }
}