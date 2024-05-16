import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        int B = sc.nextInt();
        
        int tmp = 1;
        int result = 0;
        
        for (int i = N.length() - 1; i >= 0; i--) {
            char c = N.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                result += (c - 'A' + 10) * tmp;
            } else {
                result += (c - '0') * tmp;
            }
            tmp *= B;
            
        }
        
        System.out.println(result);
        
        sc.close();
    }
}