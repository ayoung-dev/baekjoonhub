import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            
            //char + 연산자 사용하면 아스키코드값이 더해짐!
            System.out.print(S.charAt(0));
            System.out.println(S.charAt(S.length() - 1));
        }
        
        sc.close();
    }
}