import java.util.*;
import java.io.*;

public class p7785 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        HashSet<String> hashSet = new HashSet<>();
        StringTokenizer token;

        for (int i=0; i<n; i++) {
            token = new StringTokenizer(reader.readLine());
            String Key = token.nextToken();
            if (!hashSet.contains(Key))
                hashSet.add(Key);
            else
                hashSet.remove(Key);
        }

        List<String> hash = new ArrayList<>(hashSet);
        hash.sort(Comparator.reverseOrder());

        for (String str : hash)
            System.out.println(str);
    }
}
