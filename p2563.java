import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2563 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean str[][] = new boolean[100][100];
        int x=0, y=0;
        int total=0;
        int num = Integer.parseInt(reader.readLine());

        for (int i=0; i<num; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine());
            x = Integer.parseInt(token.nextToken());
            y = Integer.parseInt(token.nextToken());    
            for(int j=0; j<10; j++) {
                for (int k=0; k<10; k++) {
                    if (!str[x+j][y+k])
                        total++;
                        str[x+j][y+k] = true;
                }
            }
        }

        System.out.printf("%d", total);

    }
}
