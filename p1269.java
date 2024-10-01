import java.io.*;
import java.util.*;

public class p1269 {
    public static void main(String [] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input[] = reader.readLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        StringTokenizer token = new StringTokenizer(reader.readLine());
        for (int i=0; i<A; i++)
            setA.add(Integer.parseInt(token.nextToken()));
        
        token = new StringTokenizer(reader.readLine());
        for (int i=0; i<B; i++) {
            int num = Integer.parseInt(token.nextToken());
            if (setA.contains(num)) {
                setA.remove(num);
            }
            else 
                setB.add(num);
        }

        System.out.print(setA.size()+setB.size());
    }    
}