import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p27323 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(reader.readLine());
        int B = Integer.parseInt(reader.readLine());

        System.out.printf("%d", A*B);
    }
}