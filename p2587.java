import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2587 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[5];
        int sum=0;

        for (int i=0; i<5; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
            sum+=arr[i];
        }
            
        Arrays.sort(arr);
        
        int average=sum/5;
        System.out.printf("%d\n%d",average, arr[2]);
    }
}
