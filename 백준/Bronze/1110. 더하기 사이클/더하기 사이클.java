//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //N 입력 받기
        int N = scanner.nextInt();
        
        //확인용
        int check = N;
        
        //횟수 count용
        int count = 0;
        
        while(true){
            
            /*있는 
            //자른 숫자 보관
            int num1 = 0;
            int num2 = N % 10;
            
            //N이 10보다 크면 10의 자리 num1으로 
            if (N > 10)
                num1 = N / 10;
               
            //두 수 더해주기
            int newNum = num1 + num2;
            
            //더한 수의 뒷자리
            int number = newNum % 10;
            
            //N의 뒷자리와 새로운 수 붙이기
            int out = (num2 * 10) + number;
            
            //횟수 count
            count++;
            
            //만약 N과 같다면
            if (check == out){
                //횟수 출력 후 break;
                System.out.println(count);
                break;
            } else 
                //다르면 N 값에 대입해 계속 반복 진행
                N = out;
                */
            
            //N의 뒷자리에 10을 곱한 수와 두 자리를 더한 것에서 뒷자리를 더한 값을 N에 넣기
             N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            
            count++;
            
            //만약 새로운 N과 처음의 N이 같다면 count 출력 후 break
            if (check == N) {
                System.out.println(count);
				break;
			}
        }
          
        //scanner 닫기
        scanner.close();

    }
}