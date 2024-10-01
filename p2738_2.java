import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2738_2 {

    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(token.nextToken());

        StringBuilder str = new StringBuilder();

        String matrix[] = new String[n*2];

        for (int i=0; i<n*2; i++)
            matrix[i] = reader.readLine();

        for (int i=0; i<n; i++) {
            StringTokenizer token2 = new StringTokenizer(matrix[i]);
            StringTokenizer token3 = new StringTokenizer(matrix[i+n]);
            while(token2.hasMoreTokens())
                str.append(Integer.parseInt(token2.nextToken())+Integer.parseInt(token3.nextToken()) + " ");
            str.append("\n");
        }
        System.out.printf("%s", str);
    }
}
