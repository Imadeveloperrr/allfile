import java.io.*;
import java.util.*;

public class p14425 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        HashSet<String> hashSet = new HashSet<>();
        for (int i=0; i<n; i++) 
            hashSet.add(reader.readLine());
        
        int sum=0;
        for (int i=0; i<m; i++) {
            if (hashSet.contains(reader.readLine())) {
                sum++;
            }
        }

        System.out.print(sum);
    }
}
