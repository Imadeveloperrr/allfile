import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p9063 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        int x = 0;
        int y = 0;

        int max[] = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        int min[] = {Integer.MAX_VALUE, Integer.MAX_VALUE};

        for (int i=0; i<n; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine());

            x = Integer.parseInt(token.nextToken());
            y = Integer.parseInt(token.nextToken());
            if (x > max[0]) max[0]=x;
            if (x < min[0]) min[0]=x;
            
            if (y > max[1]) max[1]=y;
            if (y < min[1]) min[1]=y;
        }

        System.out.printf("%d", (max[0]-min[0])*(max[1]-min[1]));
    }
}
