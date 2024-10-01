import java.io.*;
import java.util.*;

public class p10814 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(reader.readLine());
        StringTokenizer token;
        String arr[][] = new String[N][2];

        for (int i=0; i<N; i++) {
            token = new StringTokenizer(reader.readLine());
            arr[i][0] = token.nextToken();
            arr[i][1] = token.nextToken();
        }

        Arrays.sort(arr, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

        for (int i=0; i<N; i++)
            writer.write(arr[i][0] + " " + arr[i][1] + "\n");

        writer.flush();
        reader.close();
        writer.close();
    }
}
