import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int idx = 0;
        
        while(idx < n) {
            System.out.print(str);
            idx++;
        }
    }
}