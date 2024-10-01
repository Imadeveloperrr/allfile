import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1316 {
    
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(reader.readLine());
        int i=0, stack=0;

        for (i=0; i<n; i++)
            if (check() == true)
                stack++;

        System.out.println(stack);
    }

    public static boolean check() throws IOException {
        boolean[] v = new boolean[26];
        String group = reader.readLine();
        char prev = group.charAt(0);
        for (int i = 0; i < group.length(); i++) {
            char now = group.charAt(i);
            
            if (prev != now) {
                v[prev - 'a'] = true;
                prev = group.charAt(i);
                if (v[now - 'a'] == true)
                    return false;
            }

        }
        return true;
    }
}