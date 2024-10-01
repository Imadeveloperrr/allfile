import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int arr[] = new int[n];

        for (int i=0; i<n; i++)
            arr[i] = Integer.parseInt(reader.readLine());    
        
        Arrays.sort(arr);

        for (int i=0; i<n; i++)
            System.out.println(arr[i]);
            
    }
}
