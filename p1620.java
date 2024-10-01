import java.io.*;
import java.util.*;

public class p1620 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(token.nextToken());
        int m = Integer.parseInt(token.nextToken());

        HashMap<String, Integer> name = new HashMap<>();
        HashMap<Integer, String> number = new HashMap<>();

        String input;
        for (int i=1; i<n+1; i++) {
            input = reader.readLine();
            name.put(input, i);
            number.put(i, input);
        }
            
        StringBuilder stb = new StringBuilder();
        for (int i=1; i<m+1; i++) {
            input = reader.readLine();
            char c = input.charAt(0);
            if(Character.isDigit(c)) {
                stb.append(number.get(Integer.parseInt(input)));
                stb.append("\n");
            } 
            else {
                stb.append(name.get(input));
                stb.append("\n");
            }
                
        }
        System.out.print(stb);
    }

}
