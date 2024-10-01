import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1978_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        StringTokenizer token = new StringTokenizer(reader.readLine());
        int primeCount = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(token.nextToken());
            if (isPrime(num)) {
                primeCount++;
            }
        }

        System.out.println(primeCount);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}