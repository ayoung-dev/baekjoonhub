//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //년도 입력 받기
        int year = scanner.nextInt();
        
        //4의 배수이면서 100의 배수가 아닐 때 & 400의 배수일 때
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            //맞으면 1 출력
            System.out.println(1);
        else
            //아니면 0 출력
            System.out.println(0);
        
        //scanner 닫기
        scanner.close();

    }
}