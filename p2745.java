import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2745 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        String str = token.nextToken();
        int len = str.length();
        int num = Integer.parseInt(token.nextToken());
        int result=0;

        for (int i=len-1; i>-1; i--) {
            char c = str.charAt(len-(i+1));
            int multi = num;
            for (int j=0; j<i-1; j++) {
                multi *= num;
            }
            if (i==0)
                multi = 1;
            if (c >= '0' && c <= '9') 
                result += (c - '0') * multi;
            else 
                result += ((c - 'A') + 10) * multi;
        }

        System.out.printf("%d", result);

    }
    
}