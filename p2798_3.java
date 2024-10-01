import java.io.*;
import java.util.*;

public class p2798_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(token.nextToken());
        int max = Integer.parseInt(token.nextToken());

        token = new StringTokenizer(reader.readLine());
        int card[] = new int[n];
        for (int i=0; i<n; i++)
            card[i] = Integer.parseInt(token.nextToken());
        
        int sumMax=0;
        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                for (int k=j+1; k<n; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if (sum <= max && sum > sumMax)
                        sumMax = sum;
                }
            }
        }

        System.out.println(sumMax);
    }
}
