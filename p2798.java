import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2798 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(token.nextToken());
        int max = Integer.parseInt(token.nextToken());
        token = new StringTokenizer(reader.readLine());

        int[] cards = new int[n];
        for (int i=0; i<n; i++) 
            cards[i] = Integer.parseInt(token.nextToken());

        int maxSum = 0;

        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= max && sum > maxSum)
                        maxSum = sum;
                }
            }
        }

        System.out.print(maxSum);
    }
}
