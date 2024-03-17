import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        int time = 0;
        
        while(true) {
            int value = System.in.read();
            
            if(value == '\n') break;
            
            if (value < 68) 
                time += 3;
            else if (value < 71)
                time += 4;
            else if (value < 74)
                time += 5;
            else if (value < 77)
                time += 6;
            else if (value < 80)
                time += 7;
            else if (value < 84)
                time += 8;
            else if (value < 87)
                time += 9;
            else 
                time += 10;
        }
        System.out.println(time);
    }
}