import java.io.InputStreamReader;
import java.io.BufferedReader;

public class p1193 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder result= new StringBuilder();
        int n = Integer.parseInt(reader.readLine());
        int total=0;

        for(int i=1; total<n; i++)
        {
            for (int j=1; j<i+1; j++) {
                total++;
                if(n == total) {
                    if(i%2 == 0) {
                        result.append(j).append("/").append((i+1)-j);
                        break;
                    }
                    else {
                        result.append((i+1)-j).append("/").append(j);
                        break;
                    }
                }        
            }
        }

        System.out.print(result);
    }
}
