import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1085 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer token = new StringTokenizer(reader.readLine());

        int x = Integer.parseInt(token.nextToken());
        int y = Integer.parseInt(token.nextToken());
        int w = Integer.parseInt(token.nextToken());
        int h = Integer.parseInt(token.nextToken());

        int distance[] = new int[4];
        distance[0] = x;
        distance[1] = w-x;
        distance[2] = y;
        distance[3] = h-y;

        int min = distance[0];

        for (int i=0; i<4; i++) {
            if (distance[i] < min)
                min = distance[i];
        }

        System.out.printf("%d", min);

        /*
            왼쪽 변까지의 거리 : x
            오른쪽 변까지의 거리 : w - x
            아래쪽 변까지의 거리 : y
            위쪽 변까지의 거리 : h - y
        */
    }
}
