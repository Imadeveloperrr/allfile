import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1978 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer token = new StringTokenizer(reader.readLine());
        int out=0;
        
        for (int i=0; i<N; i++) {
            int v = Integer.parseInt(token.nextToken());
            if (v > 1) {
                for (int j=2; j<v+1; j++) {
                    if (j == v)
                        out++;
                    if (v%j==0)
                        break;
                }
            }
        }
        System.out.print(out);
    }
}