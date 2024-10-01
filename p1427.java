import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class p1427 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stb = new StringBuilder(reader.readLine());

        Character charArray[] = new Character[stb.length()];
        for (int i=0; i<stb.length(); i++)
            charArray[i] = stb.charAt(i);
        
        Arrays.sort(charArray, Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (char c : charArray)
            result.append(c);

        System.out.print(result.toString());
        
    }
}
