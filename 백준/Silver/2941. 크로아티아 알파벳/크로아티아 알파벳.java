import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String S = sc.nextLine();
        
        String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (int i = 0; i < arr.length; i++) {
            if (S.contains(arr[i])) {
                S = S.replace(arr[i], "!");
            }
        }
        
        System.out.println(S.length());
        
        sc.close();
    }
}