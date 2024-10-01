import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2839 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int count=0;

        while (N>=0) {
            if (N % 5 == 0) {
                count+=N/5;
                System.out.print(count);
                return;
            }
            N-=3;
            count++;
        }
        System.out.print("-1");
    }
}
