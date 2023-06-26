import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        //총 갯수
        int count = scan.nextInt();
        
        //원하는 정수 갯수
        int result = 0;
        
        //배열
        int[] arr = new int[count];
        
        for(int i = 0; i < count; i++){
            arr[i] = scan.nextInt();
        }
        
        //원하는 정수
        int num = scan.nextInt();
        
        for(int j = 0; j < arr.length; j++){
            if(num == arr[j]){
                result++;
            }
        }
        
        System.out.println(result);
    }
}
