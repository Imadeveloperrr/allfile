import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p3009 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stb = new StringBuilder();

        int x[] = new int[3];
        int y[] = new int[3];
        for (int i=0; i<3; i++) {
            StringTokenizer token = new StringTokenizer(reader.readLine());
            x[i] = Integer.parseInt(token.nextToken());
            y[i] = Integer.parseInt(token.nextToken());
        }

        if (x[0] != x[1] && x[0] != x[2])
            stb.append(x[0]);
        else if (x[1] != x[0] && x[1] != x[2]) 
            stb.append(x[1]);
        else if (x[2] != x[0] && x[2] != x[1])
            stb.append(x[2]);
        
        stb.append(" ");
        
        if (y[0] != y[1] && y[0] != y[2])
            stb.append(y[0]);
        else if (y[1] != y[0] && y[1] != y[2]) 
            stb.append(y[1]);
        else if (y[2] != y[0] && y[2] != y[1])
            stb.append(y[2]);
        
        System.out.print(stb);
    }    
}
