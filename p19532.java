import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p19532 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int a = Integer.parseInt(token.nextToken());
        int b = Integer.parseInt(token.nextToken());
        int c = Integer.parseInt(token.nextToken());
        int d = Integer.parseInt(token.nextToken());
        int e = Integer.parseInt(token.nextToken());
        int f = Integer.parseInt(token.nextToken());

        int denominator = a * e - b * d;  
        int x = (c * e - b * f) / denominator;
        int y = (a * f - c * d) / denominator;

        System.out.println(x + " " + y);
    }
}
