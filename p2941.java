import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2941 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String input = reader.readLine();
        for (String s : cro)
            input = input.replace(s, "*");
        System.out.println(input.length());
        
    }
}