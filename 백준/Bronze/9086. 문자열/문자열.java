import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        String[] arr = new String[n];
        
        for(int i = 0; i < n; i++)
        {
            String st = scanner.next();
            arr[i] = st.substring(0, 1) + st.substring(st.length()-1);

         }
        scanner.close();
        
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}