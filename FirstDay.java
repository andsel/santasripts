import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstDay {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        c = buffer.read();
        int num = c - 48;
        int oldNum = num;
        int firstNum = num;

        int total = 0;
        while((c = buffer.read()) != -1) {
        	char character = (char) c; // -48
            num = c - 48;
        	if (num < 0) {
        		if (oldNum == firstNum) {
        			total += firstNum;
        		}
        		System.out.println("Total: " + total);	
	        	return;
	        }
	        if (num == oldNum) {
	        	total += num;
	        }
            oldNum = num;	
            //System.out.println(character + " ch: " + num);
        }       
    }   
}