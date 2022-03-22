//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //입력값 없으면 멈추기
        while(scanner.hasNextInt()){
            
            //A 입력 받기
            int A = scanner.nextInt();
        
            //B 입력 받기
            int B = scanner.nextInt();
            
            //덧셈 출력
            System.out.println(A + B);
        }
          
        //scanner 닫기
        scanner.close();

    }
}