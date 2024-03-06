import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        //더하기
        System.out.println(n1 + n2);
        
        //빼기
        System.out.println(n1 - n2);
        
        //곱하기
        System.out.println(n1 * n2);
        
        //나누기 - 몫
        System.out.println(n1 / n2);
        
        //나누기 - 나머지
        System.out.println(n1 % n2);
        
        sc.close();
    }
}