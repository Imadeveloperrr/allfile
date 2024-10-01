import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2903 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int j = 1;
        int result=2;
        int out=0;
        for (int i=1; i<n+1; i++) {        
            result += j;
            out = result*result;
            j*=2;
        }
        System.out.printf("%d", out);
    }
}