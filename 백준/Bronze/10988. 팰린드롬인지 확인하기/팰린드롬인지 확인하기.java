import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        sb.append(sc.next());
        
        if (sb.toString().equals(sb.reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}