import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p11005_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());
        StringBuilder result = new StringBuilder();

        int N = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());

        while (N>0) {
            int rest = N%B;
            if (rest < 10)
                result.append(rest);
            else {
                char c = (char) (rest + 55);
                result.append(c);
            }
            N/=B;
        }

        System.out.print(result.reverse());
    }
}