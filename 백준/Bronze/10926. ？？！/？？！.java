//Scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        //아이디 입력 받기
        String id = scanner.next();
        
        //??! 추가해서 출력하기
        System.out.println(id + "??!");
        
        //scanner 닫기
        scanner.close();
    }
}