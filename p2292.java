import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2292 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int j = 1;
        int count = 1;
        int increase = 6;
        while(true) {
            if (count >= n) break;
            count += increase*j;
            j++;
        }
        System.out.println(j);
        
    }
}