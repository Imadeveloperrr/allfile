import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer; 
import java.util.ArrayList;
import java.util.Collections;

public class p11005 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());
        ArrayList<String> list = new ArrayList<>();
        int rest = 0;

        int N = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());

        while (true) {
            System.out.printf("%d\n", N);
            rest = N%B;
            if (rest >= 10) 
                list.add(String.valueOf((char)(rest+55)));
            else
                list.add(Integer.toString(N%B));
                
            if (B>N) 
                break;
            N=N/B;
        }
        Collections.reverse(list);

        for (String num : list)
            System.out.print(num);
        
    }
    

}
