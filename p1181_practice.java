import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class p1181_practice {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        String arr[] = new String[N];

        for (int i=0; i<N; i++)
            arr[i] = reader.readLine();

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String p1, String p2) {
                int p1leng = p1.length();
                int p2leng = p2.length();
                if (p1leng == p2leng)
                    return p1.compareTo(p2);
                return Integer.compare(p1leng, p2leng);
            }
        });

        String prev="";
        for (String str : arr) {
            if(!str.equals(prev))
                System.out.println(str);
            prev = str;
        }

    }    
}
