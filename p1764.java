import java.io.*;
import java.util.*;

public class p1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        HashSet<String> set = new HashSet<>();

        for (int i=0; i<n; i++)
            set.add(reader.readLine());

        List<String> arr = new ArrayList<>();

        for (int i=0; i<m; i++) {
            String st = reader.readLine();
            if(set.contains(st)) 
                arr.add(st);
        }

        Collections.sort(arr);
        int size = arr.size();
        System.out.println(size);
        for (int i=0; i<size; i++) {
            System.out.println(arr.get(i));
        }
    }
}
