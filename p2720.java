import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p2720 {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));   
        StringBuilder stb = new StringBuilder();

        int num = Integer.parseInt(reader.readLine());
        
        while (num > 0) {
            int n = Integer.parseInt(reader.readLine());
            while (n > 0) {
                if (n > 24) {
                    stb.append(n/25 + " ");
                    n %= 25;
                } else
                    stb.append("0 ");

                if(n > 9) {
                    stb.append(n/10 + " ");
                    n %= 10;
                } else
                    stb.append("0 ");

                if(n > 4) {
                    stb.append(n/5 + " ");
                    n %= 5;
                } else
                    stb.append("0 ");

                if(n > 0) {
                    stb.append(n/1 + " ");
                    n %= 1;
                } else
                    stb.append("0 ");
            }
            stb.append("\n");
            num--;
        }
        System.out.print(stb);
    }
}
