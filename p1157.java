import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p1157 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine().toUpperCase();
        int n[] = new int[26];
        int i=0;
        
        for (i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            n[c - 65] += 1;
        }
        
        int max=0;
        char result='?';
        for (i=0; i<26; i++) {
            if (n[i] > max) {
                max = n[i];
                result = (char) (i + 'A');
            }
            else if(n[i] == max)
                result = '?';
        }

        System.out.println(result);
    }
}