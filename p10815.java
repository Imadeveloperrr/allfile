import java.io.*;
import java.util.*;

public class p10815 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        StringTokenizer token = new StringTokenizer(reader.readLine());
        
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i=0; i<N; i++)
            hashSet.add(Integer.parseInt(token.nextToken()));

        StringBuilder result = new StringBuilder();
        int M = Integer.parseInt(reader.readLine());
        token = new StringTokenizer(reader.readLine());
        for (int i=0; i<M; i++) {
            int num = Integer.parseInt(token.nextToken());

            if (hashSet.contains(num)) 
                result.append("1 ");
            else
                result.append("0 ");
        }

        System.out.print(result);
    }    
}
