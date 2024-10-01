import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2869 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(reader.readLine());

        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int V = Integer.parseInt(token.nextToken());
        int day;
        if ((V - B) % (A - B) == 0) {
            day = (V - B) / (A - B);
        } else {
            day = (V - B) / (A - B) + 1;
        }
        System.out.printf("%d", day);
    }
}
