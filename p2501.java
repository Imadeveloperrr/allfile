import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class p2501 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int N = Integer.parseInt(token.nextToken());
        int K = Integer.parseInt(token.nextToken());
        ArrayList<Integer> divisor = new ArrayList<>();
        
        for (int i=1; i<=N; i++) {
            if (N%i == 0)
                divisor.add(i);
        }

        if (divisor.size() >= K)
            System.out.printf("%d", divisor.get(K-1));
        else
            System.out.print("0");
    }
}
