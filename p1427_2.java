import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1427_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char charArray[] = reader.readLine().toCharArray();

        Arrays.sort(charArray);

        for (int i=charArray.length-1; i>=0; i--) 
            System.out.printf("%c",charArray[i]);
    }
}
