import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p5086 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());
        int one = Integer.parseInt(token.nextToken());
        int two = Integer.parseInt(token.nextToken());
        while(one>0 && two>0) {
            if (one > two && (one%two)==0)
                System.out.print("multiple\n");
            else if(one < two && (two%one)==0)
                System.out.print("factor\n");
            else
                System.out.print("neither\n");
            token = new StringTokenizer(reader.readLine());
            one = Integer.parseInt(token.nextToken());
            two = Integer.parseInt(token.nextToken());
        }
    }
}