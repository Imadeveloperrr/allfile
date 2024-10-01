import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class p1181 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        String arr[] = new String[N];

        for (int i=0; i<N; i++) {
            arr[i] = reader.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String p1, String p2) {
                if (p1.length() == p2.length()) {
                    return p1.compareTo(p2);
                }
                return Integer.compare(p1.length(), p2.length());
            }
        }); 

        String prev = "";
        for (String str : arr) {
            if(!str.equals(prev))
                System.out.println(str);
            prev = str;
        }
            
    }
}
