import java.io.*;
import java.util.*;

public class p10814_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        String arr[][] = new String[n][2];
        // 0 = 나이, 1 = 이름
        for (int i=0; i<n; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine());
            arr[i][0] = token.nextToken();
            arr[i][1] = token.nextToken();
        }

        Arrays.sort(arr, Comparator.comparingInt(o -> Integer.parseInt(o[0])));
        
        for (int i=0; i<n; i++)
            System.out.println(arr[i][0] + " " + arr[i][1]);
    }    
}
