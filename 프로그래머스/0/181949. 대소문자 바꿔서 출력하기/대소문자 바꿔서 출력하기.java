import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        for (char ch: sc.next().toCharArray()) {
            if (ch >= 'a') sb.append((char)(ch - 32));
            else sb.append((char)(ch + 32));
        }
        
        System.out.println(sb.toString());
    }
}