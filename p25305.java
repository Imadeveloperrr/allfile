import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class p25305 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(token.nextToken());
        int max = Integer.parseInt(token.nextToken())-1;

        Integer arr[] = new Integer[n];
        token = new StringTokenizer(reader.readLine());
        for (int i=0; i<n; i++) 
            arr[i] = Integer.parseInt(token.nextToken());
        
        Arrays.sort(arr, Comparator.reverseOrder());

        System.out.printf("%d", arr[max]);
    }
}
