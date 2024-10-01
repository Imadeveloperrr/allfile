import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2903_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int result=2;
        for (int i=0; i<n; i++) 
            result += (result-1);
        int out = result*result;
        System.out.printf("%d", out);
    }
}
