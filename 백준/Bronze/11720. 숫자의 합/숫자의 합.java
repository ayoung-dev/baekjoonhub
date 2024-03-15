import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        String st = sc.next();
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            //아스키코드 값 - '0' = 숫자 값
            sum += st.charAt(i) - '0';
        }
        
        System.out.println(sum);
        
        sc.close();
    }
}