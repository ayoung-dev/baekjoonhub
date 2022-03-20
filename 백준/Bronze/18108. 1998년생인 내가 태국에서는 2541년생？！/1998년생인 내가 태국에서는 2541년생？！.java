//Scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //불기 입력 받기
        int year = scanner.nextInt();
        
        //서기로 출력하기
        System.out.println(year - 543);
        
        //scanner 닫기
        scanner.close();
    }
}