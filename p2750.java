import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2750 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        
        int arr[] = new int[N];

        for (int i=0; i<N; i++)
            arr[i] = Integer.parseInt(reader.readLine());

        Arrays.sort(arr);

        for (int i=0; i<N; i++)
            System.out.println(arr[i]);
    }
}
