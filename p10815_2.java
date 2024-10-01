import java.io.*;
import java.util.*;

public class p10815_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        StringTokenizer token = new StringTokenizer(reader.readLine());

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0; i<n; i++) 
            hashSet.add(Integer.parseInt(token.nextToken()));

        int m = Integer.parseInt(reader.readLine());
        token = new StringTokenizer(reader.readLine());
        StringBuilder result = new StringBuilder();

        for (int i=0; i<m; i++) {
            int num = Integer.parseInt(token.nextToken());
            if (hashSet.contains(num)) 
                result.append("1 ");
            else
                result.append("0 ");
        }

        System.out.print(result);
    }
}
