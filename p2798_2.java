import java.io.*;
import java.util.*;

public class p2798_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer token = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(token.nextToken()); 
        int max = Integer.parseInt(token.nextToken());

        int card[] = new int[N];
        token = new StringTokenizer(reader.readLine());
        for (int i=0; i<N; i++)
            card[i] = Integer.parseInt(token.nextToken());

        int sumMax = 0;
        for (int i=0; i<N-2; i++) {
            for (int j=i+1; j<N-1; j++) {
                for (int k=j+1; k<N; k++) {
                    int sum = card[i] + card[j] + card[k];
                    if (sum <= max && sum >= sumMax)
                        sumMax = sum;
                }
            }
        }
        System.out.print(sumMax);
    }
}
