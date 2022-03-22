//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            
            //A 입력 받기
            int A = scanner.nextInt();
        
            //B 입력 받기
            int B = scanner.nextInt();
            
            if (A == 0 && B == 0)
                break;
            
            System.out.println(A + B);
        }
          
        //scanner 닫기
        scanner.close();

    }
}