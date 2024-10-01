import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2566 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[9];
        int i=0,j=0, row=0, column=0;
        int box[][] = new int[9][9];
        int max = -1;

        for (i=0; i<9; i++)
            str[i] = reader.readLine();

        for (i=0; i<9; i++) {
            StringTokenizer token = new StringTokenizer(str[i]);
            for (j=0; j<9; j++) {
                box[i][j] = Integer.parseInt(token.nextToken());
                if (box[i][j] > max) {
                    row = i+1;
                    column = j+1;
                    max = box[i][j];
                }
            }
        }
        System.out.printf("%d\n%d %d", max, row, column);
    }
}
