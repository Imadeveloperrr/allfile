import java.io.*;
import java.util.*;

public class p10816 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        StringTokenizer token = new StringTokenizer(reader.readLine());

        HashMap<Integer, Integer> card = new HashMap<>();

        for (int i=0; i<n; i++) {
            int key = Integer.parseInt(token.nextToken());
            card.put(key, card.getOrDefault(key, 0) + 1);
        }
            

        StringBuilder result = new StringBuilder();
        int m = Integer.parseInt(reader.readLine());
        token = new StringTokenizer(reader.readLine());

        for (int i=0; i<m; i++) {
            int num = Integer.parseInt(token.nextToken());
            if (card.containsKey(num)) {
                result.append(card.get(num));
                result.append(" ");
            }
            else 
                result.append("0 ");

        }
        System.out.print(result);
    }
}