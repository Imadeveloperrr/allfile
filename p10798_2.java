import java.io.BufferedReader;
import java.io.InputStreamReader;


public class p10798_2 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[][] ch = new char[5][15];
        String input[] = new String[5];
        int max=0, i=0;

        for (i=0; i<5; i++)
            input[i] = reader.readLine();

        for (i=0; i<5; i++) {
            if (input[i].length() > max)
                max = input[i].length();
            for (int j=0; j<input[i].length(); j++)
                ch[i][j] = input[i].charAt(j);
        }

        StringBuilder stb = new StringBuilder();
        for (i=0; i<max; i++) {
            for (int j=0; j<5; j++) {
                if(ch[j][i] == '\0') continue;
                stb.append(ch[j][i]);
            }
        }

        System.out.printf("%s",stb);
    }
}
