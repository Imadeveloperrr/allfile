import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class p2738 {
    
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int i=0, j=0;

        StringTokenizer token = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());
        int A[][] = new int[n][m];

        for (i=0; i<n; i++) {
            token = new StringTokenizer(reader.readLine());
            for (j=0; j<m; j++) {
                A[i][j] = Integer.parseInt(token.nextToken());
            }
        }

        for (i=0; i<n; i++) {
            token = new StringTokenizer(reader.readLine());
            for (j=0; j<m; j++) {
                System.out.printf("%d ", A[i][j] + Integer.parseInt(token.nextToken()));
            }
            System.out.println();
        }

    }
}
