import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p11653 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        
        if (n > 1) {
            System.out.println(n);
        }
    }
}