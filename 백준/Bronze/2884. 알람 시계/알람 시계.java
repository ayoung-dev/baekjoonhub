import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        if (M < 45){
            H--;
            M = 60 - (45 - M);
            
            //만약 H가 0보다 작다면
            if (H < 0)
                 H = 23; 

            System.out.println(H + " " + M);
            
        } else
            System.out.println(H + " " + (M - 45));
        
        sc.close();

    }
}