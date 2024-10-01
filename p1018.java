import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1018 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        int total=0;
        int rest=0;

        while (true) {
            
            if (N>5) {
                total = N/5;
                rest = N%5;
                
            }

        }
    }
}
