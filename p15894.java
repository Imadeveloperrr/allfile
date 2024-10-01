import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p15894 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Long n = Long.parseLong(reader.readLine());
        System.out.printf("%d", n*4);
    }
}