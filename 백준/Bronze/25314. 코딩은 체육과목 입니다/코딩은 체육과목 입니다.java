//scanner import
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //scanner 선언
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt();
        
        int result = N / 4;

        for (int i = 0; i < result; i++){
            System.out.print("long ");
            
        }
        
        System.out.print("int");
        
        //scanner 닫기
        scanner.close();

    }
}