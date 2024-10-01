import java.io.BufferedReader;
import java.io.InputStreamReader;
public class p2720_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stb = new StringBuilder();

        int n = Integer.parseInt(reader.readLine());

        for (int i=0; i<n; i++) {
            int rest = Integer.parseInt(reader.readLine());
            int Q = rest/25; rest -= Q*25;
            int D = rest/10; rest -= D*10;
            int M = rest/5; rest -= M*5;
            int N = rest/1; rest -= N*1;
            stb.append(Q).append(" ").append(D).append(" ").append(M).append(" ").append(N);
            stb.append("\n");
        }
        System.out.print(stb);
    }
}
