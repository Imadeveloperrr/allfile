import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p10798 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[5];
        StringBuilder stb = new StringBuilder();

        int str_size=0, i=0;

        for (i=0; i<5; i++)
            str[i] = reader.readLine();

        for (i=0; i<5; i++) {
            if(str[i].length() > str_size)
                str_size = str[i].length();
        }

        for (i=0; i<str_size; i++) {
            for (int j=0; j<5; j++) {
                try {
                    stb.append(str[j].charAt(i));
                }
                catch (StringIndexOutOfBoundsException e) {
                    continue;
                }
            }
        }

        System.out.printf("%s", stb);
    }
}
